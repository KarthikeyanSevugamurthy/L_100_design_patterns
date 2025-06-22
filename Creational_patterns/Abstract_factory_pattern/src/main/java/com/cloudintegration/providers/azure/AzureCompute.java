package com.cloudintegration.providers.azure;

import com.cloudintegration.services.ComputeService;

public class AzureCompute implements ComputeService {
    
    private String region;
    private int runningInstances = 0;
    
    public AzureCompute() {
        this.region = "East US";
    }
    
    @Override
    public void startInstance(String instanceName) {
        System.out.println(" Starting Azure Virtual Machine: " + instanceName);
        System.out.println("   - VM Size: Standard_B2s");
        System.out.println("   - OS: Ubuntu 20.04 LTS");
        System.out.println("   - Region: " + region);
        System.out.println("   - Availability Set: Configured");
        runningInstances++;
        System.out.println(" Azure VM '" + instanceName + "' started successfully!");
        System.out.println();
    }
    
    @Override
    public void stopInstance(String instanceName) {
        System.out.println(" Stopping Azure Virtual Machine: " + instanceName);
        if (runningInstances > 0) {
            runningInstances--;
        }
        System.out.println(" Azure VM '" + instanceName + "' stopped!");
        System.out.println();
    }
    
    @Override
    public void scaleUp(int additionalInstances) {
        System.out.println(" Scaling up Azure VMs by " + additionalInstances);
        System.out.println("   - Using Virtual Machine Scale Sets");
        System.out.println("   - Azure Load Balancer configured");
        runningInstances += additionalInstances;
        System.out.println(" Azure VMs scaled up! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public void scaleDown(int instancesToRemove) {
        System.out.println(" Scaling down Azure VMs by " + instancesToRemove);
        runningInstances = Math.max(0, runningInstances - instancesToRemove);
        System.out.println(" Azure VMs scaled down! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public String getComputeInfo() {
        return "Azure Virtual Machines - " + runningInstances + " instances running in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Microsoft Azure";
    }
}