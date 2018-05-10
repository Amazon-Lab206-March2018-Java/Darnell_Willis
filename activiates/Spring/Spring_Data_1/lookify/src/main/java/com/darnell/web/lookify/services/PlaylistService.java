package com.darnell.web.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darnell.web.lookify.models.*;
import com.darnell.web.lookify.repositories.*;

@Service
public class PlaylistService {
	
	
	private PlaylistRepository songRepository;
	public PlaylistService(PlaylistRepository songRepository){
        this.songRepository = songRepository;
    }
	
	// returns all within the list
	public List<Playlist> allSongs(){
	       return songRepository.findAll();
	 }
		

	public void addSong(Playlist s) {
		songRepository.save(s);
	 }
	
	
	// Displaying the Song
	public Playlist findSongById(Long id) {
	      Optional<Playlist> song = songRepository.findById(id);
	      if(song.isPresent()) {
	          return song.get();
	      }
	      else {
	          return null;
	      }
	 }
	
	
	
	// Deleting the Song
	public void destroySong(Long id) {
		songRepository.deleteById(id);
	}


	// Search Results
	public List<Playlist> searchByArtist(String search) {
		return songRepository.findByArtist(search);
	}
	
	
	
	// Search Results
	public List<Playlist> topTenRating() {
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	
	
}
