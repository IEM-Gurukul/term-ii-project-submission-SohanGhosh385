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
Commits on Mar 28, 2026
FIlled the Given README
SohanGhosh385
SohanGhosh385
authored
1 minute ago

Added Final README
SohanGhosh385
SohanGhosh385
committed
16 minutes ago
Implement return book functionality: update quantity, remove issued record, and persist changes
SohanGhosh385
SohanGhosh385
committed
30 minutes ago
Commits on Mar 27, 2026
Implement book issuance: check availability, update quantity, and track issued records with persistence
SohanGhosh385
SohanGhosh385
committed
yesterday
Add student management to Library class with persistence and update Main.java menu
SohanGhosh385
SohanGhosh385
committed
yesterday
Commits on Mar 26, 2026
Implement Library class with file persistence and add Main.java menu for add/view books
SohanGhosh385
SohanGhosh385
committed
2 days ago
Commits on Mar 24, 2026
Add initial Library class with ArrayList to store books and basic add/view methods
SohanGhosh385
SohanGhosh385
committed
4 days ago
Commits on Mar 22, 2026
Added IssueRecord class to track book issuance details with studentId and bookId
SohanGhosh385
SohanGhosh385
committed
last week
Commits on Mar 21, 2026
Add Student class with attributes studentId and name along with getters
SohanGhosh385
SohanGhosh385
committed
last week
Commits on Mar 19, 2026
Add Book class with attributes id, title, author, and quantity along with getters
SohanGhosh385
SohanGhosh385
committed
last week
Initialized Project Structure with required folder structure and added README
SohanGhosh385
SohanGhosh385
committed
last week


