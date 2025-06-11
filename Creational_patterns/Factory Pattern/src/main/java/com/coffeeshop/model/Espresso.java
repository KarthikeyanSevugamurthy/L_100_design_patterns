package com.coffeeshop.model;

/**
 * Espresso coffee implementation
 */
public class Espresso implements Coffee {
    
    private String name = "Espresso";
    private double price = 50.0;
    private int preparationTime = 2;
    
    @Override
    public void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("   - Grinding coffee beans");
        System.out.println("   - Extracting shot with high pressure");
        System.out.println("   - Serving in small cup");
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