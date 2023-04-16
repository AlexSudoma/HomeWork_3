package com.example.homework3;

import org.springframework.web.bind.annotation.GetMapping;

public class QuoteHtmlController {
    @GetMapping("/quotes")
    public String getQuotesPage() {
        return "quotes.html";
    }
}
