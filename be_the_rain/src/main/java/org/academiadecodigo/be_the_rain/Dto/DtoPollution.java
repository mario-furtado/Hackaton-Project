package org.academiadecodigo.be_the_rain.Dto;

import org.springframework.stereotype.Component;

@Component
public class DtoPollution {

    private String title;
    private String content;

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