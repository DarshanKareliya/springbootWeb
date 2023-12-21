package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Album;
import com.springboot.SongApp.repository.AlbumRepository;
import com.springboot.SongApp.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService{
    AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> getAllAlbums() {
        return (List<Album>) albumRepository.findAll();
    }

    @Override
    public Optional<Album> getAlbumById(int id) {
        return albumRepository.findById(id);
    }

    @Override
    public void addAlbum(Album album) {
        albumRepository.save(album);

    }
}
