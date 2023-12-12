package com.example.sbbap;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyService {
    private static final String rickAndMortyApi = "https://rickandmortyapi.com/";

    private WebClient webClient;

    public RickAndMortyService(WebClient webClient) {
        this.webClient = webClient;
    }

   public RickAndMortyCharacter getCharacterById(int characterId)  {
        return webClient.get()
                .uri("/character/{id}", characterId)
                .retrieve()
                .toEntity(RickAndMortyCharacter.class)
                .block()
                .getBody();
   }

   public List<RickAndMortyCharacter> getAllCharacters() {
        return webClient.get()
                .uri("/character")
                .retrieve()
                .toEntityList(RickAndMortyCharacter.class)
                .block()
                .getBody();

   }
}

