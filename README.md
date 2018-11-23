🍃 Spring Cloud Sleuth Example

Spring Cloud Sleuth is a Distributed Log Tracing used for tracking logs across microservices. 
This example simulates it with a Server and Client application.
It Contains 'sleuth-server' and 'sleuth-client' which can be treated as two different microservices.
sleuth-client calls the sleuth-server to retrieve response. 
Logs are placed in both Server and Client to show the Log traceability using Spring Cloud Sleuth.

Following technologies being used

* Spring Boot 2.1.0.RELEASE

* Spring Boot Sleuth

* JDK 1.8

* Maven 3