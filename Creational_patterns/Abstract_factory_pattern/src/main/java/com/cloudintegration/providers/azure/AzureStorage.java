package com.cloudintegration.providers.azure;

import com.cloudintegration.services.StorageService;

public class AzureStorage implements StorageService {
    
    private String region;
    
    public AzureStorage() {
        this.region = "East US";
    }
    
    @Override
    public void createBucket(String bucketName) {
        System.out.println("Creating Azure Blob Container: " + bucketName);
        System.out.println("   - Region: " + region);
        System.out.println("   - Access Tier: Hot");
        System.out.println("   - Replication: LRS (Locally Redundant)");
        System.out.println("Azure Blob Container '" + bucketName + "' created successfully!");
        System.out.println();
    }
    
    @Override
    public void uploadFile(String fileName, String content) {
        System.out.println("Uploading to Azure Blob Storage: " + fileName);
        System.out.println("   - Using block blob type");
        System.out.println("   - Encryption at rest enabled");
        System.out.println("File uploaded to Azure Blob successfully!");
        System.out.println();
    }
    
    @Override
    public String downloadFile(String fileName) {
        System.out.println("Downloading from Azure Blob Storage: " + fileName);
        return "Azure Blob File Content: [" + fileName + " data from region " + region + "]";
    }
    
    @Override
    public void deleteFile(String fileName) {
        System.out.println("Deleting from Azure Blob Storage: " + fileName);
        System.out.println("File deleted from Azure Blob!");
        System.out.println();
    }
    
    @Override
    public String getStorageInfo() {
        return "Azure Blob Storage - Hot tier in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Microsoft Azure";
    }
}