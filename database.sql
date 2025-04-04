CREATE DATABASE library_management;

CREATE TABLE authors (
    author_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    category VARCHAR(100),
    publish_year DATE,
    author_id INT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE borrows (
    borrow_id SERIAL PRIMARY KEY,
    borrow_date DATE NOT NULL,
    return_date DATE,
    student_id INT NOT NULL,
    book_id INT NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);
INSERT INTO authors (name) VALUES
('George Orwell'),
('J.K. Rowling'),
('J.R.R. Tolkien'),
('Fyodor Dostoevsky'),
('Jane Austen');
INSERT INTO books (title, category, publish_year, author_id) VALUES
('1984', 'Dystopian', '1949-06-08', 1),
('Animal Farm', 'Political Satire', '1945-08-17', 1),
('Harry Potter and the Sorcerer''s Stone', 'Fantasy', '1997-06-26', 2),
('The Hobbit', 'Fantasy', '1937-09-21', 3),
('Crime and Punishment', 'Philosophical Novel', '1866-01-01', 4),
('Pride and Prejudice', 'Romance', '1813-01-28', 5);
INSERT INTO students (first_name, last_name) VALUES
('Ahmet', 'Yılmaz'),
('Ayşe', 'Kara'),
('Mehmet', 'Demir'),
('Zeynep', 'Şahin'),
('Ali', 'Çelik');
INSERT INTO borrows (borrow_date, return_date, student_id, book_id) VALUES
('2025-03-01', '2025-03-10', 1, 1),
('2025-03-05', '2025-03-12', 2, 3),
('2025-03-10', NULL, 3, 4),
('2025-03-12', NULL, 4, 2),
('2025-03-15', '2025-03-25', 5, 5);
INSERT INTO borrows (borrow_date, return_date, student_id, book_id) VALUES
-- Ahmet (id 1)
('2025-03-01', '2025-03-10', 1, 1),
('2025-03-20', NULL, 1, 2),
('2025-03-25', '2025-04-01', 1, 6),

-- Ayşe (id 2)
('2025-03-05', '2025-03-12', 2, 3),
('2025-03-22', NULL, 2, 4),

-- Mehmet (id 3)
('2025-03-10', NULL, 3, 4),
('2025-03-25', NULL, 3, 1),
('2025-03-30', NULL, 3, 6),

-- Zeynep (id 4)
('2025-03-12', NULL, 4, 2),
('2025-03-29', NULL, 4, 5),

-- Ali (id 5)
('2025-03-15', '2025-03-25', 5, 5);

