package com.darnell.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.darnell.web.models.Animal;

/**
 * Servlet implementation class DogSubmit
 */
@WebServlet("/DogSubmit")
public class DogSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Process Request:
        //String name = request.getParameter("name");
        //int age = Integer.parseInt(request.getParameter("age"));
        // Create model
        //Animal person = new Animal(name, breed, weight);
        // Set Model for view
        //request.setAttribute("person", person);
        // Let view handle the request
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/DogSubmit.jsp");
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
