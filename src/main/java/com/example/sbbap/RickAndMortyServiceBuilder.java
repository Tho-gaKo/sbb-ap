package com.example.sbbap;

import org.springframework.web.reactive.function.client.WebClient;

public class RickAndMortyServiceBuilder {
    private WebClient webClient;

    public RickAndMortyServiceBuilder setWebClient(WebClient webClient) {
        this.webClient = webClient;
        return this;
    }

    public RickAndMortyService createRickAndMortyService() {
        return new RickAndMortyService(webClient);
    }
}