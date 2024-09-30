# Problem definition

## Table of contents

### **1. [Introduction](../project-report.md#introduction)**

### **2. [Project objective](../project-report.md#project-objective)**

### **3. [Project scopes](../project-report.md#project-scopes)**

### **4. [Problem definition](./problem-definition.md)**

### **5. [Key challenges](./problem-definition.md#key-challenges-addressed)**

### **6. [Summary of problem definition](./problem-definition.md#summary)**

### **7. [System design](./system-design.md)**

---

>It develops a Java application that simulates a chain of hotels whereby users can perform simple Create, Read, Update, and Delete operations on data related to hotel rooms, bookings, guests, etc. Basically, this is some kind of simulated real-life hotel management scenario depicting where to apply both manual and automated processes with the help of elementary concepts of programming.

## Key challenges addressed

**1. Hotel Operations Management:** The system should model a variety of real-world hotel operations, such as the management of the room inventory, the customers' reservation and management, check-in and check-out. These operations should easily scale up or down across several locations, each having their distinctive attributes, such as the number and types of rooms available.

**2. Java Collections for Data Handling:** The system should be able to store and manipulate dynamic collections of objects in memory, such as rooms, bookings, customer records, among others. Efficient usage of the Java Collections Framework-lists, sets, and maps-will ensure that processes related to finding, sorting, and updating data are executed fast and resource less.

**3. Persistence and Java I/O:** Real-world simulation in the application should handle files for read/write purposes to the persistence storage so that at each session, data about room availability and previous records of bookings are retained. The program shall make use of the Java I/ O Package for managing file operations. This calls for efficient code for file handling together with robust mechanisms for handling errors. 4. Object-oriented design and modularity: The system should be implemented using object-oriented programming principles to guarantee that the system is modular, reusable, maintainable. Class hierarchy clearly needs to be designed for entities such as hotels, rooms, and guests. It has to establish relationships among these using inheritance, composition, and polymorphism.

## Summary

This problem statement encompasses everything involved in this project and provides full insight into the scope of work.
