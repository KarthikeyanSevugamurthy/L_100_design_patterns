# Proxy Pattern - Internet Firewall Example

## Overview

This project demonstrates the **Proxy Design Pattern** by simulating an **Internet Firewall**.

## Pattern Components

- `InternetAccess` – Interface that both real and proxy classes implement.
- `RealInternet` – The real object that connects to websites.
- `InternetProxy` – The proxy that filters access to restricted websites.
- `Main` – Simulates a user trying to access the internet.

## Key Feature

Blocks access to blacklisted websites like:
- facebook.com
- instagram.com
- tiktok.com

## Run Instructions

1. Compile all Java files in `src/`
2. Run `Main.java`
