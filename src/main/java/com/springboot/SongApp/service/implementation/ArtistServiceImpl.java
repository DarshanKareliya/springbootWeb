package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Artist;
import com.springboot.SongApp.repository.ArtistRepository;
import com.springboot.SongApp.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServiceImpl implements ArtistService {

    ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getAllArtists() {
        return (List<Artist>) artistRepository.findAll();
    }

    @Override
    public Optional<Artist> getArtistById(int id) {
        return artistRepository.findById(id);
    }

    @Override
    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }
}
