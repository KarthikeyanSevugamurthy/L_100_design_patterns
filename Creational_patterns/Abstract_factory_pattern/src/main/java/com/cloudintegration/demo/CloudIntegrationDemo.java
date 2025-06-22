package com.cloudintegration.demo;
import com.cloudintegration.factory.*;
import com.cloudintegration.services.*;

public class CloudIntegrationDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Cloud Service Integration Demo -  Abstract Factory Pattern");
        System.out.println("==============================================================");
        System.out.println();
        
        // Demonstrate different cloud providers
        demonstrateCloudProvider("AWS");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println();
        
        demonstrateCloudProvider("Azure");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println();
        
        demonstrateCloudProvider("Google");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println();
        
        // Show unsupported provider
        demonstrateCloudProvider("Oracle");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println();
        
        // Demonstrate Abstract Factory benefits
        demonstrateAbstractFactoryBenefits();
    }
    
    private static void demonstrateCloudProvider(String providerName) {
        
        System.out.println("Setting up " + providerName + " Cloud Environment");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        
        // Get the appropriate cloud factory
        CloudServiceFactory cloudFactory = CloudProviderManager.getCloudFactory(providerName);
        
        if (cloudFactory == null) {
            System.out.println("Cannot proceed with unsupported provider");
            return;
        }
        
        System.out.println("Selected: " + cloudFactory.getProviderName());
        System.out.println("    "+ cloudFactory.getProviderDescription());
        System.out.println();
        
        // Create family of related cloud services
        DatabaseService database = cloudFactory.createDatabaseService();
        StorageService storage = cloudFactory.createStorageService();
        ComputeService compute = cloudFactory.createComputeService();
        
        // Use the services - they all work together seamlessly
        System.out.println("Using " + providerName + " Cloud Services:");
        System.out.println("──────────────────────────────────────────");
        
        // Database operations
        database.createDatabase("MyAppDatabase");
        String queryResult = database.executeQuery("SELECT * FROM users");
        System.out.println("Query Result: " + queryResult);
        System.out.println();
        
        // Storage operations
        storage.createBucket("myapp-data-bucket");
        storage.uploadFile("user-data.json", "{'users': [...]}");
        System.out.println();
        
        // Compute operations
        compute.startInstance("MyAppServer");
        compute.scaleUp(2);
        System.out.println();
        
        // Show service information
        displayServiceSummary(database, storage, compute);
        
        // Clean up
        database.disconnect();
    }
    
    private static void displayServiceSummary(DatabaseService db, StorageService storage, ComputeService compute) {
        System.out.println("Service Summary:");
        System.out.println("   Database: " + db.getDatabaseInfo());
        System.out.println("   Storage: " + storage.getStorageInfo());
        System.out.println("   Compute: " + compute.getComputeInfo());
        System.out.println();
    }
    
    private static void demonstrateAbstractFactoryBenefits() {
        
        System.out.println("ABSTRACT FACTORY PATTERN BENEFITS");
        System.out.println("====================================");
        System.out.println();
        
        System.out.println("   1. FAMILY CONSISTENCY:");
        System.out.println("   - All services from same provider work together seamlessly");
        System.out.println("   - No mixing of incompatible cloud services");
        System.out.println("   - Consistent authentication and configuration");
        System.out.println();
        
        System.out.println("   2. EASY PROVIDER SWITCHING:");
        System.out.println("   - Change cloud provider by changing one line of code");
        System.out.println("   - No need to modify business logic");
        System.out.println("   - Quick migration between cloud providers");
        System.out.println();
        
        System.out.println("   3. PLATFORM INDEPENDENCE:");
        System.out.println("   - Application code doesn't depend on specific cloud APIs");
        System.out.println("   - Easy to support multiple cloud providers");
        System.out.println("   - Reduced vendor lock-in");
        System.out.println();
        
        System.out.println("   4. EXTENSIBILITY:");
        System.out.println("   - Adding new cloud provider is straightforward");
        System.out.println("   - Just implement the factory interface");
        System.out.println("   - Existing code remains unchanged");
        System.out.println();
        
        // Simulate configuration-driven provider selection
        simulateConfigurationDrivenSelection();
    }
    
    private static void simulateConfigurationDrivenSelection() {
        System.out.println("  CONFIGURATION-DRIVEN PROVIDER SELECTION:");
        System.out.println("──────────────────────────────────────────────");
        
        // Simulate different environments
        String[] environments = {"Development", "Staging", "Production"};
        String[] providers = {"Google", "Azure", "AWS"};
        
        for (int i = 0; i < environments.length; i++) {
            String env = environments[i];
            String provider = providers[i];
            
            System.out.println(" Environment: " + env + " → Provider: " + provider);
            
            CloudServiceFactory factory = CloudProviderManager.getCloudFactory(provider);
            if (factory != null) {
                System.out.println("    " + factory.getProviderName() + " services initialized");
            }
        }
        
        System.out.println();
        System.out.println(" Same application code works with all providers!");
        System.out.println(" Configuration drives which cloud services are used!");
    }
}