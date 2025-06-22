package com.cloudintegration.providers.aws;

import com.cloudintegration.services.StorageService;

public class AWSStorage implements StorageService {
    
    private String region;
    
    public AWSStorage() {
        this.region = "us-east-1";
    }
    
    @Override
    public void createBucket(String bucketName) {
        System.out.println("Creating AWS S3 Bucket: " + bucketName);
        System.out.println("   - Region: " + region);
        System.out.println("   - Versioning: Enabled");
        System.out.println("   - Encryption: AES-256");
        System.out.println("AWS S3 Bucket '" + bucketName + "' created successfully!");
        System.out.println();
    }
    
    @Override
    public void uploadFile(String fileName, String content) {
        System.out.println("Uploading to AWS S3: " + fileName);
        System.out.println("   - Using multipart upload");
        System.out.println("   - Server-side encryption applied");
        System.out.println("File uploaded to S3 successfully!");
        System.out.println();
    }
    
    @Override
    public String downloadFile(String fileName) {
        System.out.println("Downloading from AWS S3: " + fileName);
        return "AWS S3 File Content: [" + fileName + " data from region " + region + "]";
    }
    
    @Override
    public void deleteFile(String fileName) {
        System.out.println("Deleting from AWS S3: " + fileName);
        System.out.println("File deleted from S3!");
        System.out.println();
    }
    
    @Override
    public String getStorageInfo() {
        return "AWS S3 - Object Storage in " + region;
    }
    
    @Override
    public String getProviderName() {
        return "Amazon Web Services (AWS)";
    }
}