package com.cloudintegration.services;

public interface StorageService {
    
    // Create storage bucket/container
    void createBucket(String bucketName);
    
    // Upload file to storage
    void uploadFile(String fileName, String content);
    
    // Download file from storage
    String downloadFile(String fileName);
    
    // Delete file from storage
    void deleteFile(String fileName);
    
    // Get storage information
    String getStorageInfo();
    
    // Get provider name
    String getProviderName();
}