package com.example.oaut2github.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken token) {
        return "Hello, " + token.getPrincipal().getAttribute("name");
    }
}
