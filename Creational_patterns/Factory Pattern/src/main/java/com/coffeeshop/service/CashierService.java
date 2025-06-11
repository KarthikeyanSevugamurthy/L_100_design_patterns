package com.coffeeshop.service;
import com.coffeeshop.factory.CoffeeFactory;
import com.coffeeshop.model.Coffee;

/**
 * Cashier Service - Handles customer orders
 * Notice how the cashier doesn't need to know how to make coffee!
 */
public class CashierService {
    
    private String cashierName;
    private int totalOrders;
    private double totalSales;
    
    public CashierService(String cashierName) {
        this.cashierName = cashierName;
        this.totalOrders = 0;
        this.totalSales = 0.0;
    }
    
    /**
     * Process customer order
     * The cashier just takes the order and delegates coffee creation to factory
     */
    public Coffee processOrder(String customerName, String coffeeType) {
        
        System.out.println("Cashier " + cashierName + ": Hello " + customerName + "!");
        System.out.println("Taking order for: " + coffeeType);
        System.out.println();
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
        
        if (coffee != null) {
            totalOrders++;
            totalSales += coffee.getPrice();
            System.out.println("Price: $" + coffee.getPrice());
            System.out.println("Preparation time: " + coffee.getPreparationTime() + " minutes");
            System.out.println("Order sent to barista...");
            System.out.println();

            return coffee;
        } else {
            System.out.println("Unable to process order");
            displayMenu();
            return null;
        }
    }

    // Display available menu to customer
    public void displayMenu() {
        System.out.println(" Our Coffee Menu:");
        System.out.println("-------------------");
        
        String[] availableCoffees = CoffeeFactory.getAvailableCoffeeTypes();
        
        for (String coffeeType : availableCoffees) {
            Coffee sampleCoffee = CoffeeFactory.createCoffee(coffeeType);
            if (sampleCoffee != null) {
                System.out.println( coffeeType + " - $" + sampleCoffee.getPrice());
            }
        }
        System.out.println("-------------------");
        System.out.println();
    }

    // Display cashier's daily summary
    public void displayDailySummary() {
        System.out.println("Daily Summary for " + cashierName);
        System.out.println("============================");
        System.out.println("Total Orders: " + totalOrders);
        System.out.println("Total Sales: $" + String.format("%.2f", totalSales));
        System.out.println("============================");
        System.out.println();
    }
    public String getCashierName() {
        return cashierName;
    }
    
    public int getTotalOrders() {
        return totalOrders;
    }
    
    public double getTotalSales() {
        return totalSales;
    }
}