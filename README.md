## SERVLET

##  Project Overview

This project is a simple **Java Servlet-based web application** that demonstrates user login handling with both **Session** and **Cookie management**. It provides separate access flows for **Admin** and **User** roles, showcasing how data can be passed between servlets using different mechanisms.

###  Key Operations
- **Login Form (HTML)**  
  - Collects `username` and `password` from the user.  
  - Submits data to `LoginServlet` via `GET` method.

- **LoginServlet**  
  - Reads form inputs (`username`, `password`).  
  - Stores the username in a **Cookie** (instead of Session).  
  - Redirects based on role:
    - If `username = Admin` → forwards to **AdminServlet**.  
    - Otherwise → forwards to **UserServlet**.

- **AdminServlet**  
  - Retrieves the username from the **Cookie**.  
  - Displays a personalized welcome message for the Admin.

- **UserServlet**  
  - Retrieves the username from the **Session** (demonstrating session-based data sharing).  
  - Displays a personalized welcome message for the User.

###  Flow of Execution
1. User opens the **Login Form** and enters credentials.  
2. `LoginServlet` processes the input and decides the role.  
3. Depending on the role:
   - **Admin** → handled via **Cookie** in `AdminServlet`.  
   - **User** → handled via **Session** in `UserServlet`.  
4. A dynamic HTML response is generated with a personalized greeting.

---
Here’s a polished **overview section** you can use in your GitHub README file for this project:

---

## 📌 Project Overview

This project is a simple **Java Servlet-based web application** that demonstrates user login handling with both **Session** and **Cookie management**. It provides separate access flows for **Admin** and **User** roles, showcasing how data can be passed between servlets using different mechanisms.

### 🔑 Key Operations
- **Login Form (HTML)**  
  - Collects `username` and `password` from the user.  
  - Submits data to `LoginServlet` via `GET` method.

- **LoginServlet**  
  - Reads form inputs (`username`, `password`).  
  - Stores the username in a **Cookie** (instead of Session).  
  - Redirects based on role:
    - If `username = Admin` → forwards to **AdminServlet**.  
    - Otherwise → forwards to **UserServlet**.

- **AdminServlet**  
  - Retrieves the username from the **Cookie**.  
  - Displays a personalized welcome message for the Admin.

- **UserServlet**  
  - Retrieves the username from the **Session** (demonstrating session-based data sharing).  
  - Displays a personalized welcome message for the User.

### ⚙️ Flow of Execution
1. User opens the **Login Form** and enters credentials.  
2. `LoginServlet` processes the input and decides the role.  
3. Depending on the role:
   - **Admin** → handled via **Cookie** in `AdminServlet`.  
   - **User** → handled via **Session** in `UserServlet`.  
4. A dynamic HTML response is generated with a personalized greeting.

---
![WhatsApp Image 2026-02-21 at 10 11 22 AM](https://github.com/user-attachments/assets/59668771-7d54-4190-84de-7f52324d2c74)

![WhatsApp Image 2026-02-21 at 10 09 27 AM](https://github.com/user-attachments/assets/ab07b806-d595-42e1-a747-c5d051aad134)



