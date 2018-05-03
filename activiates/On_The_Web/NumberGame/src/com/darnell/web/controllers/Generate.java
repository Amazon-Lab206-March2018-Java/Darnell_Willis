package com.darnell.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Generate
 */
@WebServlet("/Generate")
public class Generate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Generate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		// For the random number
		Random rand = new Random();
		
		int randNum = rand.nextInt(100);	
		
		session.setAttribute("rand", randNum);
		
		System.out.println("-------");
		
		System.out.println("Random Session Number: " + session.getAttribute("rand"));
		
		
		int guess = Integer.parseInt(request.getParameter("guess"));
		//String guess = request.getParameter("guess");
		
		if (guess == randNum) {
			System.out.println("You are correct");
		}
		else if (guess > randNum) {
			System.out.println("Too high!");
		}
		else {
			System.out.println("Too low!");
		}
		
		System.out.println("The Guessed Number " + guess);
		
		response.sendRedirect("/NumberGame/");
	}

}
