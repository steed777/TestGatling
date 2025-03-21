# Используем образ с OpenJDK (подходит для Gatling)
FROM openjdk:17-slim

# Устанавливаем необходимые инструменты (Maven, если нужен)
RUN apt-get update && apt-get install -y maven zip unzip

# Создаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем pom.xml (или build.gradle) и файлы настроек Maven/Gradle
COPY pom.xml .
#COPY .mvn ./.mvn
#COPY mvnw .
#COPY mvnw.cmd .

# Скачиваем зависимости (чтобы ускорить сборку) - используем Maven Wrapper
RUN mvn dependency:go-offline

# Копируем исходный код
COPY src ./src
#COPY resources ./resources

# Собираем Gatling проект
#RUN ./mvnw clean package -Dmaven.test.skip=true

volumes:
    - /C:/Users:/target/gatling

# Определяем команду для запуска Gatling (замените на свой класс симуляции)
CMD mvn clean gatling:test '-Dgatling.simulationClass=simulation.Yadex'




