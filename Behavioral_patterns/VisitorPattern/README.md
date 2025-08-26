# Visitor Pattern

## Overview
The **Visitor Design Pattern** is a behavioral pattern that lets you separate algorithms from the objects on which they operate. It allows adding new operations to existing object structures without modifying their classes.

In this project, the Visitor Pattern is used to calculate tax for different types of items.

## Components
- **Element (Item)** → Interface with an `accept()` method that takes a visitor.
- **Concrete Elements (Food, Electronics, Medicine)** → Implement the `accept()` method and provide data to the visitor.
- **Visitor (TaxVisitor)** → Interface defining visit methods for each element type.
- **Concrete Visitor (TaxCalculator)** → Implements the tax calculation logic for each element.
- **Client (VisitorPatternDemo)** → Iterates through items and applies the visitor.

## Directory Structure
VisitorPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── visitor/
│ ├── Item.java
│ ├── Food.java
│ ├── Electronics.java
│ ├── Medicine.java
│ ├── TaxVisitor.java
│ ├── TaxCalculator.java
│ └── VisitorPatternDemo.java
└── README.md

## Example Execution
Food Tax: 5.0
Electronics Tax: 360.0
Medicine Tax: 10.0

## Use Cases
- Tax and discount calculation
- Syntax tree traversal in compilers
- Applying operations on complex object structures
- File system operations (size, permissions, backups)