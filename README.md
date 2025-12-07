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
<img width="528" height="228" alt="image" src="https://github.com/user-attachments/assets/055be50b-f5d9-4372-b3c0-c15da86a0306" />
<img width="467" height="181" alt="image" src="https://github.com/user-attachments/assets/70e88368-8bb4-4699-bf27-b3c78e7e3cde" />



---

### **3️⃣ Database Connection Test (/testdb)**
<img width="794" height="208" alt="image" src="https://github.com/user-attachments/assets/413eeaf6-e7ce-4e5e-bb27-b985004080d0" />


---

### **4️⃣ Login Page**
<img width="640" height="302" alt="image" src="https://github.com/user-attachments/assets/0bd231b8-25ae-41c0-9e98-771fc235783d" />


---

### **5️⃣ Admin – Add User Page**
<img width="735" height="394" alt="image" src="https://github.com/user-attachments/assets/231fa554-d821-44e6-88ee-b7a9486a2979" />


---

### **6️⃣ Patient Dashboard**
<img width="758" height="259" alt="image" src="https://github.com/user-attachments/assets/f343c8e2-8cac-4347-ae88-d941fb045ab2" />


---

### **7️⃣ Appointment Booking Page**
<img width="710" height="381" alt="image" src="https://github.com/user-attachments/assets/2f02d113-342f-46f3-9e3c-cf224a1623e7" />


---

### **8️⃣ Appointment Booked Successfully**
<img width="702" height="236" alt="image" src="https://github.com/user-attachments/assets/95a32527-5b3f-4106-aaa3-8098f91df1ac" />


---

### **9️⃣ Doctor Dashboard**
<img width="743" height="276" alt="image" src="https://github.com/user-attachments/assets/57bc79e8-b78f-462e-9b5d-9e4892d80991" />



---

### **🔟 Doctor Appointment List**
<img width="796" height="301" alt="image" src="https://github.com/user-attachments/assets/259aeb15-678c-408a-a852-cf6e74337b10" />


---

### **1️⃣1️⃣ Patient Appointment History**
<img width="794" height="327" alt="image" src="https://github.com/user-attachments/assets/417018fa-72a8-4c52-a97c-de6d656c7479" />


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
