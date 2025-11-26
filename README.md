# 🏥 Online Healthcare Management System  
### Review 1 – Java Web Based Project  
**Team Members:**  
- **Jai Sarkar (Leader)**  
- **Piyush Yadav**  
- **Farhan Akhtar**

---

## 📌 Project Overview  
The **Online Healthcare Management System** is a Java-based web application designed to simplify healthcare operations for **Admins, Doctors, and Patients**.  
It allows users to log in, manage appointments, and interact through role-based dashboards.

This project is built using **JSP, Servlets, JDBC, MySQL, and Apache Tomcat**, following MVC architecture.

This repository contains all the code submitted for **Review-1**, including:  
✔ Login System  
✔ Admin User Management  
✔ Patient Appointment Booking  
✔ Doctor Appointment View  
✔ Database Connectivity (JDBC)  
✔ JSP–Servlet–DAO Back-end Flow  

---

## 🎯 Objectives (Review-1 Scope)
The main goals achieved in Review-1 are:

- Implementing **Core Java + OOP concepts**  
- Creating a working **web-based healthcare prototype**  
- Setting up **database schema, JDBC connectivity & DAO pattern**  
- Designing **role-based login + dashboards**  
- Implementing **appointment booking and viewing**  
- Demonstrating complete **Servlet → DAO → DB** integration  

---

## 🏗️ Technology Stack  

### **Frontend**
- JSP  
- HTML  
- CSS (Basic)

### **Backend**
- Java (JDK 17)  
- Servlets  
- JDBC (MySQL Connectivity)

### **Tools & Platform**
- Apache Tomcat 10  
- Eclipse IDE  
- MySQL Workbench  
- GitHub  

---

## 📂 Project Structure  

src/main/java
├── com.healthcare.model # User, Appointment models
├── com.healthcare.dao # UserDAO, AppointmentDAO
├── com.healthcare.servlet # Login, Appointment, Doctor/Patient controllers
└── com.healthcare.util # DBUtil for JDBC connection

src/main/webapp
├── login.jsp
├── admin-dashboard.jsp
├── admin-add-user.jsp
├── patient-dashboard.jsp
├── appointment.jsp
├── patient-appointments.jsp
└── doctor-appointments.jsp

yaml
Copy code

---

## 🗄️ Database Schema

### Database Name:
healthcare_db

yaml
Copy code

### Tables (Review-1):
1. **users**
2. **appointments**

### `users` fields:
- id  
- name  
- email  
- password  
- role (admin/doctor/patient)  

### `appointments` fields:
- id  
- patient_id  
- doctor_id  
- appointment_datetime  
- status  
- reason  

---

## ✔️ Features Implemented (Review 1)

### 🔹 **1. User Authentication**
- Login using email + password  
- Role-based redirection  
  - Admin → Admin Dashboard  
  - Doctor → Doctor Dashboard  
  - Patient → Patient Dashboard  

---

### 🔹 **2. Admin Module**
- Add new Users (Admin / Doctor / Patient)  
- Form validation  
- Data stored securely in MySQL  

---

### 🔹 **3. Patient Module**
- Book Appointment  
- View Appointment History  
- Data saved using DAO + JDBC  

---

### 🔹 **4. Doctor Module**
- View Assigned Appointments  
- Appointment details loaded from DB  

---

### 🔹 **5. JDBC Connectivity**
- `DBUtil.java` created for re-usable DB connection  
- DAO layer uses PreparedStatements  
- `/testdb` servlet confirms successful MySQL connectivity  

---

## 🚀 How to Run This Project

### 1️⃣ Clone the repository
git clone https://github.com/your-repo-name.git

yaml
Copy code

### 2️⃣ Import into Eclipse  
`File → Import → Dynamic Web Project`

### 3️⃣ Setup MySQL Database  
Run:
USE healthcare_db;

yaml
Copy code
Tables:
- users  
- appointments  

### 4️⃣ Add MySQL Connector  
Place the JAR inside:
WebContent/WEB-INF/lib

mathematica
Copy code

### 5️⃣ Run Project  
`Right-click Project → Run on Server (Tomcat 10)`  

Open in browser:
http://localhost:8080/OnlineHealthcareSystem/

yaml
Copy code

---

# 📸 Screenshots (Review-1)

> All screenshots are placed inside `/screenshots/` folder.

### **1️⃣ Project Folder Structure**
<img width="756" height="859" alt="image" src="https://github.com/user-attachments/assets/2ead2974-a8d6-4129-b9be-f710e06e8fa3" />


---

### **2️⃣ Database Tables**
![DB Tables](screenshots/db_tables.png)

---

### **3️⃣ Database Connection Test (/testdb)**
![DB Test](screenshots/db_connection_success.png)

---

### **4️⃣ Login Page**
![Login Page](screenshots/login_page.png)

---

### **5️⃣ Admin – Add User Page**
![Admin Add User](screenshots/admin_add_user.png)

---

### **6️⃣ Patient Dashboard**
![Patient Dashboard](screenshots/patient_dashboard.png)

---

### **7️⃣ Appointment Booking Page**
![Appointment Booking](screenshots/appointment_booking.png)

---

### **8️⃣ Appointment Booked Successfully**
![Booking Success](screenshots/appointment_success.png)

---

### **9️⃣ Doctor Dashboard**
![Doctor Dashboard](screenshots/doctor_dashboard.png)

---

### **🔟 Doctor Appointment List**
![Doctor Appointments](screenshots/doctor_appointments_list.png)

---

### **1️⃣1️⃣ Patient Appointment History**
![Patient Appointments](screenshots/patient_appointments_history.png)

---

## 👥 Team Contribution

| Member | Role | Work Done |
|--------|------|-----------|
| **Jai Sarkar** | Leader | Full coding – Servlets, DAO, JDBC, DB setup |
| **Piyush Yadav** | Member | Testing, Documentation |
| **Farhan Akhtar** | Member | Presentation & UI support |

---

## 📌 Conclusion  
The Online Healthcare Management System fulfills **all Review-1 requirements**, including:

✔ Core Java  
✔ OOP Concepts  
✔ Servlets  
✔ JSP  
✔ JDBC  
✔ Database Integration  
✔ Functional Modules  

The project is ready for **Review-2 enhancements** like:  
- Medical Records  
- Admin Analytics  
- Profile Management  
- UI Upgrade  

---
