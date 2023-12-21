package com.springboot.SongApp.repository;

import com.springboot.SongApp.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song,Integer> {
}
