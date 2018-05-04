package com.codingdojo.displaydate.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@SpringBootApplication

@Controller
public class Dates {
	
	Date d = new Date();
	
   @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
   
   SimpleDateFormat dates = new SimpleDateFormat ("EEEEE, d MMMM, yyyy");
   
   @RequestMapping("/date")
   public String date(Model model) {
	   model.addAttribute("date", dates.format(d));
       return "date.jsp";
   }
   
   SimpleDateFormat times = new SimpleDateFormat ("hh:mm a");
   
   @RequestMapping("/time")
   public String time(Model model) {
	   model.addAttribute("time", times.format(d));
       return "time.jsp";
   }
   
}
