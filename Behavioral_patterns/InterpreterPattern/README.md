# Interpreter Pattern

## Overview
The **Interpreter Design Pattern** is a behavioral pattern used to define a grammar for simple languages and provide an interpreter to evaluate sentences in the language.

In this project, we simulate a **mini SQL parser** that can interpret simple queries like:
- `SELECT name FROM students`
- `SELECT age FROM students`

## Components
- **Expression (interface)** → Declares the `interpret()` method.
- **Terminal Expression (SelectExpression)** → Handles columns like `name`, `age`.
- **Non-Terminal Expression (FromExpression)** → Combines `SELECT` and `FROM` parts.
- **Context** → Stores a small "database" (`students` table).
- **Client (InterpreterPatternDemo)** → Builds the query and runs interpretation.

## Directory Structure
InterpreterPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── interpreter/
│ ├── Expression.java
│ ├── SelectExpression.java
│ ├── FromExpression.java
│ ├── Context.java
│ └── InterpreterPatternDemo.java
└── README.md


## Example Execution
Query 1 result: Alice
Query 2 result: 21


## Use Cases
- Parsing SQL-like queries
- Expression evaluators (math, boolean logic)
- Scripting engines
- Rule engines in business applications