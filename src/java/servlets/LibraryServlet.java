/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 8293, Elon University, Elon, NC 27244
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import data.UserDB;

/**
 * The servlet for the library application
 */
public class LibraryServlet extends HttpServlet {

    @Override
    /**
     * Submits data for processing
     * @param request object from client
     * @param response object from server
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/index.jsp";
        
        String action = request.getParameter("action");
        if (action == null) {
            //action = "display_users";
            action = "join";
        }
        
        //reroutes user to index.jsp
        if (action.equals("join")) {
            url = "/index.jsp";
        } 
        //sends user to checkout page
        else if (action.equals("checkout")) {
            url = "/checkout.jsp";
        }
        //sends user to books page, displays books
        else if (action.equals("books")) {
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
            url = "/books.jsp";
        }
        
        else if (action.equals("add")) {
            //gets parameters for creating user
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String bookTitle = request.getParameter("bookTitle");
            
            //creates user
            User user = new User(firstName,lastName, email, bookTitle);
            request.setAttribute("user", user);
           
            //inserts the user
            UserDB.insert(user);
            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
            //reroutes to thanks.jsp
            url = "/thanks.jsp";
        }
        
        else if (action.equals("delete")) {
            // get the user
            String email = request.getParameter("email");
            String bookTitle = request.getParameter("bookTitle");
            User user = UserDB.selectUser(email, bookTitle);
            
            // delete the user
            UserDB.delete(user);
            
            // get and set updated users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
            url = "/books.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    /**
     * Requests data
     * @param request object from client
     * @param response object from server
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
