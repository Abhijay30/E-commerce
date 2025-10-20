🚀 E-commerce Spring Boot API (Telusko Tutorial)

A Spring Boot REST API developed for powering an e-commerce platform for product listing and management. The API serves data to a separate frontend built with React (as covered in the Telusko tutorial).

This project was built following the insightful guidance from the Telusko tutorial series.

🌟 Features

RESTful Endpoints: Implements core CRUD (Create, Read, Update, Delete) functionality for e-commerce entities (e.g., Product, Order, or User).

Database Integration: Utilizes the lightweight H2 In-Memory Database for data persistence during development and testing.

API Backend: Provides a high-performance REST API designed to be consumed by the separate React frontend.

Image Handling: Implements logic for uploading and retrieving product images via the API.

Dependency Injection: Leverages Spring IoC Container for managing dependencies and components.

🛠️ Technologies Used

The project is built on the following stack:

Technology

Version

Description

Java

21 (LTS, min 17)

Core programming language.

Spring Boot

3.2.x

Primary framework for quick setup and configuration of the API.

Spring MVC

N/A (Included with Boot)

Used for building RESTful web services.

Database

H2 Database (In-Memory)

Lightweight, in-memory database for rapid development.

Frontend

React

The single-page application (SPA) client used to consume the API.

Build Tool

Maven

Used for dependency management and building.

⚙️ Setup and Run Locally (Backend API)

This section details how to run the Spring Boot API, which is located in the E-commerce/E-commerce directory.

1. Prerequisites

Java Development Kit (JDK) 17 or higher

Maven

2. Clone the Repository

git clone [https://github.com/Abhijay30/E-commerce](https://github.com/Abhijay30/E-commerce)
cd E-commerce/E-commerce


3. Configure the Database

Since this project uses the H2 In-Memory Database, no external database setup is required. The database instance is created and populated (if applicable) when the application starts.

4. Build and Run

Using Maven:

# Build the project (creates the target JAR file)
mvn clean install

# Run the application
mvn spring-boot:run


5. Access the API

Once the application starts successfully, the API will be running at:

Base URL: http://localhost:8080 (Default port)

H2 Console: http://localhost:8080/h2-console

6. Running the Frontend (React Client)

The React frontend code is available in the ecom-frontend-3-main directory within the repository.

Navigate to the frontend directory:

cd ../ecom-frontend-3-main


Install dependencies:

npm install


Run the React application:

npm run dev


Ensure the React application is configured to call the API running on http://localhost:8080.

🎓 Tutorial Acknowledgment

This project serves as a practical implementation of concepts learned through the following Telusko tutorial:

Series/Course Name: Spring Framework and Spring Boot Tutorial with Project

Link: https://www.youtube.com/watch?v=-Fe0zk-F4OA

📜 License

This project is open-source and available under the MIT License.
