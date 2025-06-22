# Builder Design Pattern - Pizza Customizer 

##  Concept
The **Builder Pattern** is used for step-by-step construction of complex objects. It helps you build objects with multiple optional parameters in a readable way.

---

##  Use Case - Pizza Builder

Pizza creation with:
- Flexible size and crust
- Multiple toppings
- Optional extras like cheese

---

##  Folder: `builder/`
### Files:
- `Pizza.java` – Target class with constructor
- `PizzaBuilder.java` – Builder with chaining methods
- `BuilderDemo.java` – Demonstrates pizza creation using builder

---

##  Sample Input
```java
Pizza pizza = new PizzaBuilder()
    .size("Large")
    .crust("Thin")
    .addTopping("Pepperoni")
    .addTopping("Mushrooms")
    .extraCheese(true)
    .build();
pizza.display();



## Sample Output
- Pizza [Size: Large, Crust: Thin, Toppings: [Pepperoni, Mushrooms], Extra Cheese: true]



## Benefits

- Easy object construction
- Clean and readable chaining
- Useful for objects with many optional parameters
