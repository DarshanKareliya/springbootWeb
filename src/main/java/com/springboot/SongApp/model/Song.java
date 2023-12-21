package com.springboot.SongApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Integer songId;

    @Column(name = "song_name")
    private String songName;
    //private Date releaseDate;

    @ManyToOne()
    private Genre genre;

    @ManyToOne()
    private Album album;

    @ManyToMany
    private List<Artist> artists;

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", genre=" + genre.getGenreName() +
                ", album=" + album.getAlbumName() +
                ", artists=" + artists.toString() +
                '}';
    }
}
