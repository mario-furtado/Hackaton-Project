package org.academiadecodigo.be_the_rain.Dto;

import org.springframework.stereotype.Component;

@Component
public class DtoInstitution {

    private String title;
    private String content;
    private String link;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
