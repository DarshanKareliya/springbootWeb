package com.springboot.SongApp.service;

import com.springboot.SongApp.model.Genre;
import com.springboot.SongApp.model.Song;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    List<Genre> getAllGenres();
    Optional<Genre> getGenreById(int id);
    void addGenre(Genre genre);
}
