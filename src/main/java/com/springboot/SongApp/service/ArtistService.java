package com.springboot.SongApp.service;

import com.springboot.SongApp.model.Artist;
import com.springboot.SongApp.model.Song;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    List<Artist> getAllArtists();
    Optional<Artist> getArtistById(int id);
    void addArtist(Artist artist);
}
