/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 7947, Elon University, Elon, NC 27244
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

public class UserDB {
  
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;

        String query
                = "INSERT INTO User (FirstName, LastName, Email, BookTitle, DueDate, Overdue) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getBookTitle());
            //CHANGE THIS TO DATE 
            statement.setString(5, user.getDueDate());
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

    public static int update(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;

        String query = "UPDATE User SET "
                + "FirstName = ?, "
                + "LastName = ? "
                + "WHERE Email = ?";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());

            return statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }

    public static int delete(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;

        String query = "DELETE FROM User "
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

    public static boolean emailExists(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;
        ResultSet set = null;

        String query = "SELECT Email FROM User "
                + "WHERE Email = ?";
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, email);
            set = statement.executeQuery();
            return set.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(set);
            DBUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
        }
    }

    public static User selectUser(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;
        ResultSet set = null;

        String query = "SELECT * FROM User "
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
                //change due date to datetime
                user.setDueDate(set.getString("DueDate"));
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
    
    public static ArrayList<User> selectUsers() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement statement = null;
        ResultSet set = null;
        
        String query = "SELECT * FROM User";
        try {
            statement = connection.prepareStatement(query);
            set = statement.executeQuery();
            ArrayList<User> users = new ArrayList<User>();
            while (set.next())
            {
                User user = new User();
                user.setFirstName(set.getString("FirstName"));
                user.setLastName(set.getString("LastName"));
                user.setEmail(set.getString("Email"));
                user.setBookTitle(set.getString("BookTitle"));
                //change due date to datetime
                user.setDueDate(set.getString("DueDate"));
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
