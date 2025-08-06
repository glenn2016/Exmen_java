Projet Spring Boot CRUD gérant les entités Sector et ClassEntity avec relation 1-N.

Prérequis

Java 21
Maven (version ≥ 3.6)
MySQL 
  Base de données nommée examen_jee
Postman 

1 - Configuration

git clone  https://github.com/glenn2016/Exmen_java.git


Configurer MySQL

Creaation d'une DB mysql nomé examen_jee


Modifier application.properties (dans src/main/resources)

spring.datasource.url=jdbc:mysql://localhost:3306/examen_jee?useSSL=false&serverTimezone=UTC
spring.datasource.username=mon_user
spring.datasource.password=mon_mdp
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
