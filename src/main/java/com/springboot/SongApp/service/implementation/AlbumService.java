package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Album;
import com.springboot.SongApp.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }


    public List<Album> getAllAlbums() {
        return (List<Album>) albumRepository.findAll();
    }


    public Optional<Album> getAlbumById(int id) {
        return albumRepository.findById(id);
    }


    public void addAlbum(Album album) {
        albumRepository.save(album);

    }
}
