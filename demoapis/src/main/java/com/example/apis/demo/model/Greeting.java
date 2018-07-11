package com.example.apis.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Greeting {
    private long id;
    private String content;
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }




    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }



}
