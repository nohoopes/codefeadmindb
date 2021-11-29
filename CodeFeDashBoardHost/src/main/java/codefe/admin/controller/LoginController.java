package codefe.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codefe.admin.data.*;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1;
    private UserDao loginDao;

    public void init() {
        loginDao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("login/login.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            authenticate(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (loginDao.validate(username, password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("NumberController");
            dispatcher.forward(request, response);
        } else {
        	request.setAttribute("mess", "wrong user or wrong password!!!");
       	 RequestDispatcher dispatcher = request.getRequestDispatcher("login/login.jsp");
            dispatcher.forward(request, response);
            throw new Exception("Login not successful..");
        }
    }
}