package com.cloudintegration.providers.google;

import com.cloudintegration.factory.CloudServiceFactory;
import com.cloudintegration.services.*;

public class GoogleCloudFactory implements CloudServiceFactory {
    
    @Override
    public DatabaseService createDatabaseService() {
        System.out.println("Google Factory: Creating Cloud SQL Service...");
        return new GoogleDatabase();
    }
    
    @Override
    public StorageService createStorageService() {
        System.out.println("Google Factory: Creating Cloud Storage Service...");
        return new GoogleStorage();
    }
    
    @Override
    public ComputeService createComputeService() {
        System.out.println("Google Factory: Creating Compute Engine Service...");
        return new GoogleCompute();
    }
    
    @Override
    public String getProviderName() {
        return "Google Cloud Platform";
    }
    
    @Override
    public String getProviderDescription() {
        return "Google Cloud Platform provides reliable and scalable cloud services including Cloud SQL, Cloud Storage, and Compute Engine";
    }
}