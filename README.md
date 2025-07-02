# Movie API

[![Release](https://img.shields.io/github/v/release/stefanrogic/movie-api?include_prereleases&sort=semver)](https://github.com/stefanrogic/movie-api/releases)
[![Java](https://img.shields.io/badge/Java-24-blue.svg)]()

A simple REST API for managing movies, built with Spring Boot.

## Requirements

- JDK 24

**You can download and install JDK 24 from the [official OpenJDK website](https://jdk.java.net/24/).**
**Make sure to set your JAVA_HOME environment variable to point to your JDK 24 installation.**

## Build and Run

1. **Build the JAR file:**
   ```
   ./mvnw clean package
   ```
   This will create a JAR file in the `target/` directory (e.g., `target/MovieAPI-<version>.jar`).

2. **Run the JAR file:**
   ```
   java -jar target/MovieAPI-<version>.jar
   ```
   The API will be available at `http://localhost:8080/api/v1`.

## Download

You can download the latest release JAR from the [GitHub Releases page](https://github.com/stefanrogic/movie-api/releases).

1. **Go to the Releases section of this repository.**
2. **Download the latest `MovieAPI-<version>.jar` file.**
3. **Run it with:**
   ```
   java -jar MovieAPI-<version>.jar
   ```
   The API will be available at `http://localhost:8080/api/v1`.
   
## Endpoints

- `GET /api/v1/movies` — List all movies
- `GET /api/v1/movie/{id}` — Get a movie by ID
- `POST /api/v1/movies` — Add a new movie (ID is assigned automatically)
- `PUT /api/v1/movies/{id}` — Update a movie by ID
- `DELETE /api/v1/movies/{id}` — Delete a movie by ID

## Movie JSON Example
```json
{
    "id": 0,
    "title": "Interstellar",
    "director": "Christopher Nolan",
    "year": 2014,
    "genre": "Sci-Fi",
    "actors": [
        {
            "name": "Matthew McConaughey",
            "role": "Cooper"
        },
        {
            "name": "Anne Hathaway",
            "role": "Brand"
        }
    ],
    "quotes": [
        "Love is the one thing we're capable of perceiving that transcends dimensions of time and space.",
        "Do not go gentle into that good night."
    ]
}
``` 
