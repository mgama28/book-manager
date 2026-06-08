# book-manager

SE 350 Project

## Project

Library Management System
  
---
## Libraries

- JavaFX (Didn't add)

- JUnit (for testing)

 --- 

## Incomplete Functionality:

- Persistent data storage (that's why I added preloaded data)

- ReservedState doesn't track which member reserved the item

- Memeber checkout list is not fully tied to checkout/return commands

- HashMap search optimization was not implemented

- No UI

---
## Bugs

- There's no bugs, except for the incomplete functionalities that weren't implemented
---
## Design Patterns List:

### Abstract Factory:
Used to create different types of library items (Books, Movies, Music) through **BookFactory, MovieFactory and MusicFactory** without specifying concrete classes

---

### Builder:

Used in **BookBuilder, MovieBuilder and MusicBuilder** to create library items with mulitple fields through method chaining

---

### Command

Used too wrap catalog operations like **AddItemCommand, RemoveItemCommand, SearchItemCommand, CheckOutCommand and ReturnItemCommand**. 

---

### Observer
Used to notify **member** objects when a reserved **LibraryItem** becomes available again

---

### State
Used to manage **LibraryItem** availability through **AvailableState, CheckedOutState and ReservedState.**

---
### Strategy
Used to search the catalog by different criteria: **title,  creator, genre, year or ID**, through the interchangeable search strategies classes

---
## Final Submission Goals:
I was able to build a working console-based Library Management System that allows users to add, search, checkout, and return different types of media including Books, Movies, and Music. The system successfully demonstrates all 6 design patterns working together. The program can handle multiple copies of the same item, detect duplicates, manage item states, and notify members when items become available.