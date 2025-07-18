# Facade Design Pattern

## Definition
The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

## Why Use It?
- To reduce complexity of a subsystem
- To hide the internal implementation details
- To simplify the interface for the client

## Where to Use?
- When you have a complex system and you want to provide a simpler interface
- When you want to decouple the system from the client

## Pros
- Simplifies usage for clients
- Decouples subsystems from client code
- Promotes loose coupling

## Cons
- Adds an extra layer of abstraction
- Might become a god object if not designed carefully

## Real-World Examples
- TV remote control (abstracts internal operations of multiple devices)
- Spring’s JdbcTemplate (simplifies JDBC access)

## Beginner Example
A TV Remote that can turn on the TV, set the volume, and start a channel, while internally calling multiple subsystems like Power, Sound, and Channel.
