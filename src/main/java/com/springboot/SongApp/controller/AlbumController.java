package com.springboot.SongApp.controller;

import com.springboot.SongApp.service.implementation.AlbumService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
    AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }



    /*@RequestMapping("/albums")
    public List<Album> getAlbums(){
        return albumService.getAllAlbums();
    }

    @RequestMapping("/album/{id}")
    public Album getAlbum(int id){

        Optional<Album> album=albumService.getAlbumById(id);
        return album.orElse(new Album());
    }

    @RequestMapping("/addAlbum")
    public void addAlbum(Album album){
        albumService.addAlbum(album);
    }*/
}
