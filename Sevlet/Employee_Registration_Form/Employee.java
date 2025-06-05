package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employeesubmit")
public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String id1=request.getParameter("empId");
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String email1=request.getParameter("email");
		String phone1=request.getParameter("phone");
		String dob1=request.getParameter("dob");
		String gender1=request.getParameter("gender");
		String add1=request.getParameter("address");
		String city1=request.getParameter("city");
		String state1=request.getParameter("state");
		String country1=request.getParameter("country");
		String dept1=request.getParameter("department");
		String desig1=request.getParameter("designation");
		String doj1=request.getParameter("doj");
		String sal1=request.getParameter("salary");
		String exp1=request.getParameter("experience");
		String lang1=request.getParameter("language");
		
		System.out.println(id1);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email1);
		System.out.println(phone1);
		System.out.println(dob1);
		System.out.println(gender1);
		System.out.println(add1);
		System.out.println(city1);
		System.out.println(state1);
		System.out.println(country1);
		System.out.println(dept1);
		System.out.println(desig1);
		System.out.println(doj1);
		System.out.println(sal1);
		System.out.println(exp1);
		System.out.println(lang1);
		
		PrintWriter out=response.getWriter();
		
	     out.print(id1);
		out.print(fname);
		out.print(lname);
		out.print(email1);
		out.print(phone1);
		out.print(dob1);
		out.print(gender1);
		out.print(add1);
		out.print(city1);
		out.print(state1);
		out.print(country1);
		out.print(dept1);
		out.print(desig1);
		out.print(doj1);
		out.print(sal1);
		out.print(exp1);
		out.print(lang1);
		
		
	}

}
