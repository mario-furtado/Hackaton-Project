package org.academiadecodigo.be_the_rain.crawler;

import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.academiadecodigo.be_the_rain.services.AntiMaskService;
import org.academiadecodigo.be_the_rain.services.SocialImpService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Component
public class SocialImpactCrawler {

    private SocialImpService socialImpService;
    private Map<String , String> visitedUrls = new HashMap<>();
    private String word;
    private String link = "https://citationsy.com/archives/search.php?CitationsyArchives_search=" ;


    public void init(String word, SocialImpService socialImpService){

        this.word = word;
        this.socialImpService = socialImpService;

        linkTitle(link + word);

    }

    public void linkTitle(String url){

        if(visitedUrls.containsKey(url)){
            return;
        }
        Document doc = null;

        try {
            doc = Jsoup.connect(url).get();

        } catch (IOException e) {
            return;
        }

        //get all links and recursively call the processPage method
        Elements questions = doc.select("a[href]");

        for(Element link: questions) {

            String newUrl = link.attr("href");

            if (newUrl.startsWith("q?doi")) {
                newUrl = "https://citationsy.com/archives/" + newUrl;
                Elements texts = doc.select("div[class]");

                for(Element text : texts){
                    if(text.attr("class").equals("CitationsyArchives_search_result") && !(visitedUrls.containsValue(text.text()))){
                        visitedUrls.put(newUrl,text.text());
                        SocialImpact socialImpact = new SocialImpact();
                        socialImpact.setLink(newUrl);
                        socialImpact.setTitle("Social-Impact");
                        socialImpact.setContent(text.text());
                        socialImpService.persist(socialImpact);
                        break;
                    }
                }
                linkTitle(newUrl);
            }
        }
    }
}
