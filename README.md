# rest-api-java-client
Java application that consumes a public REST API and parses JSON response

** COMPANY: CODTECH IT SOLUTIONS

NAME: YASHVI TOPIWALA

INTERN ID: CTIS4485

DOMAIN: Java Programming

DURATION: 16 Weeks

MENTOR: NEELA SANTOSH

DESCRIPTION OF TASK
The objective of this task was to develop a Java application that consumes a public REST API and processes the data returned by the API. REST APIs are widely used in modern applications to allow communication between different systems over the internet. By sending HTTP requests to a server, a client program can retrieve data in formats such as JSON. This task demonstrates how Java applications can interact with web services and process structured data returned by APIs.

The developed application is a console-based REST API Client. The program sends an HTTP GET request to a public weather API to fetch real-time weather information. The response from the API is returned in JSON format, which is a lightweight data-interchange format widely used in web applications.

The program uses Java’s networking classes to send HTTP requests and retrieve responses from the server. The HttpURLConnection class is used to establish the connection and send the request. The BufferedReader and InputStreamReader classes are used to read the API response efficiently. The JSON data returned by the API is parsed using the org.json library, allowing the program to extract specific information such as temperature, wind speed, and wind direction.

After retrieving the JSON response, the application processes the data and displays it in a structured and readable format in the console. This demonstrates how Java programs can interact with web services and transform raw JSON data into meaningful information for users.

This task helped in understanding how REST APIs work, how Java applications communicate with web services, and how JSON data can be parsed and processed programmatically.

🧠 CONCEPTS USED

Operation | Class Used

Send HTTP Request | HttpURLConnection

Read API Response | BufferedReader + InputStreamReader

Parse JSON Data | JSONObject (org.json library)

User Output | System.out.println

Error Handling | Try-Catch (Exception Handling)

📂 PROJECT STRUCTURE

RestApiClient/

├── WeatherClient.java

├── json.jar

└── README.md

⚙️ FEATURES

Send HTTP GET request to a public REST API

Retrieve real-time weather data

Parse JSON response

Display structured weather information in console

Exception handling implemented

💻 TECHNOLOGIES / TOOLS USED

Java (JDK 8+)

java.net package

HttpURLConnection

BufferedReader

InputStreamReader

org.json Library

Command Prompt / PowerShell

Git & GitHub

▶️ HOW TO RUN

Compile

javac -cp ".;json.jar" WeatherClient.java

Run

java -cp ".;json.jar" WeatherClient

🧪 SAMPLE OUTPUT

Weather Report

Location: Surat

Temperature: 37.4 °C

Wind Speed: 12.3 km/h

Wind Direction: 308°

📘 LEARNING OUTCOME

Understanding REST APIs and web services

Sending HTTP requests using Java

Processing and parsing JSON responses

Displaying structured data from external APIs

Building Java applications that interact with online services
