package com.cloudintegration.providers.azure;

import com.cloudintegration.services.DatabaseService;

public class AzureDatabase implements DatabaseService {
    
    private String region;
    private boolean isConnected = false;
    
    public AzureDatabase() {
        this.region = "East US";
    }
    
    @Override
    public void connect() {
        System.out.println("🔗 Connecting to Azure SQL Database...");
        System.out.println("   - Using Azure SDK");
        System.out.println("   - Region: " + region);
        System.out.println("   - Authentication: Azure Active Directory");
        isConnected = true;
        System.out.println("✅ Connected to Azure SQL Database!");
        System.out.println();
    }
    
    @Override
    public void createDatabase(String databaseName) {
        if (!isConnected) {
            connect();
        }
        System.out.println("📊 Creating Azure SQL Database: " + databaseName);
        System.out.println("   - Service Tier: Standard");
        System.out.println("   - Performance Level: S2");
        System.out.println("   - Geo-Replication: Enabled");
        System.out.println("✅ Azure Database '" + databaseName + "' created successfully!");
        System.out.println();
    }
    
    @Override
    public String executeQuery(String query) {
        System.out.println("🔍 Executing query on Azure SQL: " + query);
        return "Azure SQL Query Result: [Sample Data from " + region + "]";
    }
    
    @Override
    public void disconnect() {
        System.out.println("🔌 Disconnecting from Azure SQL Database...");
        isConnected = false;
        System.out.println("✅ Azure SQL connection closed!");
        System.out.println();
    }
    
    @Override
    public String getDatabaseInfo() {
        return "Azure SQL Database - Standard S2 in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Microsoft Azure";
    }
}