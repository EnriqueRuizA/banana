package com.generation.jwd.p1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generation.jwd.p1.beans.*;

/**
 * Servlet implementation class TaskServlet
 */
@WebServlet("/createtask")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 TaskBean task = new TaskBean();
	     task.setNameTask(request.getParameter("nameTask"));
	     task.setDescription(request.getParameter("description"));
	     task.setdateStart(request.getParameter("dateStart"));
	     task.setdateFinish(request.getParameter("dateFinish"));
	     task.setNotes(request.getParameter("notes"));
	     task.setResponsable(request.getParameter("responsable"));
	     task.setPriority(request.getParameter("priority"));
	     task.setUrlFile(request.getParameter("urlFile"));
	        
	     HttpSession session_name= (HttpSession)request.getSession();
	        
	     if(task.validate() == true) {
	    	 session_name.setAttribute("saveTask", "A new task has been created");
	    	 session_name.setAttribute("task", task.getNameTask());
	         request.getRequestDispatcher("homeuser.jsp").forward(request, response);
	     } else {
	    	 session_name.setAttribute("saveTask", "error: a new task has not created");
	         request.getRequestDispatcher("createtask.jsp").forward(request, response);
	     }
	 }
}