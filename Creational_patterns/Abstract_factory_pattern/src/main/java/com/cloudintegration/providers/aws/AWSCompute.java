package com.cloudintegration.providers.aws;

import com.cloudintegration.services.ComputeService;


public class AWSCompute implements ComputeService {
    
    private String region;
    private int runningInstances = 0;
    
    public AWSCompute() {
        this.region = "us-east-1";
    }
    
    @Override
    public void startInstance(String instanceName) {
        System.out.println("Starting AWS EC2 Instance: " + instanceName);
        System.out.println("   - Instance Type: t3.micro");
        System.out.println("   - AMI: Amazon Linux 2");
        System.out.println("   - Region: " + region);
        System.out.println("   - Auto Scaling Group: Enabled");
        runningInstances++;
        System.out.println("AWS EC2 Instance '" + instanceName + "' started successfully!");
        System.out.println();
    }
    
    @Override
    public void stopInstance(String instanceName) {
        System.out.println("Stopping AWS EC2 Instance: " + instanceName);
        if (runningInstances > 0) {
            runningInstances--;
        }
        System.out.println("AWS EC2 Instance '" + instanceName + "' stopped!");
        System.out.println();
    }
    
    @Override
    public void scaleUp(int additionalInstances) {
        System.out.println("Scaling up AWS EC2 instances by " + additionalInstances);
        System.out.println("   - Using Auto Scaling Group");
        System.out.println("   - Load Balancer will distribute traffic");
        runningInstances += additionalInstances;
        System.out.println("AWS EC2 scaled up! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public void scaleDown(int instancesToRemove) {
        System.out.println("Scaling down AWS EC2 instances by " + instancesToRemove);
        runningInstances = Math.max(0, runningInstances - instancesToRemove);
        System.out.println("AWS EC2 scaled down! Total instances: " + runningInstances);
        System.out.println();
    }
    
    @Override
    public String getComputeInfo() {
        return "AWS EC2 - " + runningInstances + " instances running in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Amazon Web Services (AWS)";
    }
}