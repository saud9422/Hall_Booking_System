# Hall_Booking_System
🎯 Hall Booking System
A web-based Hall Booking System designed to simplify the process of booking college or organizational halls for events, meetings, or functions. The system ensures smooth user interaction with clear hall availability, easy booking, and efficient management for administrators.

📌 Features
🔍 View Available Halls
Browse through the list of available halls with their capacities and facilities.

📅 Booking Management
Users can select a date, time slot, and hall, then submit booking requests.

🔐 Authentication System
Admin and user login panels for secure access.

🧾 Auto-generated Booking Code
Each successful booking gets a unique 6-digit booking code.

🛡️ Admin Dashboard
Admin can view all bookings, approve or reject requests, and manage hall records.

🛠️ Tech Stack
Backend:
Java Spring Boot

Spring Data JPA

MySQL

Frontend:
Angular

Bootstrap

📂 Project Structure
bash
Copy code
/backend
    └── src/main/java/com/hallbooking
        ├── controller
        ├── model
        ├── repository
        └── service

/frontend
    └── src/app
        ├── components
        ├── services
        └── models
⚙️ How to Run
🔧 Backend (Spring Boot)
bash
Copy code
cd backend
mvn clean install
mvn spring-boot:run
💻 Frontend (Angular)
bash
Copy code
cd frontend
npm install
ng serve
Make sure to configure the API URLs correctly in the Angular service files.

📸 Screenshots
Add screenshots of:

Homepage

Booking form

Admin panel

Success page with booking code

✍️ Author
Saud Khan
📧 skmaster313@gmail.com
🔗 LinkedIn
