package com.codingdojo.jspprojec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class JspprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspprojectApplication.class, args);
	}
		    @RequestMapping("/")
		    public String index(Model model) {
		    	model.addAttribute("dojoName", "Burbank");
		        return "index.jsp";
		    }
		    
		}
		
