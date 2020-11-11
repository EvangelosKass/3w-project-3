package com.askisi.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addnew")
public class Addnew extends HttpServlet {
       
	private static final long serialVersionUID = 1L;


	public Addnew() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String barcodeParam = request.getParameter("barcode");
		String nameParam = request.getParameter("name");
		String colorParam = request.getParameter("color");
		String descriptionParam = request.getParameter("description");
		
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "askisi3" );
	      
	    EntityManager entitymanager = emfactory.createEntityManager( );
	    entitymanager.getTransaction( ).begin( );
	    
	    Product p= new Product(barcodeParam,nameParam,colorParam,descriptionParam);
	    entitymanager.persist( p );
	    try {
	    	entitymanager.getTransaction( ).commit( );
	    	RequestDispatcher view = request.getRequestDispatcher("result.jsp");
			view.forward(request, response);
	    }catch (Exception e) {
	    	if(e.getMessage().contains("UNIQUE constraint failed")) {
				showExistsError(response,barcodeParam);
			}else {
				e.printStackTrace();
			}
	    }finally {
	    	entitymanager.close( );
	    	emfactory.close( );
	    }
	    
	    


		
	}
	
	
	private void showExistsError(HttpServletResponse response,String barcode) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Error<br>Product with barcode "+barcode+" already exists<br><a href=\"/askisi3\">back</a>");
	}
		

}
