package com.darnell.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darnell.strings.StringsApplication;
@SpringBootApplication
// 1. Annotation
@RestController
public class StringsApplication {

	public static void main(String[] args) {
        SpringApplication.run(StringsApplication.class, args);
}

		@RequestMapping("/")
		public String doing() {
		        return "<p>Hello client!! How are you doing?</p>";
		}
		
		@RequestMapping("/random")
		public String great() {
		        return "<p>String Boot is great! So easy to just respond with strings</p>";
		}
		
}
