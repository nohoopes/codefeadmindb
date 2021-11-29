package codefe.admin.controller;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import codefe.admin.model.*;
import codefe.admin.data.*;

/**
 * Servlet implementation class HomeController
 */
public class NumberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO cusDao;
	private FoodDrinkDAO fDao;
	private MessageDAO mDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberController() {
        cusDao = new CustomerDAO();
        fDao = new FoodDrinkDAO();
        mDao = new MessageDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> listCustomer = new ArrayList<Customer>();
		listCustomer = cusDao.listAllCustomer();
        request.setAttribute("listCustomer", listCustomer);
        
        List<FoodDrink> listFoodDrink = new ArrayList<FoodDrink>();
		listFoodDrink = fDao.listAllFoodDrink();
        request.setAttribute("listFoodDrink", listFoodDrink);
        
        List<Message> listMessage = new ArrayList<Message>();
		listMessage = mDao.listAllMessage();
        request.setAttribute("listMessage", listMessage);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/admin.jsp");
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