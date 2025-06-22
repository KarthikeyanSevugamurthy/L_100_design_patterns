package com.cloudintegration.providers.azure;

import com.cloudintegration.factory.CloudServiceFactory;
import com.cloudintegration.services.*;


public class AzureCloudFactory implements CloudServiceFactory {
    
    @Override
    public DatabaseService createDatabaseService() {
        System.out.println(" Azure Factory: Creating SQL Database Service...");
        return new AzureDatabase();
    }
    
    @Override
    public StorageService createStorageService() {
        System.out.println(" Azure Factory: Creating Blob Storage Service...");
        return new AzureStorage();
    }
    
    @Override
    public ComputeService createComputeService() {
        System.out.println(" Azure Factory: Creating Virtual Machine Service...");
        return new AzureCompute();
    }
    
    @Override
    public String getProviderName() {
        return "Microsoft Azure";
    }
    
    @Override
    public String getProviderDescription() {
        return "Azure provides enterprise-grade cloud services including SQL Database, Blob Storage, and Virtual Machines";
    }
}