package com.mobileapp.config;

/**
 * Singleton Configuration Manager
 * Ensures only one instance manages user preferences throughout the app
 */
public class ConfigurationManager {
    
    private static ConfigurationManager instance = null;
    
    private UserPreferences userPreferences;
    
    //  Make constructor private so no one can create instance directly
    private ConfigurationManager() {
        loadConfiguration();
        System.out.println(" Configuration Manager initialized!");
    }
    
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfiguration() {
        userPreferences = new UserPreferences();
        System.out.println(" Loading user preferences from storage...");
    }
    
    public UserPreferences getUserPreferences() {
        return userPreferences;
    }

    public void updateThemeColor(String newColor) {
        userPreferences.setThemeColor(newColor);
        saveConfiguration();
    }

    public void updateLanguage(String newLanguage) {
        userPreferences.setLanguage(newLanguage);
        saveConfiguration();
    }

    public void toggleNotifications() {
        userPreferences.setNotificationEnabled(!userPreferences.isNotificationEnabled());
        saveConfiguration();
    }

    public void updateUsername(String newUsername) {
        userPreferences.setUsername(newUsername);
        saveConfiguration();
    }

    private void saveConfiguration() {
        System.out.println(" Saving configuration changes...");
    }

    public void displayCurrentConfig() {
        System.out.println(" Current Configuration:");
        System.out.println("   Theme: " + userPreferences.getThemeColor());
        System.out.println("   Language: " + userPreferences.getLanguage());
        System.out.println("   Notifications: " + (userPreferences.isNotificationEnabled() ? "ON" : "OFF"));
        System.out.println("   Username: " + userPreferences.getUsername());
        System.out.println();
    }
}