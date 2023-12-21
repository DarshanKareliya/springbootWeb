package com.springboot.SongApp.controller;


import com.springboot.SongApp.dto.SongRequestDto;
import com.springboot.SongApp.dto.SearchRequestDto;
import com.springboot.SongApp.dto.SongDto;
import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.service.implementation.SongService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

@RestController
@Component
public class SongController {

    SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping(value = "/getsong")
    public void getSongByName(@RequestBody SongDto dto){

        List<SearchRequestDto> searchRequestDtos =songService.validRequests(dto);
        List<Song> songs=songService.getSong(searchRequestDtos);

    }

    //localhost:8080/getSongs
    //body: {
    //    "songName":"Earth Song"
    //}

    @RequestMapping(value = "/getSongs")
    public List<Song> getSong(@RequestBody SongRequestDto songRequestDto){
        System.out.println(songRequestDto);
        Field[] fields=songRequestDto.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println("The field is: " + fields[i].toString());
            System.out.println(fields[i].getName());

        }

        List<SearchRequestDto> searchRequestDtos=songService.requestToSearchRequest(songRequestDto);

        List<Song> requestedSongs=songService.getSongs(searchRequestDtos);
        System.out.println(requestedSongs);

        return null;
    }

    /*@RequestMapping("/songs")
    public List<Song> getSongs(){
       return songService.getAllSongs();
    }

    *//*@RequestMapping("/song/{id}")
    public Song getSong(@PathVariable(name = "id") int id){

        Optional<Song> song=songService.getSongById(id);
        return song.orElse(new Song());
    }*//*

    @RequestMapping("/addSong")
    public void addSong(Song song){
        songService.addSong(song);
    }

    *//*@RequestMapping(value = "/getsong")
    public Song getSongById(@RequestBody SongDto songDto){
        Optional<Song> song=null;
        boolean idPresent= Objects.nonNull(songDto.getId());
        boolean namePresent=Objects.nonNull(songDto.getName());
        System.out.println(songDto.getId());
        System.out.println(songDto.getName());
        if (idPresent){
            song=songService.getSongById(songDto.getId());

//            return song.orElse(new Song());
        }
        else if (namePresent){
            song=songService.getSongByName(songDto.getName());

//            return song.orElse(new Song());
        }
        return song.orElse(new Song());
       *//**//* Optional<Song> song=songService.getSongById(id);

        return song.orElse(new Song());*//**//*
    }*/

}
