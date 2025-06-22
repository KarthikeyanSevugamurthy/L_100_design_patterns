package com.cloudintegration.factory;

import com.cloudintegration.services.*;

public interface CloudServiceFactory {
    
    // Create database service specific to the cloud provider
    DatabaseService createDatabaseService();
    
    // Create storage service specific to the cloud provider  
    StorageService createStorageService();
    
    // Create compute service specific to the cloud provider
    ComputeService createComputeService();
    
    // Get provider name
    String getProviderName();
    
    // Get provider description
    String getProviderDescription();
}