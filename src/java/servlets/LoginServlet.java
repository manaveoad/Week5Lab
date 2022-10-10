package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Models.AccountService;
import Models.User;

/**
 *
 * @author manav
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        
            session.removeAttribute("username");
            session.removeAttribute("password");
            request.setAttribute("message", "You have successfully logged out");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
     
        if(username == null || password == null || username.equals("") || password.equals("")){
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        
        AccountService account = new AccountService();
        User user = account.login(username, password);
        if(user != null){
            session.setAttribute("username", username);
            response.sendRedirect("/Week5Lab_MyLogin/home");
        } else{
            request.setAttribute("message", "Invalid login. Please try again.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        
        
        
    }


}
