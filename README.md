# NRB Forex Exchange - Spring Boot Application

## Overview

NRB Forex Exchange is a Java Spring Boot application designed to fetch and display foreign exchange rates from the Nepal Rastra Bank (NRB). This project aims to provide real-time and historical exchange rate information through a RESTful API.

## Features

- Fetch the latest foreign exchange rates from NRB
- Provide API endpoints for accessing exchange rates
- Store historical exchange rate data
- Support for multiple currencies
- Built using Spring Boot, Hibernate, and RESTful web services

## Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Hibernate (JPA)
- MySQL Database
- RESTful APIs
- Lombok
- Swagger (API Documentation)

## Prerequisites

Before setting up the project, ensure you have the following installed:

- Java 17 or later
- Maven
- MySQL Database
- Postman (for API testing, optional)

## Installation & Setup

1. **Clone the repository**

   ```sh
   git clone https://github.com/siwakota/nrb-forex-exchange.git
   cd nrb-forex-exchange
   ```

2. **Configure Database**

   - Create a MySQL database named `nrb_forex`.
   - Update `application.properties` or `application.yml` with your database credentials.

3. **Build and Run the Application**

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the API**

   - Base URL: `http://localhost:8080/api/v1`
   - Swagger UI: `http://localhost:8080/swagger-ui.html`

## API Endpoints

| Method | Endpoint                 | Description                            |
| ------ | ------------------------ | -------------------------------------- |
| GET    | `/exchange-rates/latest` | Get the latest exchange rates          |
| GET    | `/exchange-rates/{date}` | Get exchange rates for a specific date |
| POST   | `/exchange-rates`        | Add new exchange rate data             |

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new feature branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to your branch (`git push origin feature-branch`)
5. Create a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or support, feel free to reach out:

- **GitHub**: [siwakota](https://github.com/siwakota)
- **Email**: [anishsiwakoti463@gmail.com](mailto\:anishsiwakoti463@gmail.com)

