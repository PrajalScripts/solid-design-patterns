# SOLID Design Principles in Java

This repository demonstrates the five SOLID principles of object-oriented design using clean and minimal Java code examples. Each principle includes:
- ❌ A violating example
- ✅ A corrected, compliant version

## 🧱 SOLID Principles

### 1. **S** - Single Responsibility Principle (SRP)
> A class should have only one reason to change.

✅ Each class handles one responsibility (e.g., separating business logic and file handling).

---

### 2. **O** - Open/Closed Principle (OCP)
> Software entities should be open for extension, but closed for modification.

✅ Demonstrated with a `NotificationService` using interface-based extensibility.

---

### 3. **L** - Liskov Substitution Principle (LSP)
> Subtypes must be substitutable for their base types.

✅ Flying and non-flying birds are handled using separate interfaces to prevent runtime violations.

---

### 4. **I** - Interface Segregation Principle (ISP)
> No client should be forced to depend on methods it does not use.

✅ `Workable` and `Eatable` interfaces allow flexible composition for `Human` and `Robot`.

---

### 5. **D** - Dependency Inversion Principle (DIP)
> High-level modules should not depend on low-level modules; both should depend on abstractions.

✅ `App` depends on a `Database` interface, allowing injection of `MySQLDatabase`, `MongoDBDatabase`, etc.

---

## ▶️ How to Run

Compile and run the `Main` class:
```bash
javac Main.java
java Main
