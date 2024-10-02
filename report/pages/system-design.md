# System design

## Table of contents

### **1. [Introduction](../project-report.md#introduction)**

### **2. [Project objective](../project-report.md#project-objective)**

### **3. [Project scopes](../project-report.md#project-scopes)**

### **4. [Problem definition](./problem-definition.md)**

### **5. [Key challenges](./problem-definition.md#key-challenges-addressed)**

### **6. [Summary of problem definition](./problem-definition.md#summary)**

### **7. [System design](./system-design.md)**

### **8. [Results via screenshots](./result-screenshots.md)**

### **9. [Conclusion](./conclusion.md)**

---

## Technologies used

- **Languages used:** Java SE
- **Tools:**
  - **APIs:** Java I/O Stream API
  - **Frameworks:** Collections Framework

## Design

### 1. Key components

- **Hotel Class:**
  - Represents a single hotel within the chain.
  - Attributes include a list of rooms, location, name, and possible hotel-specific services.
  - Methods include operations such as adding/removing rooms, retrieving room availability, and handling hotel-wide bookings.  
- **Room Class:**
  - Represents an individual room in a hotel.
  - Attributes include room number, type (e.g., single, double, suite), occupancy status, and rate.
  - Methods include operations to check availability, book the room, and release the room when a guest checks out.

### 2. Data Managing Using Collections Framework

### 3. Java I/O for Persistence

- **File structure:**
  - Data persistence will be handled through file operations. This could be a text-based or serialized file system where hotel data such as rooms, guests, and bookings are saved and loaded across sessions.
- **I/O Operations**
  - The system reads the existing room or guest information at the beginning of each session using to populate the necessary collections.

### 4. Error handling and validation

- Input validation is crucial in ensuring the system handles incorrect or inconsistent data entries, such as invalid room numbers, guest names, or dates.
- Robust exception handling mechanisms will ensure that I/O errors or booking conflicts (such as double booking of a room) are gracefully handled without crashing the system.
