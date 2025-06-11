package com.coffeeshop.model;

// Latte coffee implementation
public class Latte implements Coffee {
    
    private String name = "Latte";
    private double price = 4.50;
    private int preparationTime = 5;
    
    @Override
    public void prepare() {
        System.out.println(" Preparing " + name + "...");
        System.out.println("   - Grinding premium coffee beans");
        System.out.println("   - Extracting double espresso shot");
        System.out.println("   - Steaming milk to silky smooth texture");
        System.out.println("   - Pouring steamed milk slowly");
        System.out.println("   - Adding thin layer of foam");
        System.out.println("   - Optional: Adding flavor syrup");
        System.out.println(  name + " is ready!");
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