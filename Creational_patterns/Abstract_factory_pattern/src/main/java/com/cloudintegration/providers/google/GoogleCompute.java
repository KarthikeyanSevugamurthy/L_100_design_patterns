package com.cloudintegration.providers.google;

import com.cloudintegration.services.ComputeService;

public class GoogleCompute implements ComputeService {
    
    private String region;
    private int runningInstances = 0;
    
    public GoogleCompute() {
        this.region = "us-central1";
    }
    
    @Override
    public void startInstance(String instanceName) {
        System.out.println("Starting Google Compute Engine Instance: " + instanceName);
        System.out.println("   - Machine Type: e2-micro");
        System.out.println("   - OS: Debian 11");
        System.out.println("   - Zone: " + region + "-a");
        System.out.println("   - Preemptible: No");
        runningInstances++;
        System.out.println("Google Compute Engine Instance '" + instanceName + "' started successfully!");
        System.out.println();
    }
    
    @Override
    public void stopInstance(String instanceName) {
        System.out.println("Stopping Google Compute Engine Instance: " + instanceName);
        if (runningInstances > 0) {
            runningInstances--;
        }
        System.out.println("Google Compute Engine Instance '" + instanceName + "' stopped!");
        System.out.println();
    }
    
    @Override
    public void scaleUp(int additionalInstances) {
        System.out.println("Scaling up Google Compute Engine instances by " + additionalInstances);
        System.out.println("   - Using Managed Instance Groups");
        System.out.println("   - Google Cloud Load Balancing configured");
        runningInstances += additionalInstances;
        System.out.println("Google Compute Engine scaled up! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public void scaleDown(int instancesToRemove) {
        System.out.println("Scaling down Google Compute Engine instances by " + instancesToRemove);
        runningInstances = Math.max(0, runningInstances - instancesToRemove);
        System.out.println("Google Compute Engine scaled down! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public String getComputeInfo() {
        return "Google Compute Engine - " + runningInstances + " instances running in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Google Cloud Platform";
    }
}