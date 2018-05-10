package com.darnell.web.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darnell.web.crud.models.Language;
import com.darnell.web.crud.services.LangService;

@Controller
public class Lang {
	
	private final LangService langService;
	public Lang(LangService langService) {
		this.langService = langService;
	}

	
	@RequestMapping("/")
    public String index()  {
		return "redirect:/languages";
	}
	
	
	@RequestMapping("/languages")
    public String langs(@ModelAttribute("lang") Language lang, Model model) {
		List<Language> languages = langService.allLangs();
		model.addAttribute("all_langs", languages);
		return "index.jsp";
	}
	
	
	@RequestMapping(path="/lang/new", method=RequestMethod.POST)
	public String newBook(@Valid @ModelAttribute("lang") Language lang, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index.jsp";
        }
		else {
            // Add the Language
			langService.addLang(lang);
			model.addAttribute("all_langs", langService.allLangs());
            return "redirect:/languages";
        }
    }
	
	
	// Displaying the selected language
	@RequestMapping(path="/languages/{id}")
	public String display(@PathVariable("id") Long id, Model model) {
        model.addAttribute("current_lang", langService.findLangById(id));
		return "display.jsp";
	}
	
	
	
	// Updating the language - GET
	@RequestMapping(path="/languages/update/{id}", method=RequestMethod.GET)
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("lang") Language lang, Model model) {
		Language langs = langService.findLangById(id);
		if(lang != null) {
			model.addAttribute("current_lang", langs);
			return "update.jsp";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	
	// Updating the language - POST
	@Transactional
	@RequestMapping(path="/languages/update/{id}", method=RequestMethod.POST)
	public String update(@PathVariable Long id, @Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {
            return "update.jsp";
        }
		else {
			lang.setId(id);
            langService.updateLang(lang);
            return "redirect:/languages";
        }
	}
	
	
	
	// Deleting the languages
	@RequestMapping(value="/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		langService.destroyLang(id);
		return "redirect:/languages";
	}
	
	
}
