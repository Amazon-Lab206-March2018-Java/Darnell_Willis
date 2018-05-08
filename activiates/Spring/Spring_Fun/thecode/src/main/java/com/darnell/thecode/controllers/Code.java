package com.darnell.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Code {

	@RequestMapping("/")
    public String index(@ModelAttribute("errors") String errors) {
		System.out.println(errors);
        return "index.jsp";
    }
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
    public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {	
		if (!code.equals("bushido")) {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
		return "code.jsp";			
		
    }

	
}
