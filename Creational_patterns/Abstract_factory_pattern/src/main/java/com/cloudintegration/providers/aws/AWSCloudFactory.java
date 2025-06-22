package com.cloudintegration.providers.aws;
import com.cloudintegration.factory.CloudServiceFactory;
import com.cloudintegration.services.*;

public class AWSCloudFactory implements CloudServiceFactory {
    
    @Override
    public DatabaseService createDatabaseService() {
        System.out.println("AWS Factory: Creating RDS Database Service...");
        return new AWSDatabase();
    }
    
    @Override
    public StorageService createStorageService() {
        System.out.println(" AWS Factory: Creating S3 Storage Service...");
        return new AWSStorage();
    }
    
    @Override
    public ComputeService createComputeService() {
        System.out.println(" AWS Factory: Creating EC2 Compute Service...");
        return new AWSCompute();
    }
    
    @Override
    public String getProviderName() {
        return "Amazon Web Services (AWS)";
    }
    
    @Override
    public String getProviderDescription() {
        return "AWS provides scalable cloud computing services including RDS, S3, and EC2";
    }
}