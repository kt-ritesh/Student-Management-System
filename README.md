# Student Management System API
This project is an API built using Spring Boot framework and Java programming language. The API provides CRUD (Create, Read, Update, Delete) operations for 5 models: Student, Laptop, Courses, Book, and Address. The focus of this project is on implementing different types of relationships, including OneToOne, ManyToMany, and ManyToOne, between these models.

# Models
* Student

The student model contains information about the student, including their name, email, age, and address.

* Laptop

The laptop model contains information about the laptop, including its brand, model, and the student it belongs to. This model is related to the Student model through a OneToOne relationship.

* Courses

The courses model contains information about the different courses that are available, including the course name, course code, and the students enrolled in the course. This model is related to the Student model through a ManyToMany relationship.

* Book

The book model contains information about different books, including the book name, author, and the students who have borrowed the book. This model is related to the Student model through a ManyToOne relationship.

* Address

The address model contains information about the student's address, including their street, city, state, and zip code. This model is embedded in the Student model.

# Endpoints
The following endpoints are available for each model:

* Student

POST /savestudent: creates a new student

GET /getstudent: retrieves a list of all students

PUT /updatestudent/{student_id}: updates an existing student by ID

DELETE /deletestudent/{student_id}: deletes a student by ID

* Laptop

POST /savelaptop: creates a new laptop

GET /getlaptop: retrieves a list of all laptops

PUT /updatelaptop/{laptop_id}: updates an existing laptop by ID

DELETE /deletelaptop/{laptop_id}: deletes a laptop by ID

* Courses

POST /savecourse: creates a new course

GET /getcourses: retrieves a list of all courses

PUT /updatecourse/{course_id}: updates an existing course by ID

DELETE /deletecourse/{course_id}: deletes a course by ID

* Book

POST /savebook: creates a new book

GET /getbooks: retrieves a list of all books

PUT /updatebook/{book_id}: updates an existing book by ID

DELETE /deletebook/{book_id}: deletes a book by ID

# Architecture
The API follows a three-layer architecture, including the controller layer, service layer, and repository layer. The controller layer handles incoming requests and executes the appropriate methods based on the endpoint. The service layer contains the main business logic for the API, while the repository layer is responsible for connecting to the database.

# Database
This API uses MySQL as its database.

# Data Structure
The data structure used for this project is ArrayList.
