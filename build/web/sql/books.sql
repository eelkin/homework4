/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 8293, Elon University, Elon, NC 27244
 */

CREATE DATABASE IF NOT EXISTS nightsound;
USE nightsound;

DROP TABLE IF EXISTS Books;

CREATE TABLE Books (
  CheckoutID INT NOT NULL AUTO_INCREMENT,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Email VARCHAR(50),
  BookTitle VARCHAR(50),
  DueDate DATETIME,
  Overdue VARCHAR(50),
  
  PRIMARY KEY(CheckoutID)
);

/*
USE CODE BELOW FOR TESTING PURPOSES
*/

/*
INSERT INTO User 
  (Email, FirstName, LastName)
VALUES 
  ('jsmith@gmail.com', 'John', 'Smith'),
  ('andi@murach.com', 'Andrea', 'Steelman'), 
  ('joelmurach@yahoo.com', 'Joel', 'Murach');
*/
