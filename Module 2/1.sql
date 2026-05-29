CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
INSERT INTO students VALUES
(1, 'Bhuvan', 20),
(2, 'Arun', 21),
(3, 'Karthik', 19);
SELECT * FROM students;
USE studentdb;

CREATE TABLE accounts (
    id INT PRIMARY KEY,
    balance DOUBLE
);
INSERT INTO accounts VALUES
(1, 5000),
(2, 3000);
SELECT * FROM accounts;