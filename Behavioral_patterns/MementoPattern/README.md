# Memento Pattern

## Overview
The **Memento Design Pattern** is a behavioral pattern that allows an object to capture and store its internal state so that it can be restored later without violating encapsulation. It is commonly used for implementing undo/redo functionality.

## Components
- **Memento** → Stores the state of the object.
- **Originator (Editor)** → Creates and restores states using mementos.
- **Caretaker (History)** → Manages saved states without exposing internal details.
- **Client (MementoDemo)** → Demonstrates saving and restoring states.

## Directory Structure
MementoPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── memento/
│ ├── Memento.java
│ ├── Editor.java
│ ├── History.java
│ └── MementoDemo.java
└── README.md

## Example Execution
Editing: Drawing Circle
Editing: Drawing Square
Editing: Drawing Triangle
Restored to: Drawing Square
Restored to: Drawing Circle

## Use Cases
- Undo/redo functionality in text editors or graphic editors
- Snapshotting object states
- Transaction management in databases