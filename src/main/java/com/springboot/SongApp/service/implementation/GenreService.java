package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Genre;
import com.springboot.SongApp.repository.GenreRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GenreService  {

    GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }


    public List<Genre> getAllGenres() {
        return (List<Genre>)genreRepository.findAll();
    }


    public Optional<Genre> getGenreById(int id) {
        return genreRepository.findById(id);
    }


    public void addGenre(Genre genre) {
        genreRepository.save(genre);
    }
}
