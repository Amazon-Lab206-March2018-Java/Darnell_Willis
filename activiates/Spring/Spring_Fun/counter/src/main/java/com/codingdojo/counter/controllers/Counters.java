package com.codingdojo.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class Counters {
	
	int counters = 0;
	
	@RequestMapping("/")
    public String index(HttpSession session) {
		counters++;
		System.out.println("Counters " + counters);
		
		session.setAttribute("count", counters);
		Integer count = (Integer) session.getAttribute("count");
		System.out.println("count " + count);
		count++;
		System.out.println("count going up " + count);
        return "index.jsp";
    }
	
	@RequestMapping("/counter")
    public String counts(Model model) {
		model.addAttribute("total", counters);
        return "counter.jsp";
    }
}
