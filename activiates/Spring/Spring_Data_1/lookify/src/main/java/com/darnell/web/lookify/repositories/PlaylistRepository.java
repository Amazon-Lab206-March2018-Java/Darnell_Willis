package com.darnell.web.lookify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.darnell.web.lookify.models.Playlist;

	@Repository
	public interface PlaylistRepository extends CrudRepository<Playlist, Long> {
		List<Playlist> findAll();
		
		List<Playlist> findByArtist(String search);

		List<Playlist> findTop10ByOrderByRatingDesc();
	}
