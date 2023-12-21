package com.springboot.SongApp;

import com.springboot.SongApp.controller.SongController;
import com.springboot.SongApp.model.Song;
import com.springboot.SongApp.service.SongService;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Log
@SpringBootApplication
public class SongAppApplication implements CommandLineRunner{

	SongService songService;

	public static void main(String[] args) {
		SpringApplication.run(SongAppApplication.class, args);
	}


	@Override
	public void run(String... args){
		SongController songController=new SongController(songService);
		List<Song> songs=songController.getSongs();
		System.out.println(songs);

	}
}
