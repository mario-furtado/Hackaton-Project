package org.academiadecodigo.be_the_rain.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "antiVax")
public class AntiVax extends AbstractModel{

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
