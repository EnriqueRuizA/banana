package com.generation.jwd.p1.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestTaskServlet
 */
@WebServlet("/testask")
public class TestTaskServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestTaskServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
    	HttpSession session = request.getSession();
        
        if (session.getAttribute("saveTask") == null) {
        	session.setAttribute("noSaveTask", "NO TASK");
        } else {
            session.setAttribute("noSaveTask", null);
        }
        response.sendRedirect("testask.jsp");
    }
}
