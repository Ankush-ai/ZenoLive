# ZenoLive
![logo](https://github.com/Ankush-ai/ZenoLive/assets/83574516/79813229-3df1-4409-9767-6cb3da16e4b9)



**ZenoLive** is a cutting-edge WebRTC video chat and conferencing web application designed to deliver seamless video calls, group chats, screen sharing, and AI-powered face effects. Developed using Spring Boot for the backend and JavaScript, CSS, HTML, and Zego Cloud for the frontend.

## 🚀 Features

- **Video Call**: High-quality one-on-one video calls.
- **Group Chat**: Engage in dynamic group video conferences.
- **Screen Sharing**: Share your screen effortlessly during calls.
- **Login/Logout**: Secure authentication and session management.
- **Settings**: Customize video and audio settings.
- **AI Effects**: Apply AI filters for fun and enhanced visual effects.
- **Security**: Robust security features for safe communication.

## 📸 Screenshots
![Screenshot 2024-07-02 200057](https://github.com/Ankush-ai/ZenoLive/assets/83574516/004df4ce-bfe5-461b-ba9e-69fdccdde6bf)
![Screenshot 2024-07-02 200106](https://github.com/Ankush-ai/ZenoLive/assets/83574516/80bbaaf9-913b-440d-b47c-451a78f7b1dc)
![Screenshot 2024-07-02 200113](https://github.com/Ankush-ai/ZenoLive/assets/83574516/2e28a4fe-37dc-49ad-b352-8671000421ab)
![Screenshot 2024-07-02 200142](https://github.com/Ankush-ai/ZenoLive/assets/83574516/e0072b9e-4352-4fc4-bc6f-bed7bce5257f)
![Screenshot 2024-07-02 200154](https://github.com/Ankush-ai/ZenoLive/assets/83574516/3ed17232-21e3-4f02-8769-648b60cf2c7e)
![Screenshot 2024-07-02 200204](https://github.com/Ankush-ai/ZenoLive/assets/83574516/aba2e575-93f2-40ba-981d-4de60ebeb476)
![Screenshot 2024-07-02 200222](https://github.com/Ankush-ai/ZenoLive/assets/83574516/97a9b304-ff74-4d8e-928b-8866a9fa4a49)











## 🛠️ Tech Stack

- **Backend**: Spring Boot
- **Frontend**: JavaScript, CSS, HTML
- **Video/Audio**: [Zego Cloud](https://www.zegocloud.com/)
- **Database**: Your preferred database (MySQL, PostgreSQL, etc.)

## 📚 Documentation

Here's a simple API documentation for your `UserController` in the "ZenoLive" application. This documentation provides a concise overview of the endpoints, including their HTTP methods, request bodies, responses, and example usage.

### **ZenoLive User API Documentation**

---

## **Base URL**

```
/api/v1/users
```

---

### **Register User**

#### **Endpoint**

```
POST /api/v1/users/users
```

#### **Description**

Registers a new user.

#### **Request Body**

```json
{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "password123"
}
```

#### **Response**

- **Status:** `200 OK`
- **Body:** `None`

#### **Example**

```bash
curl -X POST http://localhost:8080/api/v1/users/users \
-H "Content-Type: application/json" \
-d '{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "password123"
}'
```

---

### **User Login**

#### **Endpoint**

```
POST /api/v1/users/login
```

#### **Description**

Logs in an existing user.

#### **Request Body**

```json
{
  "email": "john@example.com",
  "password": "password123"
}
```

#### **Response**

- **Status:** `200 OK`
- **Body:**
  ```json
  {
    "id": 1,
    "username": "john_doe",
    "email": "john@example.com",
    "token": "jwt-token-string"
  }
  ```

#### **Example**

```bash
curl -X POST http://localhost:8080/api/v1/users/login \
-H "Content-Type: application/json" \
-d '{
  "email": "john@example.com",
  "password": "password123"
}'
```

---

### **User Logout**

#### **Endpoint**

```
POST /api/v1/users/logout
```

#### **Description**

Logs out an existing user.

#### **Request Body**

```json
{
  "email": "john@example.com"
}
```

#### **Response**

- **Status:** `200 OK`
- **Body:** `None`

#### **Example**

```bash
curl -X POST http://localhost:8080/api/v1/users/logout \
-H "Content-Type: application/json" \
-d '{
  "email": "john@example.com"
}'
```

---

### **Get All Users**

#### **Endpoint**

```
GET /api/v1/users/users
```

#### **Description**

Retrieves a list of all registered users.

#### **Response**

- **Status:** `200 OK`
- **Body:**
  ```json
  [
    {
      "id": 1,
      "username": "john_doe",
      "email": "john@example.com"
    },
    {
      "id": 2,
      "username": "jane_doe",
      "email": "jane@example.com"
    }
  ]
  ```

#### **Example**

```bash
curl -X GET http://localhost:8080/api/v1/users/users
```

---

### **Error Handling**

#### **Global Exception Handler**

Errors in the application are handled globally by the `@ExceptionHandler` method.

#### **Response**

- **Status:** `500 Internal Server Error`
- **Body:**
  ```json
  {
    "message": "Error message describing what went wrong."
  }
  ```

#### **Example**

In case of a server error, you will receive a response like:

```json
{
  "message": "Internal Server Error"
}
```

---

### **Notes**

- Ensure that the server is running on `http://localhost:8080` or adjust the base URL accordingly.
- Replace example email addresses and passwords with your actual data.
- The authentication token (`jwt-token-string`) in the login response is a placeholder. Replace it with the actual token generated by your application.

---

This documentation provides a simple and clear overview of the available API endpoints in your `UserController`. Adjust it according to your application's actual responses and configurations.

## 📝 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
-Spring boot 3

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/ZenoLive.git
    cd ZenoLive
    ```

2. **Backend Setup:**
    - Navigate to the `backend` directory:
      ```bash
      cd backend
      ```
    - Install dependencies and build the project:
      ```bash
      mvn clean install
      ```
    - Configure your database connection in `application.properties`.



### Running the Application

1. **Backend:**
    ```bash
    mvn spring-boot:run
    ```



Visit `http://localhost:8080/index.html` to access ZenoLive.

## 🔧 Configuration

- **Backend Configuration:** Located in `backend/src/main/resources/application.properties`.




## 🤝 Contributing

We welcome contributions! Please read our [Contributing Guide](CONTRIBUTING.md) to learn how you can help.

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## 🐛 Issue Tracking

Report bugs or request features on our [Issue Tracker](https://github.com/Ankush-ai/ZenoLive/issues).

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙌 Acknowledgements

- [Zego Cloud](https://www.zegocloud.com/)
- Open source libraries and contributors.

## 💬 Contact

For more information, reach out to us at **ankushsri007@gmail.com**.

---

_Developed with ❤️ by [Ankush-ai](https://github.com/Ankush-ai)_

