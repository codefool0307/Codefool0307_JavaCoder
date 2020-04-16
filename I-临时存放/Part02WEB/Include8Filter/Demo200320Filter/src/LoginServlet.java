import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("wzg168".equals(username) && "123456".equals(password)) {
            request.getSession().setAttribute("user",username);
            response.getWriter().write("登录 成功！ ！ ！ ");
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
    }
