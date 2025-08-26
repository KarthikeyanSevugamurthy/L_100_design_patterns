# State Pattern

## Overview
The **State Design Pattern** is a behavioral pattern that allows an object to change its behavior when its internal state changes. The object will appear to change its class at runtime by delegating tasks to different state objects.

## Components
- **State Interface (TrafficLightState)** → Defines the behavior that each concrete state must implement.
- **Concrete States (RedState, GreenState, YellowState)** → Implement behavior for each specific state.
- **Context (TrafficLight)** → Maintains a reference to the current state and delegates behavior to it.
- **Client (StatePatternDemo)** → Demonstrates switching between different states.

## Directory Structure
StatePatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── state/
│ ├── TrafficLightState.java
│ ├── RedState.java
│ ├── GreenState.java
│ ├── YellowState.java
│ ├── TrafficLight.java
│ └── StatePatternDemo.java
└── README.md

## Example Execution
RED: Stop!
GREEN: Go!
YELLOW: Slow down!

## Use Cases
- Traffic lights simulation
- Media player states (play, pause, stop)
- Document workflow (draft, review, published)
- Vending machine operation states