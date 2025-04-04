SELECT * FROM books;

SELECT * FROM books WHERE category = 'Bilgisayar Bilimleri';

SELECT * FROM books WHERE publish_year >= '2020-01-01';

SELECT title, category FROM books;

SELECT students.first_name, students.last_name, books.title 
FROM borrows
JOIN students ON borrows.student_id = students.student_id
JOIN books ON borrows.book_id = books.book_id;

SELECT books.title, authors.name AS author_name, books.publish_year
FROM books
JOIN authors ON books.author_id = authors.author_id;

SELECT students.first_name, students.last_name, books.title, borrows.borrow_date
FROM borrows
JOIN students ON borrows.student_id = students.student_id
JOIN books ON borrows.book_id = books.book_id;

SELECT students.first_name, students.last_name, books.title, borrows.borrow_date
FROM borrows
JOIN students ON borrows.student_id = students.student_id
JOIN books ON borrows.book_id = books.book_id
WHERE borrows.return_date IS NULL;

SELECT category, COUNT(*) AS book_count
FROM books
GROUP BY category;

SELECT students.first_name, students.last_name, COUNT(borrows.borrow_id) AS borrow_count
FROM borrows
JOIN students ON borrows.student_id = students.student_id
GROUP BY students.student_id
ORDER BY borrow_count DESC;

ALTER TABLE books ADD COLUMN price NUMERIC(10, 2);
ALTER TABLE books ALTER COLUMN category TYPE VARCHAR(149);

UPDATE books  SET category = 'Roman' WHERE book_id = 1;
DELETE FROM books WHERE book_id = 1;
--Silme işleminde fk bağlı ise fk'nin bağlı olduğu sütünlarda silinmesin gereklidir.
SELECT*FROM books

SELECT books.title, authors.name FROM books INNER JOIN authors ON books.author_id = authors.author_id;
SELECT books.title, borrows.return_date FROM borrows LEFT JOIN books ON borrows.book_id=books.book_id;
SELECT books.title, borrows.return_date FROM books RIGHT JOIN borrows ON books.book_id = borrows.book_id;
SELECT books.title, borrows.return_date FROM books FULL JOIN borrows ON books.book_id = borrows.book_id;

SELECT category, COUNT(*) AS book_count FROM books GROUP BY category HAVING COUNT(*) >= 2;

SELECT * FROM books LIMIT 5;
SELECT * FROM books LIMIT 5 OFFSET 2;

SELECT * FROM books WHERE book_id IN (SELECT book_id FROM borrows);
SELECT title  FROM books  WHERE author_id IN (SELECT author_id FROM authors WHERE name = 'J.K. Rowling');

SELECT * FROM books WHERE category = 'Bilgisayar Bilimleri' AND publish_year >= '2020-01-01';
SELECT * FROM books WHERE category = 'Bilgisayar Bilimleri' OR category = 'Roman';

SELECT * FROM books WHERE publish_year BETWEEN '2020-01-01' AND '2023-12-31';

SELECT * FROM books WHERE category IN ('Bilgisayar Bilimleri', 'Roman', 'Tarih');

SELECT * FROM books WHERE title LIKE '%Bilgisayar%';
SELECT * FROM books WHERE title LIKE 'A%';
SELECT * FROM books WHERE title LIKE '_____';




















