package com.cloudintegration.providers.aws;

import com.cloudintegration.services.DatabaseService;

public class AWSDatabase implements DatabaseService {
    
    private String region;
    private boolean isConnected = false;
    
    public AWSDatabase() {
        this.region = "us-east-1";
    }
    
    @Override
    public void connect() {
        System.out.println(" Connecting to AWS RDS...");
        System.out.println("   - Using AWS SDK");
        System.out.println("   - Region: " + region);
        System.out.println("   - Authentication: AWS IAM");
        isConnected = true;
        System.out.println(" Connected to AWS RDS Database!");
        System.out.println();
    }
    
    @Override
    public void createDatabase(String databaseName) {
        if (!isConnected) {
            connect();
        }
        System.out.println("Creating AWS RDS Database: " + databaseName);
        System.out.println("   - Engine: MySQL 8.0");
        System.out.println("   - Instance Class: db.t3.micro");
        System.out.println("   - Multi-AZ: Enabled");
        System.out.println("AWS Database '" + databaseName + "' created successfully!");
        System.out.println();
    }
    
    @Override
    public String executeQuery(String query) {
        System.out.println("Executing query on AWS RDS: " + query);
        return "AWS RDS Query Result: [Sample Data from " + region + "]";
    }
    
    @Override
    public void disconnect() {
        System.out.println("Disconnecting from AWS RDS...");
        isConnected = false;
        System.out.println("AWS RDS connection closed!");
        System.out.println();
    }
    
    @Override
    public String getDatabaseInfo() {
        return "AWS RDS - MySQL 8.0 in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Amazon Web Services (AWS)";
    }
}