package servlet;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(description="Servlet Calculator", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID =1L;
    String operator;
    double value1;
    double value2;
    double result;



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        value1 = Double.valueOf(request.getParameter("value1"));
        operator = request.getParameter("operator");
//        value2 = Double.valueOf(request.getParameter("value2"));
//        calculate(operator,value1,value2);
        changeDegree(operator,value1);
        request.setAttribute("result",new Double(result));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("page.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void calculate(String operator, double value1, double value2){
        if(operator.equals("+")) result = value1+value2;
        if(operator.equals("-")) result = value1-value2;
        if(operator.equals("*")) result = value1*value2;
        if(operator.equals("/")) result = value1/value2;
    }

    protected void changeDegree(String operator, double value1){
        if (operator.equals("+")) result = 32+((9/5.0)*value1);
        if (operator.equals("-")){
            value1=value1-32;
            result = (5/9.0)*value1;
        }
//        if (operator.equals("-")) result = (5/(9*(value1-32)));
    }


}
