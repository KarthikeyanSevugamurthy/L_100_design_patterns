# Composite Pattern - Company Org Chart

## Overview

This project demonstrates the **Composite Design Pattern** using a **Company Organizational Hierarchy**.

## Components

- `EmployeeComponent` – Common interface for both employee and manager.
- `Employee` – Represents a single employee (Leaf).
- `Manager` – Composite class that can have subordinates (either Employees or other Managers).

## Features

- Easy to build tree-like company structure.
- Treat individual employees and managers uniformly.

## How to Run

1. Compile all files inside `src/`.
2. Run `Main.java`.

## Pattern Benefits

- Unified treatment of simple and composite objects.
- Simplifies client logic.
