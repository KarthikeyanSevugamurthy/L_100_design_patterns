# Coffee Shop Ordering System - Factory Pattern

## Overview
This project demonstrates the Factory Pattern through a practical coffee shop ordering system where different types of coffee are created based on customer orders.

## Key Features
-  Factory-based coffee creation
-  Extensible coffee menu system
-  Consistent coffee preparation process
-  Cashier service with order processing
-  Professional separation of concerns

## Project Structure
```
com.coffeeshop/
├── model/          # Coffee interfaces and implementations
├── factory/        # Coffee creation factory
├── service/        # Business logic (Cashier)
└── demo/          # Demonstration and testing
```

## How to Run
1. Navigate to the project directory
2. Compile: `javac -d . src/main/java/com/coffeeshop/*/*.java`
3. Run: `java com.coffeeshop.demo.CoffeeShopDemo`

## Factory Pattern Benefits
- **Encapsulation**: Object creation logic is centralized
- **Extensibility**: Easy to add new coffee types
- **Consistency**: All coffee objects follow same interface
- **Loose Coupling**: Client code independent of concrete classes

## Adding New Coffee Types
1. Create new class implementing `Coffee` interface
2. Add case in `CoffeeFactory.createCoffee()` method
3. Update `getAvailableCoffeeTypes()` method
4. No changes needed in existing client code!
```

---

## Expected Output

When you run the demo, you'll see output like:

```
Welcome to Java Coffee Shop! 
==================================

 Our Coffee Menu:
-------------------
 Coffee Factory: Creating Espresso...
 Espresso - Rs60
 Coffee Factory: Creating Cappuccino...
 Cappuccino - Rs50
 Coffee Factory: Creating Latte...
 Latte - Rs45
-------------------

 Coffee Shop Opens - Morning Rush!
=====================================

 Customer: balaji enters the shop
 Cashier Karthi: Hello balaji!
 Taking order for: Espresso

 Coffee Factory: Creating Espresso...
 Price: Rs60
 Preparation time: 2 minutes
 Order sent to barista...

 Pragathish: Starting preparation...
 Preparing Espresso...
   - Grinding coffee beans
   - Extracting shot with high pressure
   - Serving in small cup
 Espresso is ready!

 Cashier: Here's your Espresso, balaji!
 Customer: Thank you!

[... more orders ...]

Daily Summary for Karthi
============================
Total Orders: 4
Total Sales: Rs215.00
============================
```
 FACTORY PATTERN BENEFITS DEMONSTRATION
==========================================

✅ 1. ENCAPSULATION:
   - Cashier doesn't need to know coffee recipes
   - Factory handles all creation complexity

✅ 2. EXTENSIBILITY:
   - Adding new coffee types is easy
   - Let's simulate adding a new coffee...

📝 To add 'Americano' coffee:
   1. Create Americano.java class implementing Coffee interface
   2. Add 'AMERICANO' case in CoffeeFactory.createCoffee()
   3. Update getAvailableCoffeeTypes() method
   4. No changes needed in cashier or customer code!

🎯 That's the power of Factory Pattern!

## Key Learning Points

1. **Separation of Concerns**: The cashier focuses on customer service, factory handles coffee creation, and each coffee type knows how to prepare itself.

2. **Extensibility**: Adding new coffee types (like Americano, Mocha) only requires changes in the factory and creating the new coffee class.

3. **Consistency**: All coffee objects implement the same interface, ensuring uniform behavior.

4. **Encapsulation**: Complex object creation logic is hidden from the client code.

5. **Loose Coupling**: The cashier service doesn't depend on specific coffee implementations, only on the Coffee interface.

This implementation shows how the Factory Pattern solves real-world problems by centralizing object creation logic and making systems more maintainable and extensible.