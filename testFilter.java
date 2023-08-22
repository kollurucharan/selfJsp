package com.charan;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class testFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String name1 = request.getParameter("name");
		String password1 = request.getParameter("password");
		System.out.println(name1);
		System.out.println(password1);
		if (password1.equals("9875")) {
			RequestDispatcher rd = request.getRequestDispatcher("self.jsp");
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("cart.html");
			rd.include(request, response);
		}

	}

}
