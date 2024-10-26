# Используем официальный образ OpenJDK
FROM openjdk:21-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем файл jar в контейнер
COPY target/questionnaire-0.0.1.jar app.jar

# Открываем порт для приложения
EXPOSE 8080

# Команда для запуска Spring Boot приложения
ENTRYPOINT ["java", "-jar", "app.jar"]

