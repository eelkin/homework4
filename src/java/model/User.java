/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 7947, Elon University, Elon, NC 27244
 */
package model;


import java.util.Date;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * The User Javabean. May need to add code to manipulate SQL Date.
 */

public class User {
  
    private String firstName;
    private String lastName;
    private String email;
    private String bookTitle;
    //work with calendar/date
    private String dueDate;
    //private Date dueDate
    private String overdue;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        bookTitle = "";
        //should be date
        dueDate = "";
        //dueDate = null;
        overdue = "";
    }

    public User(String firstName, String lastName, String email,
            String bookTitle, String dueDate, String overdue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bookTitle = bookTitle;
        //dueDate must be Date object
        this.dueDate = dueDate;
        this.overdue = overdue;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    //getter/setter should be date
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    /*
    public void setDueDate(Day dueDate) {
        //converts to 
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String formattedDueDate = sdf.format(dueDate);
        this.dueDate = formattedDueDate
    }
    
    */
    
    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }
    
    /*
    public void setOverdue(Date today, Date dueDate) {
      if(today.before(dueDate) {
        this.overdue = "overdue";
      }
    */
    
    
  
}
