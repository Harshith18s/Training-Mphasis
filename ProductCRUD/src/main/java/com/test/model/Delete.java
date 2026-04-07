package com.test.model;

import java.io.IOException;

import com.test.dao.ProductDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@jakarta.servlet.annotation.WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id=request.getParameter("id");
		 ProductDaoImpl pimpl=new ProductDaoImpl();
		 int x=pimpl.deleteProductById(id);
		 response.sendRedirect("delete.jsp");
	}

}
