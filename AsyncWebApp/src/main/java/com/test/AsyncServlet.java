package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncServlet
 */
@WebServlet(urlPatterns="/AsyncServlet",asyncSupported=true)
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		final long starttime=System.nanoTime();
		
		final AsyncContext ay=request.getAsyncContext();
		
		new Thread()
		{
			@Override
			public void run(){
				try {
					
					ServletResponse response= ay.getResponse();
					response.setContentType("text/html");
					PrintWriter out=response.getWriter();
					Thread.sleep(4000);
					out.println("Work completed time elapsed: "+(System.nanoTime()-starttime));
					out.flush();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
	}

}
