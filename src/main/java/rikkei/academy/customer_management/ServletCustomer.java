package rikkei.academy.customer_management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", value = "")
public class ServletCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("mai van hoan","1983-08-20","ha noi","image/img.png"));
        customerList.add(new Customer("nguyen van nam","1983-08-21","bac giang","image/img.png"));
        customerList.add(new Customer("nguyen thai hoa","1983-08-22","nam dinh","image/img.png"));
        customerList.add(new Customer("tran dag khoa","1983-08-17","ha tay","image/img.png"));

        RequestDispatcher rd  = request.getRequestDispatcher("showResult.jsp");
        request.setAttribute("customerList",customerList);
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
