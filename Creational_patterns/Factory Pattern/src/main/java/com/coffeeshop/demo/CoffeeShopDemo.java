package com.coffeeshop.demo;

import com.coffeeshop.model.Coffee;
import com.coffeeshop.service.CashierService;


public class CoffeeShopDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Java Coffee Shop! ☕");
        System.out.println("==================================");
        System.out.println();
        
        // Creating a cashier
        CashierService cashier = new CashierService("Karthi");
        
        // Display menu
        cashier.displayMenu();
        
        // Simulate customer orders throughout the day
        simulateCustomerOrders(cashier);
        
        // Show daily summary
        cashier.displayDailySummary();
    }
    
    private static void simulateCustomerOrders(CashierService cashier) {
        
        System.out.println("Coffee Shop Opens - Morning Rush!");
        System.out.println("=====================================");
        System.out.println();
        processAndServeCoffee(cashier, "Balaji", "Espresso");
        processAndServeCoffee(cashier, "Sri", "Cappuccino");
        processAndServeCoffee(cashier, "Harishankar", "Latte");
        processAndServeCoffee(cashier, "Vibi", "Frappuccino"); // Not available
        processAndServeCoffee(cashier, "Vibi", "Cappuccino");
        System.out.println("End of Morning Rush");
        System.out.println("======================");
        System.out.println();
    }
    
    private static void processAndServeCoffee(CashierService cashier, String customerName, String coffeeType) {
        
        System.out.println(" Customer: " + customerName + " enters the shop");
        Coffee coffee = cashier.processOrder(customerName, coffeeType);
        
        if (coffee != null) {
            System.out.println(" Pragathish: Starting preparation...");
            coffee.prepare();
            System.out.println("Cashier: Here's your " + coffee.getName() + ", " + customerName + "!");
            System.out.println("Customer: Thank you!");
        }
        
        System.out.println("─────────────────────────────────");
        System.out.println();
    }
}