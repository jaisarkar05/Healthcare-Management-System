# Online Healthcare Management System  
### Review 1 Submission – Java Web Based Project  
**Team Members:**  
- **Jai Sarkar (Leader)**  
- **Piyush Yadav**  
- **Farhan Akhtar**

---

## 📌 Project Overview
This is a Java-based **Online Healthcare Management System** developed as part of the **3rd Semester Review-1 Java Web-Based Project**.  
The system provides **role-based dashboards** for:

- **Admin**
- **Doctor**
- **Patient**

It is built using **JSP, Servlets, JDBC, MySQL, Eclipse IDE, and Apache Tomcat 10**.

---

## 🎯 Objectives (Review-1 Scope)
Review-1 focuses on implementing:

- Core Java & OOP concepts  
- Database design & JDBC connectivity  
- Servlets + JSP flow  
- Project structure setup  
- Basic working module demonstration  

This project **meets all Review-1 requirements**.

---

## 🏗 Technologies Used
- **Java (JDK 17)**
- **JSP / Servlets**
- **JDBC**
- **Apache Tomcat 10**
- **MySQL Workbench**
- **Eclipse IDE**
- **HTML / CSS (Basic)**

---

## 📂 Project Structure (Review-1)

src/main/java
├── com.healthcare.model
├── com.healthcare.dao
├── com.healthcare.servlet
└── com.healthcare.util (DBUtil.java)

src/main/webapp
├── login.jsp
├── index.jsp
├── admin-dashboard.jsp
├── patient-dashboard.jsp
├── doctor-dashboard.jsp
├── appointment.jsp
├── patient-appointments.jsp
└── doctor-appointments.jsp

yaml
Copy code

---

## 🗄 Database Schema (Review-1 Tables)

### 1. `users`  
Stores admin, doctor, and patient records.

### 2. `appointments`  
Stores appointment booking details.

> Note: Advanced tables (medical_records etc.) are part of Review-2.

---

## ✔ Features Completed (Review-1)

### 🔹 **1. User Authentication**
- Login using email + password  
- Role-based redirection (Admin / Doctor / Patient)

### 🔹 **2. Admin Module**
- Add new user (Admin/Doctor/Patient)
- Input validation

### 🔹 **3. Patient Module**
- Book appointment  
- View appointment history  

### 🔹 **4. Doctor Module**
- View scheduled appointments

### 🔹 **5. JDBC + MySQL Integration**
- DBUtil connection class  
- DAO classes for CRUD operations  
- PreparedStatements used (secure)

---

## 🚀 How to Run the Project

### 1️⃣ Import project  
- File → Import → Dynamic Web Project  
- Select downloaded folder

### 2️⃣ Setup MySQL DB  
Run the SQL scripts inside `/database` or create tables manually.

### 3️⃣ Add MySQL Connector JAR  
Place `mysql-connector-j.jar` inside:
src/main/webapp/WEB-INF/lib

shell
Copy code

### 4️⃣ Configure Tomcat 10  
Add project → Start server.

### 5️⃣ Access in browser:
http://localhost:8080/OnlineHealthcareSystem/

yaml
Copy code

---

## 🎥 Review-1 Demonstration Checklist (All Working)

- Login ✔  
- Add user (Admin) ✔  
- Book appointment (Patient) ✔  
- View appointment history (Patient) ✔  
- View appointments (Doctor) ✔  
- DB Connectivity ✔  
- JSP + Servlet + DAO flow ✔  

---

## 📌 Future Enhancements (Review-2)

- Medical Records Module  
- Schedule Management  
- Profile Management  
- Admin Reports & Analytics  
- Bootstrap UI upgrade  
- Email notification system  

---

## ⭐ Team Contribution
| Member | Role | Contribution |
|--------|------|--------------|
| **Jai Sarkar** | Leader | Backend coding (Servlets, DAO, JDBC), DB setup |
| **Piyush Yadav** | Member | Documentation & Testing |
| **Farhan Akhtar** | Member | Presentation & UI support |

---

## 📝 License
This project is created for academic purposes under Galgotias University 3rd Semester Review-1 submission.

---

# 👍 Thank you!
