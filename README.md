## 📖 Description
This app is look like simple visualisation of Cinema app.
Where you can log in or register a new account as USER. Also
you can see actual movies and sessions for them -> choose session 
and buy a ticket for a movie which falls into the shopping cart.

## 📋 Project structure
**The project has an 3-Tier Architecture**
- Controller - This level allows the user to work with this application.
- Service - This level of architecture is responsible for processing the data received from the DAO level.
- DAO - This level of architecture is responsible for communicating with the database.

## 🎯 Features
- registration
- log in / log out
- set role for each user (by default USER)
- ADMIN can create and delete movies and movie sessions
- USER can buy a ticket for the movie session

## 🖥️ Technologies
- Java 11
- Maven
- MySQL
- Tomcat
- Hibernate
- Spring Web/Security

## ⚡️Quickstart
1. Fork this repository
2. Copy link of project
3. Create new project from Version Control
4. Edit resources/db.properties - set the necessary parameters
``` java
    db.driver=YOUR_DRIVER
    db.url=YOUR_URL
    db.user=YOUR_USERNAME
    db.password=YOUR_PASSWORD
```
5. Create the necessary name of DB
6. Install [Tomcat](https://tomcat.apache.org/download-90.cgi)
7. Add Tomcat server to configuration and Fix it.
8. Run project

## 👀 Example of parameters for db.properties
``` java
    db.driver=com.mysql.cj.jdbc.Driver
    db.url=jdbc:mysql://localhost:3306/NameOfDataBase?useUnicode=true&serverTimezone=UTC
    db.user=root
    db.password=123456
```
