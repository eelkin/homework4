/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 8293, Elon University, Elon, NC 27244
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

/**
 * This class interacts with the MySQL database and executes SQL commands
 */
public class UserDB {
    /**
     * Inserts the user into the database
     * @param the user
     * @return the executed insert command
     */
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;

        String query
                = "INSERT INTO Books (FirstName, LastName, Email, "
                + "BookTitle, DueDate, Overdue) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getBookTitle()); 
            java.sql.Date sqlDate = 
                    new java.sql.Date(user.getDueDate().getTime());
            statement.setDate(5, sqlDate);
            statement.setString(6, user.getOverdue());
            return statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }
    
    /**
     * Inserts the user into the database
     * @param the user
     * @return the executed insert command
     */
    public static int delete(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;

        String query = "DELETE FROM Books "
                + "WHERE Email = ?";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getEmail());

            return statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }
    /**
     * Selects one user from the database
     * @param the user's email
     * @return the user
     */
    public static User selectUser(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;
        ResultSet set = null;

        String query = "SELECT * FROM Books "
                + "WHERE Email = ?";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, email);
            set = statement.executeQuery();
            User user = null;
            if (set.next()) {
                user = new User();
                user.setFirstName(set.getString("FirstName"));
                user.setLastName(set.getString("LastName"));
                user.setEmail(set.getString("Email"));
                user.setBookTitle(set.getString("BookTitle"));
                user.setDueDate(set.getDate("DueDate"));
                user.setOverdue(set.getString("Overdue"));
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(set);
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }
    
    /**
     * Selects all of the user's in the database and adds them to an ArrayList
     * @return an ArrayList of all the users in the database
     */
    public static ArrayList<User> selectUsers() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;
        ResultSet set = null;
        
        String query = "SELECT * FROM Books ";
        try {
            statement = connection.prepareStatement(query);
            set = statement.executeQuery();
            ArrayList<User> users = new ArrayList<>();
            while (set.next())
            {
                User user = new User();
                user.setFirstName(set.getString("FirstName"));
                user.setLastName(set.getString("LastName"));
                user.setEmail(set.getString("Email"));
                user.setBookTitle(set.getString("BookTitle"));
                user.setDueDate(set.getDate("DueDate"));
                user.setOverdue(set.getString("Overdue"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(set);
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }
}
