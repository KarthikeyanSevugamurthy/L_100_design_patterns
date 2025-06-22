# Cloud Service Integration - Abstract Factory Pattern

## Overview
This project demonstrates the Abstract Factory Pattern through a practical cloud service integration system that supports multiple cloud providers (AWS, Azure, Google Cloud) with consistent interfaces.

## Key Features
-  Multi-cloud provider support
-  Consistent service families (Database, Storage, Compute)
-  Easy provider switching
-  Platform-independent application code
-  Configuration-driven provider selection

## Project Structure
```
com.cloudintegration/
├── services/           # Abstract service interfaces
├── providers/          # Cloud provider implementations
│   ├── aws/           # AWS-specific services
│   ├── azure/         # Azure-specific services
│   └── google/        # Google Cloud-specific services
├── factory/           # Abstract factory and provider manager
└── demo/              # Demonstration and testing
```

## Supported Cloud Providers
- **Amazon Web Services (AWS)**
  - RDS (Database), S3 (Storage), EC2 (Compute)
- **Microsoft Azure**
  - SQL Database, Blob Storage, Virtual Machines
- **Google Cloud Platform**
  - Cloud SQL, Cloud Storage, Compute Engine

## How to Run
1. Navigate to the project directory  
2. Compile: `javac -d . src/main/java/com/cloudintegration/*/*.java src/main/java/com/cloudintegration/*/*/*.java`
3. Run: `java com.cloudintegration.demo.CloudIntegrationDemo`

## Abstract Factory Pattern Benefits
- **Family Consistency**: All services from same provider work together
- **Easy Switching**: Change providers without modifying application logic
- **Platform Independence**: Application code independent of specific cloud APIs
- **Extensibility**: Easy to add new cloud providers

## Adding New Cloud Providers
1. Create provider package (e.g., `com.cloudintegration.providers.oracle`)
2. Implement `DatabaseService`, `StorageService`, `ComputeService` interfaces
3. Create factory class implementing `CloudServiceFactory`
4. Update `CloudProviderManager` with new provider case
5. No changes needed in application code!

## Configuration Examples
```java
// Development environment
CloudServiceFactory factory = CloudProviderManager.getCloudFactory("Google");

// Production environment  
CloudServiceFactory factory = CloudProviderManager.getCloudFactory("AWS");

// Same application code works with both!
DatabaseService db = factory.createDatabaseService();
StorageService storage = factory.createStorageService();
ComputeService compute = factory.createComputeService();
```
```

---

## Expected Output

When you run the demo, you'll see output like:

```
 Cloud Service Integration Demo -  Abstract Factory Pattern
==============================================================

 Setting up AWS Cloud Environment
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

 Cloud Provider Manager: Selecting AWS factory...

 AWS Factory: Creating RDS Database Service...
 AWS Factory: Creating S3 Storage Service...
 AWS Factory: Creating EC2 Compute Service...
 Selected: Amazon Web Services (AWS)
 AWS provides scalable cloud computing services including RDS, S3, and EC2

 Using AWS Cloud Services:
──────────────────────────────────────────
 Creating AWS RDS Database: MyAppDatabase
   - Engine: MySQL 8.0
   - Instance Class: db.t3.micro
   - Multi-AZ: Enabled
 AWS Database 'MyAppDatabase' created successfully!

 Executing query on AWS RDS: SELECT * FROM users
 Query Result: AWS RDS Query Result: [Sample Data from us-east-1]

 Creating AWS S3 Bucket: myapp-data-bucket
   - Region: us-east-1  
   - Versioning: Enabled
   - Encryption: AES-256
 AWS S3 Bucket 'myapp-data-bucket' created successfully!

 Uploading to AWS S3: user-data.json
   - Using multipart upload
   - Server-side encryption applied
 File uploaded to S3 successfully!

 Starting AWS EC2 Instance: MyAppServer
   - Instance Type: t3.micro
   - AMI: Amazon Linux 2
   - Region: us-east-1
   - Auto Scaling Group: Enabled
 AWS EC2 Instance 'MyAppServer' started successfully!

 Scaling up AWS EC2 instances by 2
   - Using Auto Scaling Group
   - Load Balancer will distribute traffic
 AWS EC2 scaled up! Total instances: 3

 Service Summary:
    Database: AWS RDS - MySQL 8.0 in us-east-1
    Storage: AWS S3 - Object Storage in us-east-1
    Compute: AWS EC2 - 3 instances running in us-east-1

[Similar output for Azure and Google Cloud...]

 ABSTRACT FACTORY PATTERN BENEFITS
====================================

 1. FAMILY CONSISTENCY:
   - All services from same provider work together seamlessly
   - No mixing of incompatible cloud services
   - Consistent authentication and configuration

 2. EASY PROVIDER SWITCHING:
   - Change cloud provider by changing one line of code
   - No need to modify business logic
   - Quick migration between cloud providers

 CONFIGURATION-DRIVEN PROVIDER SELECTION:
──────────────────────────────────────────────
 Environment: Development → Provider: Google
    Google Cloud Platform services initialized
 Environment: Staging → Provider: Azure
    Microsoft Azure services initialized
 Environment: Production → Provider: AWS
    Amazon Web Services (AWS) services initialized

 Same application code works with all providers!
 Configuration drives which cloud services are used!