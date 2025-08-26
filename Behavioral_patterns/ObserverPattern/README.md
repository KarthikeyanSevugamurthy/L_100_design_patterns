# Observer Pattern

## Overview
The **Observer Design Pattern** is a behavioral pattern where an object, called the **Subject**, maintains a list of dependents, called **Observers**, and notifies them automatically of any state changes. This pattern establishes a one-to-many dependency between objects.

## Components
- **Subject (Channel)** → Maintains subscribers and notifies them when updates occur.
- **Observer (Subscriber)** → Interface defining the update method.
- **Concrete Observer (User)** → Implements the observer interface and reacts to notifications.
- **Client (ObserverPatternDemo)** → Demonstrates subscribing, unsubscribing, and notifications.

## Directory Structure
ObserverPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── observer/
│ ├── Channel.java
│ ├── Subscriber.java
│ ├── User.java
│ └── ObserverPatternDemo.java
└── README.md


## Example Execution
Alice got notified: New video uploaded - Observer Pattern Explained!
Bob got notified: New video uploaded - Observer Pattern Explained!
Bob got notified: New video uploaded - Next Design Pattern - State!


## Use Cases
- Notification systems (YouTube, Instagram, etc.)
- Event listeners in GUI frameworks
- Messaging and pub-sub systems