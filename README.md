# **🚀 E-commerce Spring Boot API (Telusko Tutorial)**

**A complete E-commerce REST API built with Spring Boot, designed to handle product management, image uploads, and serve data to a separate React frontend.**

This project was built following the insightful guidance from the **Telusko** tutorial series by **Navin Reddy**.

## **🌟 Features**

* **RESTful Endpoints:** Implements the full CRUD (Create, Read, Update, Delete) operation set for product entities.  
* **Search Functionality:** Supports searching products across multiple fields using a custom query.  
* **Image Handling:** Logic for uploading and retrieving product images via multi-part file requests.  
* **Database Integration:** Uses the lightweight **H2 In-Memory Database** for data persistence.  
* **Cross-Origin Resource Sharing (CORS):** Properly configured to allow access from the local React frontend.

## **🛠️ Technologies Used**

The project is built on the following stack:

| Technology | Version | Description |
| :---- | :---- | :---- |
| **Java** | **21** | Core programming language. |
| **Spring Boot** | **3.5.6** | Framework for rapid application development and configuration. |
| **Spring Data JPA** | N/A (Included with Boot) | Used for easy database interactions and ORM. |
| **Database** | **H2 Database (In-Memory)** | Lightweight, fast database for development and testing. |
| **Frontend** | **React** | The single-page application (SPA) client (located in a separate folder). |
| **Build Tool** | **Maven** | Used for dependency management and building. |

## **⚙️ Setup and Run Locally**

The repository contains two main parts: the **Backend API** (E-commerce) and the **Frontend Client** (ecom-frontend-3-main). Both must be run separately.

### **1\. Prerequisites**

* Java Development Kit (JDK) **17 or higher**  
* **Maven**  
* **Node.js & npm** (for the React Frontend)

### **2\. Clone the Repository**

git clone \[https://github.com/Abhijay30/E-commerce\](https://github.com/Abhijay30/E-commerce)  
cd E-commerce

### **3\. Run the Backend API (Spring Boot)**

The API project is located in the **E-commerce/E-commerce** subdirectory.

\# Navigate to the backend directory  
cd E-commerce

\# Build the project   
mvn clean install

\# Run the application  
mvn spring-boot:run

The API will start running on http://localhost:8080.

### **4\. Run the Frontend Client (React)**

The React client is located in the **ecom-frontend-3-main** subdirectory.

\# Navigate to the root of the repository first  
cd ..

\# Then navigate to the frontend directory  
cd ecom-frontend-3-main

\# Install all required Node.js packages  
npm install

\# Start the React development server  
npm run dev

The React application will usually start on http://localhost:5173 (or similar) and automatically connect to the backend API running on port 8080\.

## **🎓 Tutorial Acknowledgment**

This project serves as a practical implementation of concepts learned through the following Telusko tutorial:

* **Series/Course Name:** **Spring Framework and Spring Boot Tutorial with Project**  
* **Link:** **https://www.youtube.com/watch?v=-Fe0zk-F4OA**

## **📜 License**

This project is open-source and available under the **MIT License**.
