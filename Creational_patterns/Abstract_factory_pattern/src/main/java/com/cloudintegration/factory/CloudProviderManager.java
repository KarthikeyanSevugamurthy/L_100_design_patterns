package com.cloudintegration.factory;

import com.cloudintegration.providers.aws.AWSCloudFactory;
import com.cloudintegration.providers.azure.AzureCloudFactory;
import com.cloudintegration.providers.google.GoogleCloudFactory;

public class CloudProviderManager {
    
    /**
     * Get cloud service factory based on provider name
     * @param providerName - name of the cloud provider
     * @return CloudServiceFactory for the specified provider
     */
    public static CloudServiceFactory getCloudFactory(String providerName) {
        
        String provider = providerName.toUpperCase().trim();
        
        System.out.println("Cloud Provider Manager: Selecting " + providerName + " factory...");
        System.out.println();
        
        switch (provider) {
            case "AWS":
            case "AMAZON":
                return new AWSCloudFactory();
                
            case "AZURE":
            case "MICROSOFT":
                return new AzureCloudFactory();
                
            case "GOOGLE":
            case "GCP":
            case "GOOGLECLOUD":
                return new GoogleCloudFactory();
                
            default:
                System.out.println("Unsupported cloud provider: " + providerName);
                System.out.println("Supported providers: AWS, Azure, Google");
                return null;
        }
    }
    
    /**
     * Get list of supported cloud providers
     * @return array of supported provider names
     */
    public static String[] getSupportedProviders() {
        return new String[]{"AWS", "Azure", "Google"};
    }
    
    /**
     * Check if cloud provider is supported
     * @param providerName - provider name to check
     * @return true if supported, false otherwise
     */
    public static boolean isProviderSupported(String providerName) {
        String provider = providerName.toUpperCase().trim();
        return provider.equals("AWS") || 
               provider.equals("AMAZON") ||
               provider.equals("AZURE") || 
               provider.equals("MICROSOFT") ||
               provider.equals("GOOGLE") || 
               provider.equals("GCP") ||
               provider.equals("GOOGLECLOUD");
    }
}