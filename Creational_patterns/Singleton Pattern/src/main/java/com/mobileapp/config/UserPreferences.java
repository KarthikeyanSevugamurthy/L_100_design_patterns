package com.mobileapp.config;

/**
 * Simple data class to hold user preferences
 */
public class UserPreferences {
    private String themeColor;
    private String language;
    private boolean notificationEnabled;
    private String username;
    
    public UserPreferences() {
        // Default values
        this.themeColor = "Blue";
        this.language = "English";
        this.notificationEnabled = true;
        this.username = "Guest";
    }
    public String getThemeColor() {
        return themeColor;
    }
    
    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public boolean isNotificationEnabled() {
        return notificationEnabled;
    }
    
    public void setNotificationEnabled(boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return "UserPreferences{" +
                "themeColor='" + themeColor + '\'' +
                ", language='" + language + '\'' +
                ", notificationEnabled=" + notificationEnabled +
                ", username='" + username + '\'' +
                '}';
    }
}