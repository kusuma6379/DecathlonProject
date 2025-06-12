
# 🛒 Decathlon India Website Testing Project

## 📖 Overview

This project focuses on **manual and Selenium automation testing** of the [Decathlon India](https://www.decathlon.in/) e-commerce platform. The objective is to ensure smooth user experience, bug-free functionality, and cross-platform performance for critical shopping flows like login, product search, cart, and checkout.

Both **exploratory manual testing** and **automated testing using Java, Selenium, and TestNG** were performed.

---

## 🔍 Key Features Covered

### 🧪 Testing Scope

- 🔍 **Usability Testing**  
  Ensuring the website is user-friendly and provides smooth navigation.

- ✅ **Functionality Testing**  
  Validated the core functionalities:
  - Login and registration
  - Product listing and details view
  - Add to cart and quantity update
  - Navigation across product categories

- ⚡ **Performance Testing (Basic)**  
  Observed site response and loading under different conditions (manual level).

- 🌐 **Compatibility Testing**  
  Performed basic compatibility checks on Chrome, Edge, and Firefox.

- 🤖 **Manual and Automation Testing**  
  - 📝 **Manual Testing:** Used exploratory testing and documented test cases for login, search, add-to-cart, and navigation.  
  - 💻 **Automation Testing:** Selenium WebDriver + TestNG framework used to automate critical flows using Page Object Model (POM).

---

## 🧪 Features Tested

| Feature                     | Manual Testing | Automation (Selenium) |
|----------------------------|----------------|------------------------|
| 🔐 Login Page              | ✅              | ✅                     |
| 🏠 Homepage Navigation     | ✅              | ✅                     |
| 🛍️ Product Listing Page    | ✅              | ✅                     |
| 📄 Product Details Page     | ✅              | ✅                     |
| 🛒 Cart Page               | ✅              | ✅                     |

---

## 💻 Technologies Used

| Area                 | Tools / Frameworks                |
|----------------------|-----------------------------------|
| Programming Language | Java                              |
| Test Automation      | Selenium WebDriver                |
| Test Framework       | TestNG                            |
| Design Pattern       | Page Object Model (POM)           |
| Build Tool           | Maven                             |
| Version Control      | Git                               |
| Project Structure    | Java-based Modular Architecture   |

---

## 📁 Project Structure
DecathlonProject
│
├── src
│ └── test
│ ├── java
│ │ ├── Decathlonproject # POM classes
│ │ │ ├── CartPage.java
│ │ │ ├── Homepage.java
│ │ │ ├── LoginPage.java
│ │ │ ├── ProductDetailsPage4th.java
│ │ │ └── ProductListingPage.java
│ │ │
│ │ └── DecathlonProjectTestRunner # Test classes
│ │ ├── CartPageTest.java
│ │ ├── HomepageTest.java
│ │ ├── LoginpageTest.java
│ │ ├── ProductDetilePage4thTest.java
│ │ └── ProductListingpageTest.java
│
├── pom.xml # Maven configuration
├── testng.xml # TestNG suite file
└── README.md # Project documentation



