
# Spring MVC Thymeleaf Student Registration Demo

This project is a **Spring MVC** application that demonstrates the usage of **Thymeleaf** as the front-end templating engine. It provides a student registration form where users can input personal details, such as first name, last name, country, degree, and subjects of interest. The form data is validated using different types of validation annotations provided by **Jakarta Bean Validation** (formerly JSR-303/JSR-380).

## Project Overview

The project showcases how to integrate **Spring Boot**, **Spring MVC**, and **Thymeleaf** to create a simple web application. It includes:
- A form that collects student details such as first name, last name, country, latest degree, and favorite subjects.
- Front-end form rendering using **Thymeleaf**.
- Server-side validation of form inputs using the **Jakarta Bean Validation API**.

## Features

- **Spring MVC Framework**: Handles request processing and form submission.
- **Thymeleaf**: Used for rendering the HTML views (forms and result pages).
- **Form Validation**: Validation is implemented using built-in annotations like `@NotBlank`, `@Size`, and `@NotNull` to ensure data integrity before processing.
- **Spring Boot DevTools**: To speed up the development process with automatic reloads.
- **Dynamic Data Binding**: For dynamically populating dropdowns (country, degrees, etc.).

## Technologies Used
- Java 22
- Spring Boot 3.3.3
- Thymeleaf
- Spring Boot Validation
- Maven


## Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
