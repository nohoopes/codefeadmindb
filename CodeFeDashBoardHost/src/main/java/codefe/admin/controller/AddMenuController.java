package codefe.admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codefe.admin.data.FoodDrinkDAO;
import codefe.admin.model.FoodDrink;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/addmenu")
public class AddMenuController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private FoodDrinkDAO fdDao;

    public void init() {
        fdDao = new FoodDrinkDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("menu/addmenu.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String type = request.getParameter("type");
        int status = Integer.parseInt(request.getParameter("status"));
        String code = request.getParameter("code");
        String description = request.getParameter("description");


        FoodDrink fd = new FoodDrink();
        fd.setName(name);
        fd.setPrice(price);
        fd.setType(type);
        fd.setStatus(status);
        fd.setCode(code);
        fd.setDescription(description);
       
        fdDao.saveMenu(fd);

        RequestDispatcher dispatcher = request.getRequestDispatcher("FoodDrinkController");
        dispatcher.forward(request, response);
    }
}