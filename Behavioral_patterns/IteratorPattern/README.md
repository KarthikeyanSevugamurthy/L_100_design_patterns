# Iterator Pattern

## Overview
The **Iterator Design Pattern** is a behavioral pattern that provides a way to access elements of a collection sequentially without exposing its underlying representation. It simplifies traversal and allows forward/backward iteration.

In this project, the Iterator Pattern is demonstrated through a playlist of songs.

## Components
- **Iterator (Iterator)** → Interface defining `hasNext()`, `next()`, `hasPrevious()`, and `previous()`.
- **Concrete Iterator (SongIterator)** → Implements traversal logic for the playlist.
- **Aggregate (Playlist)** → Stores the collection and provides an iterator to traverse songs.
- **Client (IteratorDemo)** → Uses the iterator to play songs forward and backward.

## Directory Structure
IteratorPatternDemo/
├── src/
│ └── com/
│ └── example/
│ └── iterator/
│ ├── Iterator.java
│ ├── Playlist.java
│ └── IteratorDemo.java
└── README.md

## Example Execution
Playing songs forward:
Song A
Song B
Song C

Playing songs backward:
Song C
Song B
Song A

## Use Cases
- Traversing collections (lists, sets, trees, graphs)
- Playlist or media navigation
- Browser history (forward/backward navigation)
- Iterating over custom data structures