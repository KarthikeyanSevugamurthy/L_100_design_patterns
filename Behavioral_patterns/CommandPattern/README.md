## Command Pattern

## Overview

The Command Design Pattern is a behavioral pattern that turns requests (actions) into objects.
This allows you to parameterize methods with different requests, delay or queue a request’s execution, and support undo operations.

In this project, the Command Pattern is demonstrated with a TV Remote, where each button corresponds to a command (Turn On, Turn Off, Volume Up, Mute).

## Components

Command → Interface declaring an execute() method.

Concrete Commands (TurnOnCommand, TurnOffCommand, VolumeUpCommand, MuteCommand) → Implement the execute() method and define specific actions.

Receiver (TV) → The actual device that performs the operations (turn on, off, volume, mute).

Invoker (RemoteControl) → Holds the command and triggers it when a button is pressed.

Client (CommandPatternDemo) → Creates commands, assigns them to the remote, and simulates button presses.

## Directory Structure
CommandPatternDemo/
├── src/
│   └── com/
│       └── example/
│           └── command/
│               ├── Command.java
│               ├── TV.java
│               ├── TurnOnCommand.java
│               ├── TurnOffCommand.java
│               ├── VolumeUpCommand.java
│               ├── MuteCommand.java
│               ├── RemoteControl.java
│               └── CommandPatternDemo.java
└── README.md

## Example Execution
TV is ON
TV Volume Increased
TV is Muted
TV is OFF


## Use Cases

Remote Controls / GUI Buttons → Each button is a command.

Task Queues & Undo Functionality → Store commands in history and undo them later.

Macro Recording → Record a series of commands and execute them as a batch.

Transaction Management → Database commit/rollback can use commands.