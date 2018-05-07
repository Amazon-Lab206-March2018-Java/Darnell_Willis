package com.codingdojo.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
import javax.servlet.http.HttpSession;

@Controller
public class Gold {
	
	Random rand = new Random();
	Date d = new Date();
	ArrayList<String> stamps = new ArrayList<String>();
	
	 @RequestMapping("/")
	    public String index(HttpSession session) {
		 if (session.getAttribute("gold") == null) {
			 session.setAttribute("gold", 0);
		 }
		 return "index.jsp";
	 	}
	 
	 
	 @RequestMapping(path="/farm", method=RequestMethod.POST)
	    public String farm(HttpSession session, Model model) {
		 
		 //contains the random number
		 int rand_farm = rand.nextInt((20 - 10) + 1) + 10;
		 SimpleDateFormat times = new SimpleDateFormat("MMMM d yyyy - h:mm a");
		 
		 //contains the date and time
		 String message = "You entered a farm and earned " + rand_farm + " gold (" + times.format(d) + ")";
		 int gold = (int) session.getAttribute("gold");

		 session.setAttribute("gold", gold + rand_farm);
		 
		 stamps.add(message);
		 
		 System.out.println("Times " + stamps);
		 System.out.println("Random " + rand_farm);
		 session.setAttribute("stamps", stamps);
		 return "redirect:/";

	 }
	 
	 
	 @RequestMapping(path="/cave", method=RequestMethod.POST)
	    public String cave(HttpSession session) {
		 int rand_cave = rand.nextInt((10 - 5) + 1) + 5;
		 SimpleDateFormat times = new SimpleDateFormat("MMMM d yyyy - hh:mm a");
		 
		//contains the date and time
		 String message = "You entered a cave and earned " + rand_cave + " gold (" + times.format(d) + ")";
		 int gold = (int) session.getAttribute("gold");

		 session.setAttribute("gold", gold + rand_cave);
		 
		 stamps.add(message);
		 
		 System.out.println("Times " + stamps);
		 System.out.println("Random " + rand_cave);
		 session.setAttribute("stamps", stamps);
		 return "redirect:/";

	 }
	 
	 
	 @RequestMapping(path="/house", method=RequestMethod.POST)
	    public String house(HttpSession session) {
		 int rand_house = rand.nextInt((5 - 2) + 1) + 2;
		 SimpleDateFormat times = new SimpleDateFormat("MMMM d yyyy - hh:mm a");
		 
		//contains the date and time
		 String message = "You entered a house and earned " + rand_house + " gold (" + times.format(d) + ")";
		 int gold = (int) session.getAttribute("gold");

		 session.setAttribute("gold", gold + rand_house);
		 
		 stamps.add(message);
		 
		 System.out.println("Times " + stamps);
		 System.out.println("Random " + rand_house);
		 session.setAttribute("stamps", stamps);
		 return "redirect:/";

	 }
	 
	 
	 @RequestMapping(path="/casino", method=RequestMethod.POST)
	    public String casino(HttpSession session) {
		 int rand_casino = rand.nextInt(50);
		 int casino_risks = rand.nextInt(10);
		 SimpleDateFormat times = new SimpleDateFormat("MMMM d yyyy - hh:mm a");
		 
		 if (casino_risks > 5) {
			 
			//contains the date and time
			 String message = "You entered a casino and earned " + rand_casino + " gold (" + times.format(d) + ")";
			 int gold = (int) session.getAttribute("gold");

			 session.setAttribute("gold", gold + rand_casino);
			 
			 stamps.add(message);
			 
			 System.out.println("Times " + stamps);
			 System.out.println("Random " + rand_casino);
			 session.setAttribute("stamps", stamps);
			 
		 }
		 
		 else {
			 
			//contains the date and time
			 String message = "<p class='red'>You entered a casino and earned "+ rand_casino + " gold. (" + times.format(d) + ") </p>";
			 int gold = (int) session.getAttribute("gold");

			 session.setAttribute("gold", gold - rand_casino);
			 
			 stamps.add(message);
			 
			 System.out.println("Times " + stamps);
			 System.out.println("Random " + rand_casino);
			 session.setAttribute("stamps", stamps);
			 
		 }
		 
		 
		 return "redirect:/";

	 }

}
