package com.mobileapp.config.demo;
import com.mobileapp.config.ConfigurationManager;

public class ConfigDemo {
    
    public static void main(String[] args) {
        System.out.println(" Mobile App Configuration Demo");
        System.out.println("================================\n");

        simulateHomeScreen();
        simulateSettingsScreen();
        simulateProfileScreen();
        simulateNotificationService();
    
        demonstrateSingletonBehavior();
    }
    
    private static void simulateHomeScreen() {
        System.out.println(" HOME SCREEN - Loading..."); 
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.displayCurrentConfig();
    }
    
    private static void simulateSettingsScreen() {
        System.out.println(" SETTINGS SCREEN - User making changes...");
        
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.updateThemeColor("Dark");
        System.out.println(" User changed theme to Dark");
        config.updateLanguage("Spanish");
        System.out.println(" User changed language to Spanish");
        config.toggleNotifications();
        System.out.println(" User disabled notifications");
        config.displayCurrentConfig();
    }

    private static void simulateProfileScreen() {
        System.out.println(" PROFILE SCREEN - Loading...");
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.updateUsername("Sujith");
        System.out.println(" Username updated to Sujith");
        config.displayCurrentConfig();
    }
    private static void simulateNotificationService() {
        System.out.println(" NOTIFICATION SERVICE - Checking settings...");
        ConfigurationManager config = ConfigurationManager.getInstance();
        if (config.getUserPreferences().isNotificationEnabled()) {
            System.out.println(" Sending push notification...");
        } else {
            System.out.println(" Notifications disabled - No notification sent");
        }
        System.out.println();
    }
    
    // Demonstrate that all parts use the same instance
    private static void demonstrateSingletonBehavior() {
        System.out.println(" SINGLETON BEHAVIOR DEMONSTRATION");
        System.out.println("==================================");
        
        // Get instances from different parts of the app
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        ConfigurationManager config3 = ConfigurationManager.getInstance();
        
        System.out.println("config1 == config2: " + (config1 == config2));
        System.out.println("config2 == config3: " + (config2 == config3));
        System.out.println("config1 == config3: " + (config1 == config3));

        System.out.println();
        System.out.println("Memory addresses:");
        System.out.println("config1: " + config1.hashCode());
        System.out.println("config2: " + config2.hashCode());
        System.out.println("config3: " + config3.hashCode());
        
        System.out.println("\n All instances point to the same object in memory!");
        System.out.println(" Configuration remains consistent throughout the app!");
    }
}