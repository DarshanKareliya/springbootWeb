package com.springboot.SongApp.service.implementation;

import com.springboot.SongApp.dto.SearchRequestDto;
import com.springboot.SongApp.dto.SongDto;
import com.springboot.SongApp.dto.SongRequestDto;
import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.repository.SongRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SongService {

    SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<SearchRequestDto> validRequests(SongDto songDto){
        List<SearchRequestDto> searchRequestDtos =new ArrayList<>();
        if (Objects.nonNull(songDto.getId())){
            searchRequestDtos.add(new SearchRequestDto("songId",Integer.toString(songDto.getId())));
        }
        if(Objects.nonNull(songDto.getName())){
            searchRequestDtos.add(new SearchRequestDto("songName",songDto.getName()));
        }
        if (Objects.nonNull(songDto.getGenre())) {
            searchRequestDtos.add(new SearchRequestDto("genre",songDto.getGenre()));
        }
        if (Objects.nonNull(songDto.getMonth())) {
            searchRequestDtos.add(new SearchRequestDto("month",songDto.getMonth()));
        }
        return searchRequestDtos;
    }


    public List<Song> getSong(List<SearchRequestDto> songDto){

        Specification<Song> songSpecification=new Specification<Song>() {
            @Override
            public Predicate toPredicate(Root<Song> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates=new ArrayList<>();
                for (SearchRequestDto searchRequestDto:songDto){
                    Predicate equal=criteriaBuilder.equal(root.get(searchRequestDto.getColum()),searchRequestDto.getValue());
                    predicates.add(equal);
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };

        List<Song> songs=songRepository.findAll(songSpecification);
        System.out.println(songs);
        return songs;

    }

    public List<SearchRequestDto> requestToSearchRequest(SongRequestDto songRequestDto) {
        List<SearchRequestDto> searchRequestDtos=new ArrayList<>();

        if (Objects.nonNull(songRequestDto.getSongId())){
            searchRequestDtos.add(new SearchRequestDto("songId",Integer.toString(songRequestDto.getSongId())));
        }
        if(Objects.nonNull(songRequestDto.getSongName())){
            searchRequestDtos.add(new SearchRequestDto("songName",songRequestDto.getSongName()));
        }
        if (Objects.nonNull(songRequestDto.getGenreId())) {
            searchRequestDtos.add(new SearchRequestDto("genre",Integer.toString(songRequestDto.getGenreId())));
        }
        if (Objects.nonNull(songRequestDto.getGenreName())) {
            searchRequestDtos.add(new SearchRequestDto("month",songRequestDto.getGenreName()));
        }
        if (Objects.nonNull(songRequestDto.getArtistId())){
            searchRequestDtos.add(new SearchRequestDto("songId",Integer.toString(songRequestDto.getArtistId())));
        }
        if(Objects.nonNull(songRequestDto.getArtistName())){
            searchRequestDtos.add(new SearchRequestDto("songName",songRequestDto.getArtistName()));
        }
        if (Objects.nonNull(songRequestDto.getAlbumId())) {
            searchRequestDtos.add(new SearchRequestDto("genre",Integer.toString(songRequestDto.getAlbumId())));
        }
        if (Objects.nonNull(songRequestDto.getAlbumName())) {
            searchRequestDtos.add(new SearchRequestDto("month",songRequestDto.getAlbumName()));
        }
        System.out.println(searchRequestDtos);

        return searchRequestDtos;
    }

    public List<Song> getSongs(List<SearchRequestDto> searchRequestDtos) {

        Specification<Song> songSpecification=new Specification<Song>() {
            @Override
            public Predicate toPredicate(Root<Song> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates=new ArrayList<>();
                for (SearchRequestDto searchRequestDto:searchRequestDtos){
                    Predicate equal=criteriaBuilder.equal(root.get(searchRequestDto.getColum()),searchRequestDto.getValue());
                    predicates.add(equal);
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        };

        List<Song> songs=songRepository.findAll(songSpecification);

//        System.out.println(songs);


        return songs;
    }
























    /*public List<Song> getAllSongs() {
        return (List<Song>) songRepository.findAll();
    }


    public Optional<Song> getSongById(int id) {
        return songRepository.findById(id);
    }

    public void addSong(Song song) {
        songRepository.save(song);
    }*/


}
