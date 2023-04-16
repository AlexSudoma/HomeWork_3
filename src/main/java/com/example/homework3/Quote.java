package com.example.homework3;

import javax.validation.constraints.Size;

public class Quote {

    @Size(max = 40, message = "Text cannot be longer than 40 characters")
    private String quote;
    private int id;

    public Quote(String quote, int id) {
        this.quote = quote;
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

