package com.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginpage extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		
		String employeeName = "null";
		int employeeid = 0;
		
		employeeName = (String)request.getParameter( "form_employee_name" );
		employeeid=  Integer.parseInt(request.getParameter("form_employee_id"));
		
		if(!employeeName.matches("[a-zA-Z_]+"))
		{
			try{
				
		        throw new Notalphabetexception("Enter an alphabet"); 
		      
		        
		   }catch(Notalphabetexception e){out.println("Exception occured");out.println(e.getMessage());}
		}
		
		
		
	}
	
	
	
	
}
