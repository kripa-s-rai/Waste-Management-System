
# ♻️ Recycle Management System

The **Recycle Management System** is a web-based platform built with **Spring Boot** and **MySQL** that allows users, waste collectors, recycling staff, and administrators to efficiently manage waste pickup, categorize waste, track its recycling status, and generate reports.

## 🚀 Features

### 👤 User
- Register/Login to the system
- Create a new waste pickup request
- View status updates for submitted pickups

### 🧹 Waste Collector
- View assigned pickup requests
- Update pickup status (e.g., "Picked Up", "In Transit")

### 🏭 Recycling Center Staff
- Categorize waste as *Recyclable* or *Non-Recyclable*
- Route waste to Recycling or Disposal unit
- Update processing status (e.g., "Pending", "Processed and Sent to Recycling")

### 🛠️ Admin
- Manage all user roles and requests
- Generate system-wide reports and statistics
- Monitor processing and recycling activities

## 🛠️ Tech Stack

- **Backend**: Spring Boot (Java)
- **Frontend**: Thymeleaf / HTML / CSS
- **Database**: MySQL
- **Security**: Spring Security (Role-Based Access)


## 📁 Project Structure

```
Recycle-Management-System/
├── .vscode/                      # VSCode settings (optional)
├── sql/                          # SQL scripts for DB initialization
├── pom.xml                       # Maven configuration
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── wastepickup/
│       │               ├── config/           # Spring security and app configuration
│       │               ├── controller/       # Controllers for handling requests
│       │               ├── model/            # Entity classes (WastePickup, User, etc.)
│       │               ├── repository/       # Spring Data JPA Repositories
│       │               ├── service/          # Business logic layer
│       │               ├── strategy/         # Strategy pattern for waste handling logic
│       │               └── WastePickupApplication.java  # Main class
│       └── resources/
│           ├── templates/        # Thymeleaf HTML templates
│           ├── static/           # CSS, JS, Images
│           └── application.properties  # DB config, port, security settings

```

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/kripa-s-rai/Waste-Management-System.git
cd Waste-Management-System
```

### 2. Database Setup

- Create a MySQL database named `wastepickupdb`.
- Run SQL scripts in /sql to initialize schema
- Update `application.properties` with your DB credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/wastepickupdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

Using your IDE or command line:

```bash
./mvnw spring-boot:run
```

The app will run at: [http://localhost:8080](http://localhost:8080)

## 🔐 Roles & Access

| Role                 | Access                                                   |
|----------------------|----------------------------------------------------------|
| User                 | Create/view pickup requests                              |
| Waste Collector      | Update pickup status                                     |
| Recycling Center     | Categorize and process waste                             |
| Admin                | Full access: users, pickups, processing, reports         |

## 📊 Sample Reports

- Total pickups
- Recyclable vs Non-Recyclable waste
- Processing status by date range
- User-wise pickup history

## 📝 Future Enhancements

- Email/SMS notifications
- Interactive dashboard with charts
- Google Maps integration for pickup tracking
- AI-based waste classification



## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
