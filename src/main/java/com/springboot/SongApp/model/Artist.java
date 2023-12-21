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
@Table(name = "artists")
public class Artist {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Integer artistId;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "artist_age")
    private Integer artistAge;

    @ManyToMany
    private List<Song> songs;

    @ManyToMany
    private List<Album> albums;

}
