# OneToMany Relationship Example with JPA

A simple Java application demonstrating a Parent-Child one-to-many relationship using JPA (Jakarta Persistence API) with EclipseLink as the persistence provider.

## Project Overview

This project showcases:
- One-to-many relationship mapping between Parent and Child entities
- Data Access Object (DAO) pattern implementation
- Basic CRUD operations using JPA

## Technologies Used

- Java
- JPA (Jakarta Persistence API)
- EclipseLink (JPA Implementation)
- MySQL Database

## Project Structure

- `models/`: Entity classes (Parent, Child)
- `dao/`: Data Access Object interfaces
- `daoImpl/`: Implementation of DAO interfaces
- `resources/`: Configuration files

## Entity Relationship

- A Parent can have multiple Children (OneToMany)
- Each Child belongs to one Parent (ManyToOne)

## Database Configuration

The database connection is configured in `persistence.xml`:
- Database: MySQL
- Schema: entity3
- Username: root
- Password: 0000

## Setup Instructions

Create a MySQL database named entity3
Configure src/main/resources/META-INF/persistence.xml with your database credentials if needed
Run the application

## Dependencies

Jakarta Persistence API
EclipseLink
MySQL Connector/J
