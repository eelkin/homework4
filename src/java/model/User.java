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
 * The User Javabean
 */
public class User {
  
    private String firstName;
    private String lastName;
    private String email;
    private String bookTitle;
    private Date dueDate;
    private String overdue;
    
    /**
     * Creates an empty argument bean
     */
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        bookTitle = "";
        dueDate = null;
        overdue = "";
    }
    
    /**
     * Creates the bean
     * @param user's first name
     * @param user's last name
     * @param user's email address
     * @param book title
     */
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
    
    /**
     * Gets the user's first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the user's first name
     * @param first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Gets the user's last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the user's last name
     * @param last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Gets the user's email address
     * @return email address
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets the user's email address
     * @param email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Gets title of the book the user's checking out
     * @return book title
     */
    public String getBookTitle() {
        return bookTitle;
    }
    
    /**
     * Sets the title of the book the user's checking out
     * @param book title
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    /**
     * Gets the due date for the book
     * @return due date
     */
    public Date getDueDate() {
        return dueDate;
    }
    
    /**
     * Sets the due date for the book
     * @param due date
     */
    public void setDueDate(Date dueDate) {
        //finds due date
        this.dueDate = dueDate;
    }
    
    /**
     * Gets the formatted due date
     * @return formatted due date
     */
    public String getFormattedDueDate() {
        //formats due date for EL
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String newDate = sdf.format(dueDate);
        return newDate;
    }

    /**
     * Gets the overdue status for the book
     * @return overdue status
     */
    public String getOverdue() {
        return overdue;
    }
    /**
     * Sets the overdue status for the book
     * @param overdue status
     */
    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }
}
