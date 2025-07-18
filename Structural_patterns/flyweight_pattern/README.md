# Flyweight Design Pattern

## Definition
The Flyweight Pattern minimizes memory usage by sharing as much data as possible with similar objects.

## Why Use It?
- To reduce memory usage when many similar objects are created
- To share common parts of objects instead of duplicating them

## Where to Use?
- Applications with large numbers of objects (text editors, particle systems)
- When object creation is costly and object state is largely reusable

## Pros
- Reduces memory consumption
- Improves performance for large datasets

## Cons
- Increased complexity of code
- Requires careful separation of intrinsic vs extrinsic state

## Real-World Examples
- Text editors sharing font and character glyphs
- Game engines with trees, rocks, etc.

## Beginner Example
A text editor rendering millions of characters, where each character shares the same font and style.
