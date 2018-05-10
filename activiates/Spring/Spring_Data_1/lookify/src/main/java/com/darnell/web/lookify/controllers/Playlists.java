package com.darnell.web.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.darnell.web.lookify.models.Playlist;
import com.darnell.web.lookify.services.PlaylistService;

@Controller
public class Playlists {
	
	private final PlaylistService playlistService;
	public Playlists(PlaylistService playlistService) {
		this.playlistService = playlistService;
	}
	
	@RequestMapping("/")
    public String index()  {
		return "index.jsp";
	}
	
	
	@RequestMapping("/dashboard")
    public String dash(@ModelAttribute("search") Playlist search, Model model)  {
		List<Playlist> songs = playlistService.allSongs();
		model.addAttribute("all_songs", songs);
		return "dash.jsp";
	}
	
	
	@RequestMapping("/songs/new")
    public String newSongs(@ModelAttribute("song") Playlist addSong)  {
		return "addNew.jsp";
	}
	
	
	
	
	// Searching for Artist
	@RequestMapping("/search")
    public String search(@RequestParam("search") String search, Model model)  {
		System.out.println("Search Artist: " + search);
		List<Playlist> s = playlistService.searchByArtist(search);
		model.addAttribute("results", s);
		model.addAttribute("artist", search);
		return "search.jsp";
	}
	
	
	
	
	// Displaying the Top Ten
	@RequestMapping("/search/topTen")
	public String topTen(Model model)  {
		List<Playlist> results = playlistService.topTenRating();
		model.addAttribute("results", results);
		return "top_ten.jsp";
	}
	
	
	
	// Creating the new Song
	@RequestMapping(path="/song/create", method=RequestMethod.POST)
    public String newcreate(@Valid @ModelAttribute("song") Playlist addSong, BindingResult result, Model model)  {
		System.out.println("Form Submission: " + addSong);
		if (result.hasErrors()) {
			return "addNew.jsp";
        }
		else {
            // Adds the Song
			playlistService.addSong(addSong);
			model.addAttribute("all_songs", playlistService.allSongs());
            return "redirect:/dashboard";
        }
	}
	
	
	// Displaying the selected Song
	@RequestMapping("/song/{id}")
	public String display(@PathVariable("id") Long id, Model model) {
		Playlist song = playlistService.findSongById(id);

	    model.addAttribute("current_song", playlistService.findSongById(id));
		return "display.jsp";
	}
	
	
	
	
	
	
	// Deleting the Song
	@RequestMapping(value="/song/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		playlistService.destroySong(id);
		return "redirect:/dashboard";
		}
	
	
}
