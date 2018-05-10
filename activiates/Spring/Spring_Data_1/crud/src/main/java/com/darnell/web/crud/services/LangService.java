package com.darnell.web.crud.services;

import java.util.*;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import com.darnell.web.crud.models.*;
import com.darnell.web.crud.repositories.LangRepository;

@Service
public class LangService {
	
	private LangRepository langRepository;
	public LangService(LangRepository langRepository){
        this.langRepository = langRepository;
    }
	
    
    // returns all within the list
	public List<Language> allLangs(){
        return langRepository.findAll();
    }
	

	public void addLang(Language l) {
		langRepository.save(l);
    }
	
	
	// Displaying the language
	public Language findLangById(Long id) {
        Optional<Language> optionalLang = langRepository.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        }
        else {
            return null;
        }
    }
	
	
	// Updating the language
	public void updateLang(Language langs) {
        langRepository.save(langs);
        System.out.println("The ID of the updated Language " + langs.getId());
    }
	
	
	// Deleting the Language
	public void destroyLang(Long id) {
		langRepository.deleteById(id);
    }
	
}
