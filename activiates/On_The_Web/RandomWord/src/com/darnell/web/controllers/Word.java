package com.darnell.web.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Word
 */
@WebServlet("/")
public class Word extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Word() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		//For the session counter
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		else {
			int count = (Integer)session.getAttribute("counter");
			count++;
			session.setAttribute("counter", count);
		}
		
		
		//For the random string
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        session.setAttribute("word", saltStr);
        
        
        //For the date time
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("MMMM dd, yyyy - hh:mm a");
        //String dateFormat = String.format("%1$s - hh:mm a zzz", d);
        session.setAttribute("date", ft.format(d));
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/random.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
