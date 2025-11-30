# 🚀 Spring Boot Week 1 — *Schema Design & Overview*

## 🏷️ **#SpringBoot #BackendDevelopment #Week1Learning**

---

## 📘 **Overview**

Welcome to **Spring Boot Week 1**! This README provides a well-structured, emoji-rich summary of the **Schema Design**, foundational concepts, and visual diagram to help you understand the database structure used in this module.

---

## 🧩 **Schema Design — ER Diagram**

Below is the schema diagram referenced for Week 1:

![Schema Design](https://github.com/user-attachments/assets/7450bae2-e54e-4455-924d-726620a636b2)

---

## 🏗️ **Database Structure Breakdown**

This schema represents a basic **Employee Management System** with relationships among multiple entities.

### 👤 **Employee Table**

* Stores core employee details
* Attributes include:

  * `id`
  * `name`
  * `gender`
  * `job`
  * `joinDate`
  * `salary`

### 🏠 **Address Table**

* Stores address details of employees
* Connected using a **One-to-One** relationship

### 🧾 **User Table**

* Contains login/authentication info
* Fields include:

  * `username`
  * `password`
  * Linked to employee (if part of your project design)

### 🧮 **Relationships**

* Employee ↔ Address → **1 : 1**
* Employee ↔ User → *(Depends on business logic, optional)*

---

## 🔧 **Technologies Used**

* **Spring Boot 3.x**
* **Java 17+**
* **Hibernate / JPA**
* **MySQL / PostgreSQL**
* **Lombok**

---

## 📂
