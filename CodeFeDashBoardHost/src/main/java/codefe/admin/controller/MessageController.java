package codefe.admin.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codefe.admin.model.*;
import codefe.admin.data.*;

/**
 * Servlet implementation class HomeController
 */
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MessageDAO mDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageController() {
        mDao = new MessageDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Message> listMessage = new ArrayList<Message>();
		listMessage = mDao.listAllMessage();
        request.setAttribute("listMessage", listMessage);
        RequestDispatcher dispatcher = request.getRequestDispatcher("message/message.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}