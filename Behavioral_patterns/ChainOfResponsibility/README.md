# Chain of Responsibility Pattern

## Overview
The **Chain of Responsibility Design Pattern** is a behavioral pattern that lets you pass a request along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain. This decouples senders and receivers of requests, giving more flexibility in assigning responsibilities.

In this project, the Chain of Responsibility is demonstrated through a leave approval system.

## Components
- **Handler (Approver)** → Abstract class with a reference to the next handler and an `approveRequest()` method.
- **Concrete Handlers (TeamLead, Manager, Director, CEO)** → Implement the approval logic based on leave days.
- **Client (ChainOfResponsibilityDemo)** → Builds the chain and sends requests for approval.

## Directory Structure
ChainOfResponsibilityDemo/
├── src/
│ └── com/
│ └── example/
│ └── chain/
│ ├── Approver.java
│ ├── TeamLead.java
│ ├── Manager.java
│ ├── Director.java
│ ├── CEO.java
│ └── ChainOfResponsibilityDemo.java
└── README.md

## Example Execution
Team Lead approved leave for 2 days.
Manager approved leave for 4 days.
Director approved leave for 8 days.
CEO approved leave for 15 days.

## Use Cases
- Leave approval workflows
- Request logging or filtering
- Event handling systems
- Customer support escalation