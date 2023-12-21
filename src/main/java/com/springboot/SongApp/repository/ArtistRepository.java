package com.springboot.SongApp.repository;

import com.springboot.SongApp.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends CrudRepository<Artist,Integer> {
}
