/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 8293, Elon University, Elon, NC 27244
 */
package data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Utility class so server can talk to database through Java
 */
public class DBUtil {
  
   /**
    * Closes the SQL statement
    * @param the SQL statement
    */
    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
   /**
    * Closes the prepared statement
    * @param the prepared statement
    */
    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
   /**
    * Closes the result set
    * @param the result set
    */
    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
  
}
