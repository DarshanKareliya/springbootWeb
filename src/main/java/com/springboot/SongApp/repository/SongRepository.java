package com.springboot.SongApp.repository;

import com.springboot.SongApp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song,Integer> , JpaSpecificationExecutor<Song> {

    Optional<Song> findBySongName(String songName);

}
