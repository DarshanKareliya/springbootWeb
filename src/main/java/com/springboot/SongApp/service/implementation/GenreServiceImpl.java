package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Genre;
import com.springboot.SongApp.repository.GenreRepository;
import com.springboot.SongApp.service.GenreService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {

    GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> getAllGenres() {
        return (List<Genre>)genreRepository.findAll();
    }

    @Override
    public Optional<Genre> getGenreById(int id) {
        return genreRepository.findById(id);
    }

    @Override
    public void addGenre(Genre genre) {
        genreRepository.save(genre);
    }
}
