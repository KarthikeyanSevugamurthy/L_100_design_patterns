package com.coffeeshop.factory;

import com.coffeeshop.model.*;

public class CoffeeFactory {
    
    /**
     * Creates coffee object based on coffee type
     * This method encapsulates all the object creation logic
     * 
     * @param coffeeType - the type of coffee to create
     * @return Coffee object or null if type not supported
     */
    public static Coffee createCoffee(String coffeeType) {
        
        String type = coffeeType.toUpperCase().trim();
        
        System.out.println(" Coffee Factory: Creating " + coffeeType + "...");
        
        switch (type) {
            case "ESPRESSO":
                return new Espresso();
                
            case "CAPPUCCINO":
                return new Cappuccino();
                
            case "LATTE":
                return new Latte();
                
            default:
                System.out.println(" Sorry, we don't serve " + coffeeType);
                System.out.println(" Available options: Espresso, Cappuccino, Latte");
                return null;
        }
    }
    
    /**
     * Get available coffee menu
     * @return array of available coffee types
     */
    public static String[] getAvailableCoffeeTypes() {
        return new String[]{"Espresso", "Cappuccino", "Latte"};
    }
    
    /**
     * Check if coffee type is available
     * @param coffeeType - coffee type to check
     * @return true if available, false otherwise
     */
    public static boolean isCoffeeAvailable(String coffeeType) {
        String type = coffeeType.toUpperCase().trim();
        return type.equals("ESPRESSO") || 
               type.equals("CAPPUCCINO") || 
               type.equals("LATTE");
    }
}