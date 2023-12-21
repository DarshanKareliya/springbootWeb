package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Artist;
import com.springboot.SongApp.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService  {

    ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    public List<Artist> getAllArtists() {
        return (List<Artist>) artistRepository.findAll();
    }


    public Optional<Artist> getArtistById(int id) {
        return artistRepository.findById(id);
    }


    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }
}
