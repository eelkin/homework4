/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 8293, Elon University, Elon, NC 27244
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
    private Date dueDate;
    private String overdue;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        bookTitle = "";
        dueDate = null;
        overdue = "";
    }

    public User(String firstName, String lastName, String email,
            String bookTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bookTitle = bookTitle;
        //dueDate must be Date object
        Calendar calendar = GregorianCalendar.getInstance();
        Date today = new Date();
        calendar.add(Calendar.WEEK_OF_YEAR, 2);
        this.dueDate = calendar.getTime();
        
        if(today.after(dueDate)) {
          this.overdue = "overdue";
        } else {
          this.overdue = "";
        }
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
 
    public Date getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(Date dueDate) {
        //finds due date
        this.dueDate = dueDate;
    }
    
    public String getFormattedDueDate() {
        //formats due date for EL
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String newDate = sdf.format(dueDate);
        return newDate;
    }
   
    
    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }
}
