package com.springboot.SongApp.controller;

import com.springboot.SongApp.model.Genre;
import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.repository.GenreRepository;
import com.springboot.SongApp.service.GenreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GenreController {

    GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @RequestMapping("/genres")
    public List<Genre> getGenres(){
        return genreService.getAllGenres();
    }

    @RequestMapping("/genre/{id}")
    public Genre getGenre(int id){
        Optional<Genre> genre=genreService.getGenreById(id);
        return genre.orElse(new Genre());
    }

    @RequestMapping("/addGenre")
    public void addGenre(Genre genre){
        genreService.addGenre(genre);
    }
}
