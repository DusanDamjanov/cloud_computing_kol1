# Koristi Java 11 base image
FROM openjdk:11-jdk

# Postavlja radni direktorijum u kontejneru
WORKDIR /app

# Kopira JAR fajl aplikacije u kontejner
COPY target/kolokvijum1-0.0.1-SNAPSHOT.jar app.jar

ENV DATASOURCE_URL=jdbc:postgresql://database-movies.c342ug4mmfb2.eu-north-1.rds.amazonaws.com:5432/initial_database_movies
ENV DATASOURCE_USERNAME=postgres
ENV DATASOURCE_PASSWORD=postgres

# Kada se kontejner pokrene, pokreće se aplikacija
CMD ["java", "-jar", "app.jar"]
