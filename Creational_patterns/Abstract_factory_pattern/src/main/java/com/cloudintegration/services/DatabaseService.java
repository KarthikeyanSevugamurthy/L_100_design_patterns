package com.cloudintegration.services;

public interface DatabaseService {
    
    // Connect to the database
    void connect();
    
    // Create a new database
    void createDatabase(String databaseName);
    
    // Execute query
    String executeQuery(String query);
    
    // Close database connection
    void disconnect();
    
    // Get database information
    String getDatabaseInfo();
    
    // Get provider name
    String getProviderName();
}