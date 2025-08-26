# Template Method Design Pattern

## 🧠 Definition
The Template Method Pattern defines the skeleton of an algorithm in a base class but lets subclasses override specific steps of the algorithm.

## 🤔 Why Use It?
- To enforce a consistent algorithm structure
- To allow subclasses to define variable behavior

## 📍 Where to Use?
- When multiple classes follow the same algorithm structure
- When some steps of the process need to vary in subclasses

## ✅ Pros
- Promotes code reuse
- Encourages consistent algorithm implementation
- Follows Open/Closed Principle

## ❌ Cons
- Increases complexity through inheritance
- Less flexible than composition

## 💡 Real-World Examples
- File parsers (e.g., PDF vs DOCX parsing)
- Game AI (skeleton of moves with specific behaviors)

## 🧪 Beginner Example
Example: Making Beverages (Tea and Coffee)

The process of making any beverage might involve:

Boil water

Brew (Tea or Coffee)

Pour in cup

Add condiments (Sugar/Milk/Lemon)
