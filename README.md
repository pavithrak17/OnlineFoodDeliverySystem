<h1 align="center" ><b>Online Food Delivery System</b></h1>

## Overview
This project is an **Online Food Delivery System** developed using Java. It includes features for managing users (Admins, Customers, Delivery Persons), handling restaurants and food items, placing and managing orders, and maintaining customer carts. The system is designed with a focus on user management, restaurant management, and order processing.

## Features
- **Admin Management**: Admins can add, retrieve, and manage restaurants and delivery persons.
- **Customer Management**: Customers can register, browse food items, and manage their orders.
- **Restaurant Management**: Admins can add, remove, and view restaurants and food items.
- **Order Management**: Orders can be placed, updated, and tracked with various statuses (Pending, Completed, Cancelled, Delivered).
- **Cart Management**: Customers can manage their carts by adding and removing food items.

## Classes and Functionality

### Entities:
- **User**: Abstract base class for all user types.
- **Admin**: Represents an admin user who can manage restaurants and food items.
- **Customer**: Represents a customer with a shopping cart and orders.
- **Order**: Represents an order with customer details, order status, food items, and delivery information.
- **FoodItem**: Represents a food item with details like ID, name, and price.
- **Restaurant**: Represents a restaurant with a menu of food items.
- **Cart**: Represents a customer's cart containing food items and quantities.

### Services:
- **AdminService**: Provides methods to manage admins and restaurant menus.
- **CustomerService**: Provides methods to manage customers and their orders.
- **OrderService**: Provides methods to place, update, retrieve, and list orders.
- **FoodService**: Provides methods to manage restaurants and food items.

## Getting Started

### Prerequisites
- Java 8 or higher
- An IDE like Eclipse or IntelliJ IDEA

### Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/OnlineFoodDeliverySystem.git
   ```
2. **Open the project** in your preferred IDE.
3. **Build and run** the project using your IDE's build and run options.

## Usage

- **Admin Management**: Use `AdminService` to add, remove, and retrieve restaurants and delivery persons.
- **Customer Management**: Use `CustomerService` to add, retrieve, and manage customers and their orders.
- **Restaurant Management**: Use `FoodService` to add, remove, and retrieve restaurants and food items.
- **Order Management**: Use `OrderService` to place, update, and retrieve orders by ID.
- **Cart Management**: Customers can add and remove food items from their cart using the `Cart`.

## Contributing

We welcome contributions to this project! If you would like to contribute, please follow these steps:

1. **Fork** the repository by clicking the "Fork" button in the upper right corner of the repository page.
2. **Clone** your forked repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/your-forked-repo-name.git
   ```
3. **Create a new branch** for your changes:
   ```bash
   git checkout -b your-branch-name
   ```
4. **Make your changes** and commit them:
   ```bash
   git add .
   git commit -m "Description of your changes"
   ```
5. **Push your changes** to your forked repository:
   ```bash
   git push origin your-branch-name
   ```
6. **Open a pull request** from your forked repository to the original repository.

Please make sure to follow the project's coding standards and include tests for your changes.

**HAPPY CODING!**

## Show your support
**Give a ⭐ if you like this website!**
