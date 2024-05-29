-- Select all records from the student table
SELECT * FROM demo.student;

-- Insert a new record into the student table
INSERT INTO student (studentid, name, age, email, phone) VALUES (4, 'Mazhar', 26, 'mazharpatel@gmail.com', 7249722840);

-- Switch to the demo database
USE demo;

-- Disable safe updates mode (useful for update/delete operations without a WHERE clause)
SET SQL_SAFE_UPDATES = 0;

-- Delete the record with studentid 4 from the student table
DELETE FROM student WHERE studentid = 4;

-- Add a new column 'City' of type varchar(255) to the student table
ALTER TABLE student ADD City VARCHAR(255);

-- Describe the structure of the student table to see the new 'City' column
DESC student;

-- Add a new column 'State' of type varchar(255) to the student table
ALTER TABLE student ADD State VARCHAR(255);

-- Describe the structure of the student table to see the new 'State' column
DESC student;

-- Attempt to add a duplicate 'State' column, which will result in an error
-- ALTER TABLE student ADD State VARCHAR(255); -- This line will cause an error due to the duplicate column name

-- Select all records from the student table to verify the current state
SELECT * FROM student;

-- Attempt to add a duplicate 'City' column, which will result in an error
-- ALTER TABLE student ADD City VARCHAR(255); -- This line will cause an error due to the duplicate column name

-- Select all records from the student table to verify the current state
SELECT * FROM student;

-- Drop the 'village' column from the student table
-- This line will cause an error if 'village' does not exist
-- ALTER TABLE student DROP COLUMN village; -- Uncomment this line if 'village' exists

-- Update all records to set the 'City' column to 'Nashik'
UPDATE student SET City = 'Nashik';

-- Select all records from the student table to verify the 'City' column update
SELECT * FROM student;

-- Update all records to set the 'State' column to 'Maharashtra'
UPDATE student SET State = 'Maharashtra';

-- Select all records from the student table to verify the 'State' column update
SELECT * FROM student;

-- Add a new column 'Country' of type varchar(255) to the student table
ALTER TABLE student ADD Country VARCHAR(255);

-- Select all records from the student table to verify the new 'Country' column
SELECT * FROM student;

-- Rename the 'Country' column to 'Countries'
ALTER TABLE student RENAME COLUMN Country TO Countries;

-- Update all records to set the 'Countries' column to 'India'
UPDATE student SET Countries = 'India';

-- Select all records from the student table to verify the 'Countries' column update
SELECT * FROM student;
