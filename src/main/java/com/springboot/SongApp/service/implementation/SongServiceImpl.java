package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.repository.SongRepository;
import com.springboot.SongApp.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {

    SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> getAllSongs() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Optional<Song> getSongById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public void addSong(Song song) {
        songRepository.save(song);
    }
}
