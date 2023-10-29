# Project Management System

The Project Management System is a full-stack web application that allows users to upload and manage project files, collaborate with other users through reactions and comments, and streamline project management tasks.

## Features

- User Registration and Authentication: Users can create an account, log in securely, and manage their profile.
- File Upload and Storage: Users can upload project files, which are securely stored in Amazon S3 for easy access and retrieval.
- Project Listing and Details: Users can view a list of uploaded projects and access detailed information about each project.
- Reactions: Users can react to projects with predefined reactions, such as like, love, or thumbs up.
- Comments: Users can leave comments on projects, facilitating collaboration and discussion.
- User Roles and Permissions: Different user roles (e.g., project owners, collaborators) have specific permissions for uploading files, deleting comments, etc.
- Search and Filtering: Users can search for specific projects and filter projects based on various criteria.
- Error Handling and Validation: Comprehensive error handling and data validation ensure a smooth and secure user experience.
- Responsive User Interface: The user interface is designed to be intuitive, user-friendly, and accessible across different devices.

## Technology Stack

- Front-End: React.js, HTML, CSS
- Back-End: Spring Boot (Java)
- Database: MySQL
- File Storage: Amazon S3

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Node.js and npm (Node Package Manager)
- MySQL Server
- Amazon S3 Account

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/Satvik-Garg/WebDevelopment-Project.git
   ```

2. Set up the database:

    - Create a MySQL database and update the connection settings in the application.properties file.
    - Run the database migrations to set up the necessary tables.

3. Set up the Amazon S3 bucket:

    - Create an Amazon S3 bucket to store the uploaded files.
    - Update the S3 bucket credentials and configuration in the application.properties file.

4. Set up the front-end:

    - Navigate to the `client` directory.

    - Install the dependencies using npm:
    ```bash
    npm install
    ```
    - Start the front-end development server:
    ```bash
    npm run dev
    ```

5. Set up the back-end:

    - Navigate to the `server` directory.
    - Build and run the Spring Boot application using Maven:
    ```bash
    mvn spring-boot:run
    ```

6. Access the application:

    - Open your web browser and visit http://localhost:3000 to access the Project Management System.
    
7. Contributing
    - Contributions are welcome! If you find any issues or have suggestions for improvement, please submit a pull request or create an issue in the project repository.

8. License
    - This project is licensed under the MIT License.

9. Acknowledgments
    - This project was developed as part of WebHex's internal project management efforts.
    - Contributors
        - [S.Sridhar](https://github.com/Illuminati9)
        - [Satvik Garg](https://github.com/Satvik-Garg)
        - [Himanshu Sharma](https://github.com/Him7n)
        - [Shreyash](https://github.com/)
        - [Ramanujan Gunturu](https://github.com/)
        - [D.Tharun](https://github.com/draksham)
