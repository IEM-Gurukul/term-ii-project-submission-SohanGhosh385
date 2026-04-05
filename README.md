[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
LIBRARY MANAGEMENT SYSTEM

## Problem Statement (max 150 words)
Managing library records manually is inefficient and prone to errors such as loss of data, difficulty in tracking issued books, and lack of proper organization. Many small libraries still rely on manual systems, which makes it difficult to maintain accurate records of books and users.

The objective of this project is to develop a console-based Library Management System using Java that allows efficient management of books and students. The system enables adding, viewing, issuing, and returning books while maintaining persistent storage using file handling. This project demonstrates the use of Object-Oriented Programming principles to build a structured and maintainable system.

## Target User
Librarians
Students / Library members

## Core Features
Add and view books
Add and view students
Issue books to students
Return issued books
Persistent storage using file handling (books.txt, students.txt, issued.txt)

## OOP Concepts Used
Abstraction:
Implemented through the Library class methods like addBook(), issueBook(), and returnBook() which hide internal logic from users.

Inheritance:
Demonstrated conceptually by allowing extension of the Book class (e.g., different book types like ReferenceBook).

Polymorphism:
Can be extended through method overriding in future enhancements; currently basic structure supports it.

Exception Handling:
Used in file operations (try-catch) to handle errors like missing files or invalid data.

Collections / Threads:
ArrayList is used to dynamically store books, students, and issued records.

## Proposed Architecture Description
The system follows a modular object-oriented design:

Book class stores book details
Student class stores student information
IssueRecord class tracks issued books
Library class acts as the core controller managing all operations and data storage
Main class provides a menu-driven interface for user interaction

Data is stored in memory using ArrayList and persisted using file handling (books.txt, students.txt, issued.txt). The system ensures synchronization between memory and file storage after every operation.

## How to Run
cd src
javac *.java
java Main

## Git Discipline Notes

Commit 1

Message: Initialize project structure with required folders and add README
Description: Created base project structure (src/, docs/, report/, slides/) and initial README file.

Commit 2

Message: Add Book class with attributes id, title, author, and quantity along with getters
Description: Implemented Book.java class representing book entity.

Commit 3

Message: Add Student class with attributes studentId and name along with getters
Description: Implemented Student.java class for managing student data.

Commit 4

Message: Add IssueRecord class to track book issuance details with studentId and bookId
Description: Added IssueRecord.java to track issued books.

Commit 5

Message: Add initial Library class with ArrayList to store books and basic add/view methods
Description: Created Library.java with basic structure and in-memory book management.

Commit 6

Message: Implement Library class with file persistence and add Main.java menu for add/view books
Description: Added file handling (books.txt) and menu-driven interface in Main.java.

Commit 7

Message: Add student management to Library class with persistence and update Main.java menu
Description: Added functionality to add/view students and store them in students.txt.

Commit 8

Message: Implement book issuance: check availability, update quantity, and track issued records with persistence
Description: Implemented issuing books, updating quantity, and storing records in issued.txt.

Commit 9

Message: Implement return book functionality: update quantity, remove issued record, and persist changes
Description: Added return functionality with proper record removal and quantity update.

Commit 10 (Final Commit)

Message: Finalize project with README updates, documentation, report, and presentation
Description: Completed project by adding final README, documentation, report, and slides.


