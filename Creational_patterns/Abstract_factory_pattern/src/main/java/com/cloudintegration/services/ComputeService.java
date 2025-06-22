package com.cloudintegration.services;

public interface ComputeService {
    
    // Start virtual machine/instance
    void startInstance(String instanceName);
    
    // Stop virtual machine/instance
    void stopInstance(String instanceName);
    
    // Scale resources up
    void scaleUp(int additionalInstances);
    
    // Scale resources down
    void scaleDown(int instancesToRemove);
    
    // Get compute information
    String getComputeInfo();
    
    // Get provider name
    String getProviderName();
}