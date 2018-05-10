package com.darnell.web.crud.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darnell.web.crud.models.Language;

@Repository
public interface LangRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
}
