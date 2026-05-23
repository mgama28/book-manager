# book-manager
SE 350 Project

## Project
Library Management System

## Libraries
- JavaFX (will be added later)
- JUnit (for testing)

## Final Submission Goals
- Working library system where users can add, search, checkout and return items
- Search by title, author, genre or year using Strategy pattern
- Items have states (Available, CheckedOut, Reserved) using State pattern
- Support for multiple media types (Books, Movies, Music) using Abstract Factory

## Problems/Issues
- I had to refactor Simple Factory to Abstract Factory pattern
- I had to refactor LibraryItem multiple times to add currentState, isReserved, and state methods
- I still need to update Main.java to fully utilize all patterns