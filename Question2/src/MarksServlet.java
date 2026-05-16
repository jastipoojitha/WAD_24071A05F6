import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MarksServlet")

public class MarksServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        int m1 = Integer.parseInt(request.getParameter("m1"));
        int m2 = Integer.parseInt(request.getParameter("m2"));
        int m3 = Integer.parseInt(request.getParameter("m3"));
        int m4 = Integer.parseInt(request.getParameter("m4"));
        int m5 = Integer.parseInt(request.getParameter("m5"));

        int total = m1 + m2 + m3 + m4 + m5;

        double average = total / 5.0;

        String rank;

        if (average >= 90) {
            rank = "Outstanding (O)";
        }
        else if (average >= 80) {
            rank = "A+";
        }
        else if (average >= 70) {
            rank = "A";
        }
        else if (average >= 60) {
            rank = "B+";
        }
        else if (average >= 50) {
            rank = "B";
        }
        else if (average >= 40) {
            rank = "C";
        }
        else {
            rank = "Fail";
        }

        request.setAttribute("name", name);
        request.setAttribute("total", total);
        request.setAttribute("average", average);
        request.setAttribute("rank", rank);

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}