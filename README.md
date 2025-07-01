# Movie API

A simple REST API for managing movies, built with Spring Boot.

## How to Run

1. Make sure you have Java and Maven installed.
2. In the project directory, run:
   ```
   mvn spring-boot:run
   ```
3. The API will be available at `http://localhost:8080/api/v1`.

## Endpoints

- `GET /api/v1/movies` — List all movies
- `GET /api/v1/movie/{id}` — Get a movie by ID
- `POST /api/v1/movies` — Add a new movie (ID is assigned automatically)
- `PUT /api/v1/movies/{id}` — Update a movie by ID
- `DELETE /api/v1/movies/{id}` — Delete a movie by ID

## Movie JSON Example
```json
{
  "title": "Interstellar",
  "director": "Christopher Nolan",
  "year": 2014,
  "genre": "Sci-Fi",
  "actors": [
    { "name": "Matthew McConaughey", "role": "Cooper" },
    { "name": "Anne Hathaway", "role": "Brand" }
  ],
  "quotes": [
    "Love is the one thing we're capable of perceiving that transcends dimensions of time and space."
  ]
}
``` 