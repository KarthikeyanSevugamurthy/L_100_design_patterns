# Mobile App Configuration Manager - Singleton Pattern

## Overview
This project demonstrates the Singleton design pattern through a practical example of managing user preferences in a mobile application.

## Key Features
- ✅ Single instance of configuration manager
- ✅ Thread-safe lazy initialization
- ✅ Consistent configuration across app screens
- ✅ Easy configuration updates
- ✅ Simulated persistence layer

## How to Run
1. Navigate to the project directory
2. Compile: `javac -d . src/main/java/com/mobileapp/config/*.java src/main/java/com/mobileapp/config/demo/*.java`
3. Run: `java com.mobileapp.config.demo.ConfigDemo`

## Pattern Benefits Demonstrated
- **Single Source of Truth**: All app components access the same configuration
- **Memory Efficiency**: Only one configuration object in memory
- **Consistency**: Changes made in one screen are reflected everywhere
- **Global Access**: Easy access from any part of the application
```

---

## Expected Output

When you run the demo, you'll see output like:

```
 Mobile App Configuration Demo
================================

 HOME SCREEN - Loading...
 Loading user preferences from storage...
 Configuration Manager initialized!
 Current Configuration:
   Theme: Blue
   Language: English
   Notifications: ON
   Username: Guest

 SETTINGS SCREEN - User making changes...
 User changed theme to Dark
 Saving configuration changes...
 User changed language to Spanish
 Saving configuration changes...
 User disabled notifications
 Saving configuration changes...
 Current Configuration:
   Theme: Dark
   Language: Spanish
   Notifications: OFF
   Username: Guest

 PROFILE SCREEN - Loading...
 Username updated to Sujith
 Saving configuration changes...
 Current Configuration:
   Theme: Dark
   Language: Spanish
   Notifications: OFF
   Username: Sujith

 NOTIFICATION SERVICE - Checking settings...
 Notifications disabled - No notification sent

 SINGLETON BEHAVIOR DEMONSTRATION
==================================
config1 == config2: true
config2 == config3: true
config1 == config3: true

Memory addresses:
config1: 1854731462
config2: 1854731462
config3: 1854731462

 All instances point to the same object in memory!
 Configuration remains consistent throughout the app!
```

## Key Learning Points

1. **Single Instance**: Only one `ConfigurationManager` object exists
2. **Global Access**: Any part of the app can access configuration via `getInstance()`
3. **Consistency**: Changes made in one screen are immediately available to all other screens
4. **Lazy Initialization**: The instance is created only when first requested
5. **Memory Efficiency**: No duplicate configuration objects in memory

This implementation shows how Singleton pattern solves real-world problems in mobile app development by ensuring consistent user preferences across the entire application.