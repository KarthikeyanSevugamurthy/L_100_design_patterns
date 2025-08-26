# Strategy Pattern

## Overview
The **Strategy Design Pattern** is a behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm to vary independently from the clients that use it.

In this project, the Strategy Pattern is demonstrated using different sorting algorithms.

## Components
- **Strategy (SortStrategy)** → Interface defining the `sort()` method.
- **Concrete Strategies (BubbleSort, QuickSort)** → Different sorting implementations.
- **Context (SortContext)** → Maintains a reference to a strategy and delegates sorting to it.
- **Client (StrategyPatternDemo)** → Chooses which sorting algorithm (strategy) to use.

## Directory Structure
StrategyPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── strategy/
│ ├── SortStrategy.java
│ ├── BubbleSort.java
│ ├── QuickSort.java
│ ├── SortContext.java
│ └── StrategyPatternDemo.java
└── README.md


## Example Execution
Sorting using Bubble Sort...
[1, 2, 3, 5, 8]
Sorting using Quick Sort...
[1, 2, 3, 5, 8]

## Use Cases
- Sorting algorithms (Bubble, Quick, Merge, etc.)
- Payment strategies (Credit Card, PayPal, UPI)
- Compression algorithms (ZIP, RAR)
- Routing strategies in navigation systems