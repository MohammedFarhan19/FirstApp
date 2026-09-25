/*
1- connect to Database (localhost, 3306, username, password, store_java)
2- prepare Query (Insert, update, delete, select)
3- execute Query
4- Fetch result (feedback, data)
5- close connection => besser try with resource try(hier){}
*/

--CRUD
-- Create Read   Update Delete
-- INSERT SELECT UPDATE DELETE.


-- WRITE
INSERT INTO categories(name, description)
VALUES ('category23', 'another category');

------------------------------------------------------
UPDATE categories
	SET 
		name = 'First Category'
	  , description = 'updated description'
WHERE id = 5;

-------------------------------------------------------
		
DELETE FROM categories
WHERE id = 15;

--------------------------------------------------------

-- READ
SELECT id, name description
FROM categories;

SELECT id, name, description
FROM categories
WHERE id = 4;

-- all columns
SELECT *
FROM categories
WHERE id = 4;