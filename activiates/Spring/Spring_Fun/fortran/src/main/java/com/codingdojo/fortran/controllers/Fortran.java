package com.codingdojo.fortran.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Fortran {
	   @RequestMapping("/")
	   public String index() {
	       return "index.jsp";
	   }
	   
	   @RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	   public String routes(@PathVariable("chapter") String chapter, @PathVariable("assignmentNumber") String assignmentNumber, Model model) {
		   System.out.println(chapter);
		   System.out.println(assignmentNumber);
		   model.addAttribute("result", assignmentNumber);
	       return "redirect:/";
	   }
}
