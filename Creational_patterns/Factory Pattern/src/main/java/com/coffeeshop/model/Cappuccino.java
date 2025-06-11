package com.coffeeshop.model;

/**
 * Cappuccino coffee implementation
 */
public class Cappuccino implements Coffee {
    
    private String name = "Cappuccino";
    private double price = 4.00;
    private int preparationTime = 4;
    
    @Override
    public void prepare() {
        System.out.println(" Preparing " + name + "...");
        System.out.println("   - Grinding coffee beans");
        System.out.println("   - Extracting espresso shot");
        System.out.println("   - Steaming milk to creamy texture");
        System.out.println("   - Adding steamed milk to espresso");
        System.out.println("   - Creating milk foam art");
        System.out.println(name + " is ready!");
        System.out.println();
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public int getPreparationTime() {
        return preparationTime;
    }
}