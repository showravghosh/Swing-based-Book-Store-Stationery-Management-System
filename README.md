# 📚 Java Book Store Management System

A **desktop-based Book and Stationery Store Management System** developed using **Java Swing**.
The application supports **user and admin roles**, allowing users to browse and purchase **books and stationery products**, while **admins manage product listings and system operations**.

## 🚀 Features

### 👤 User Features

* User Login
* Browse **New Books**,**Old Books** and **stationery products**
* View book and stationery product details with images
* Purchase books and stationery products
* Payment system integration
* Simple and user-friendly GUI

### 🛠 Admin Features

* Admin Login
* Admin Dashboard
* Add new books
* add new stationery products
* Manage old books
* View system data
* Admin authentication using stored data


## 🧱 Project Structure

```text
JAVA FINAL PROJECT 1.1/
├── Classes/
│   ├── Login.java
│   ├── AdminLogin.java
│   ├── Adminpanel.java
│   ├── Homepage.java
│   ├── Newbook.java
│   ├── Oldbook.java
│   └── Payment.java
├── Interfaces/
│   ├── Account.java
│   └── AdminAccount.java
├── Image/
│   ├── welcome.jpg
│   ├── The-Alchemist.jpg
│   └── stationery.jpg
├── Admindata.txt
├── Data.txt
├── Start.java
├── run.bat
└── README.md
```

## 🛠 Technologies Used

* **Java (JDK 8+)**
* **Java Swing (GUI)**
* **AWT**
* **Object-Oriented Programming (OOP)**
* **File Handling (Text File for Admin Data and User data)**


## ▶️ How to Run the Project

### Method 1: Using `run.bat`

1. Make sure **Java JDK** is installed.
2. Double-click `run.bat`.

### Method 2: Using Command Line

```bash
javac Start.java
java Start
```


## 🔐 Login System

* **User Login** – GUI based
* **Admin Login** – Admin credentials are stored in `Admindata.txt`

> ⚠️ Make sure `Admindata.txt` is present in the project root directory.

## 📸 GUI Preview

The project uses image-based UI components stored inside the `Image/` folder to enhance visual experience.


## 🎯 Learning Outcomes

* Java Swing GUI Design
* Event Handling
* Interface & Class implementation
* File handling in Java
* Modular project structure
* Real-world desktop application development

## 👨‍💻 Author

**Showrav Ghosh**
🎓 Java Final Project

## 📜 License

This project is created for **academic and learning purposes**.
You are free to modify and improve it.
