# IST 411: Creating a List View / Detail View Application in Play
## Penn State University
### Instructor: Joseph Oaks
### Assignment: L12: Creating a List View / Detail View Application in Play
### Team 3 Members: James Swartz, Karl Rhinebolt, James Raynor, Max Lawson, Lincoln Quick

## Project Overview
This project is a Medication Management System that offers both List View and Detail View functionalities. Users can view all medications, or they can select a specific medication by ID to view its details. It's part of the IST 411 course at Penn State University.

## Requirements
- IntelliJ
- Play Framework Version 2.8.20
- Java 11.0.20
- sbt 1.9.3

## How to Run
### Prerequisites
Make sure you have the following installed on your system:
- Java 11.0.20
- sbt 1.9.3
- Play Framework 2.8.20

### Step-by-Step Guide

1. **Clone the Repository**: Clone the project repository from GitHub or download the zip file and extract it to your local system.


2. **Navigate to Project Directory**: Open the terminal and navigate to the project directory.


3. **Run the Application**: Run the application using the Play Framework. `sbt run` This command will download the required dependencies, compile the project, and start the server.

4. **Access the Application**: Open your web browser and navigate to `http://localhost:9000/` to access the application's landing page.

5. **Explore the Features**: Use the links provided on the landing page to view the Medication List View and Detail Views, or manually enter URLs such as `http://localhost:9000/medications` to explore the functionalities.

6. **Stop the Application**: When you are done exploring, return to the terminal and press `Ctrl+C` to stop the running application.

### Troubleshooting
If you encounter any issues during installation or running the application, make sure all prerequisites are properly installed and up to date. If problems persist, consult the Play Framework's documentation or reach out to our team.

### Note
The project was developed and tested using IntelliJ and Play Framework Version 2.8.20 running Java 11.0.20, sbt 1.9.3.


## Authors
- James Swartz
- Karl Rhinebolt
- James Raynor
- Max Lawson
- Lincoln Quick

## Class and Instructor
- Class: IST 411, Penn State University
- Instructor: Joseph Oaks

## Walkthrough Script
### Introduction
"Hello and welcome to this walkthrough of our project. Today, I will be guiding you through the code and functionality we have implemented. Our team has worked diligently to create a Medication Management System, providing both List View and Detail View for medications. Let's dive into the source code."

### Medication Entity
"First, let's take a look at the Medication class. This class encapsulates the details of a medication, including ID, prescription date, medication name, prescribing physician, refills remaining, and expiry date. The class provides a clear structure for managing medications."

### MedicationService Class:
"Next, let's explore the MedicationService class. This class manages the operations related to medications, including fetching a single medication by its ID and retrieving all medications. It's implemented as a Singleton pattern to ensure that only one instance is created."

### MedicationController Class:
"The MedicationController class is responsible for handling HTTP requests and interacting with the MedicationService. Here we have methods to return a specific medication's Detail View and a complete List View of all medications."

### List and Detail Views:
"We have designed two views using HTML and Bootstrap for a better user experience. The ListView displays a complete list of medications with all their details, while the DetailView focuses on presenting the information of a single medication identified by its ID."

### Live Demo:
"Now, let's move on to the live demo. We'll start with the List View. As you can see, all medications are displayed here in a user-friendly manner."

"Next, let's move on to the Detail View. By specifying an ID in the URL, we can view the details of a specific medication.  Here's the detailed information for the medication with the specified ID."

### Conclusion:
"To summarize, we have successfully implemented a Medication Management System with both List View and Detail View as per the assignment requirements. Our team focused on clean code, efficient design, and user-friendly interfaces. We hope this demonstration provided a comprehensive overview of our project."

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

