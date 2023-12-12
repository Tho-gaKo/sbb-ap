package com.example.sbbap;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rickandmorty")
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;

    @GetMapping
    public List<RickAndMortyCharacter> getAllCharacters() {
        return rickAndMortyService.getAllCharacters();
    }

    @GetMapping("/rickandmorty/characters/{id}")
    public RickAndMortyCharacter getCharacterById(@PathVariable int id) {
        return rickAndMortyService.getCharacterById(id);
    }




}
