# Hospital Management System

## Project Description

**Hospital Management System** is designed to manage patients, personnel, hospitals, and doctors, with multiple administrative roles. The system offers a comprehensive set of features for different types of administrators, enabling them to efficiently handle various aspects of healthcare management.

## Table of Contents

- [Hospital Management System](#hospital-management-system)
  - [Project Description](#project-description)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [User Roles](#user-roles)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Contributing](#contributing)
  - [License](#license)

## Features

- **User Authentication**: The system opens with a login page, ensuring that only authorized users can access its functionalities.
- **Multiple Admin Roles**: The application supports multiple admin roles, including System Admin, Hospital Admin, Community Admin, and Doctor Admin, each with distinct privileges.
- **System Admin Capabilities**: System Admins have full authority to perform CRUD (Create, Read, Update, Delete) operations on hospitals, encounters, doctors, communities, and more.
- **Community Management**: Community Admins can add and manage city and community data. For instance, they can add communities like "Boston - Roxbury Community."
- **Hospital Management**: Hospital Admins can create hospitals within specific cities and link them to communities. They also have the ability to manage patients, doctors, and encounter details associated with their hospital.
- **Doctor Management**: Doctor Admins can manage patient encounter history and vital signs. They play a crucial role in the healthcare process by maintaining patient records.
- **Patient Access**: Patients or users can view their vital signs and encounter history with their doctors.

## User Roles

1. **System Admin**: This role has complete access to all system functionalities.
2. **Community Admin**: Manages city and community data.
3. **Hospital Admin**: Manages hospitals, patients, doctors, and encounters within their hospital.
4. **Doctor Admin**: Manages patient encounter history and vital signs.
5. **Patient/User**: Accesses their vital signs and encounter history.

## Installation

To set up the Hospital Management System locally, follow these steps:

1. Clone the repository from [GitHub](https://github.com/yourrepositorylink) to your local machine.

2. Install the necessary dependencies using the following command:

   ```
   npm install
   ```

3. Set up the database and configure the system according to your environment.

4. Start the application by running:

   ```
   npm start
   ```

## Usage

1. Open the application in your web browser.

2. Log in using your credentials.

3. Depending on your role, you can perform various actions, such as managing patients, doctors, hospitals, or viewing your own vital signs and encounter history.

4. Follow the on-screen instructions to navigate through the system.

## Contributing

If you would like to contribute to the project, please follow these steps:

1. Fork the project repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes and submit a pull request to the original repository.

4. Wait for feedback and approval from project maintainers.

## License

This project is licensed under the [MIT License](LICENSE.md) - see the LICENSE.md file for details.
