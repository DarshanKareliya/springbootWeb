package com.springboot.SongApp.repository;

import com.springboot.SongApp.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
