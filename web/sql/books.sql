/**
 * Copyright (c) 2016 Evan Elkin
 * Campus Box 7947, Elon University, Elon, NC 27244
 * 
 * Copyright (c) 2016 Breslin Wiley
 * Campus Box 7947, Elon University, Elon, NC 27244
 */

CREATE DATABASE IF NOT EXISTS nightsound;
USE nightsound;

DROP TABLE IF EXISTS Books;

CREATE TABLE Books (
  UserID INT NOT NULL AUTO_INCREMENT,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Email VARCHAR(50),
  BookTitle NOT NULL VARCHAR(50),
  DueDate VARCHAR(50),
  Overdue VARCHAR(50)
  
  PRIMARY KEY(BookTitle) 
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
