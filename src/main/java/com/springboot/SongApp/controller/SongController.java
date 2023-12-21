package com.springboot.SongApp.controller;


import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.service.SongService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Component
public class SongController {

    SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/songs")
    public List<Song> getSongs(){
       return songService.getAllSongs();
    }

    @RequestMapping("/song/{id}")
    public Song getSong(int id){

        Optional<Song> song=songService.getSongById(id);
        return song.orElse(new Song());
    }

    @RequestMapping("/addSong")
    public void addSong(Song song){
        songService.addSong(song);
    }
}
