package com.springboot.SongApp.controller;

import com.springboot.SongApp.service.implementation.ArtistService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {

    ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    /*@RequestMapping("/artists")
    public List<Artist> getArtists(){
        return artistService.getAllArtists();
    }

    @RequestMapping("/artist/{id}")
    public Artist getArtist(int id){

        Optional<Artist> artist=artistService.getArtistById(id);
        return artist.orElse(new Artist());
    }

    @RequestMapping("/addArtist")
    public void addArtist(Artist artist){
        artistService.addArtist(artist);
    }*/
}
