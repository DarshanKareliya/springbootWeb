package com.springboot.SongApp.service;

import com.springboot.SongApp.model.Album;
import com.springboot.SongApp.model.Song;

import java.util.List;
import java.util.Optional;

public interface AlbumService {

    List<Album> getAllAlbums();
    Optional<Album> getAlbumById(int id);
    void addAlbum(Album album);
}
