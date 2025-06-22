# Prototype Design Pattern - Shape Editor 

##  Concept
The **Prototype Pattern** is used to create object copies (clones) quickly without depending on constructors. This is useful when object creation is costly.

---

##  Use Case - Shape Editor Application

A graphics editor allows users to:
- Create and save favorite shapes
- Clone existing shapes
- Modify cloned shapes independently without changing the original

---

##  Folder: `prototype/`
### Files:
- `Shape.java` – Abstract base class with cloning logic
- `Circle.java` – Circle class extending Shape
- `Rectangle.java` – Rectangle class extending Shape
- `PrototypeDemo.java` – Demonstrates cloning and modification

---

##  Sample Output
Circle -> color: Red, position: (10,20), radius: 5
Circle -> color: Blue, position: (50,20), radius: 5
Rectangle -> color: Green, position: (0,0), size: 30x40
Rectangle -> color: Yellow, position: (100,0), size: 30x40

## Benefits
- Avoids expensive object creation
- Allows fast duplication
- Ideal for shape editors, diagram creators, or game object cloning