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

public class LibraryServlet extends HttpServlet {

    @Override
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
            //trying to display books in database
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
            url = "/books.jsp";
        }
        //this may need some work
        else if (action.equals("add")) {
            //creates user
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String bookTitle = request.getParameter("bookTitle");
            
            User user = new User(firstName,lastName, email, bookTitle);
            request.setAttribute("user", user);
           
            //inserts the user
            UserDB.insert(user);
            
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
            //reroutes to thanks.jsp
            url = "/thanks.jsp";
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
        }
       
        else if (action.equals("delete_user")) {
            // get the user
            String email = request.getParameter("email");
            User user = UserDB.selectUser(email);
            
            // delte the user
            UserDB.delete(user);
            
            // get and set updated users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);            
        }
        
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
