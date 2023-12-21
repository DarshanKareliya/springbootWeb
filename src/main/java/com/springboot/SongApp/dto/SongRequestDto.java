package com.springboot.SongApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongRequestDto {
    private Integer songId;
    private String songName;
    private Integer genreId;
    private String genreName;
    private Integer artistId;
    private String artistName;
    private Integer albumId;
    private String albumName;

}
