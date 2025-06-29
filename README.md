# Spring Boot Players API

A simple Spring Boot application that provides RESTful APIs to manage cricket players and their statistics using H2 in-memory database.

# APIs

### List all players 
* GET: ```http://localhost:8080/api/players```

### Filter with player name

* GET: ```http://localhost:8080/api/players?name=Virat Kohli```

### Add new players

* POST: ```http://localhost:8080/api/players```


# Screenshots
* Get All Players
![Screenshots imagse](screenshots/1getall.png)
* DB Status
![Screenshots imagse](screenshots/2getalldb.png)
* Filter with player's name
![Screenshots imagse](screenshots/3filter.png)
* Add new players
![Screenshots imagse](screenshots/4update.png)
* DB Status after adding new player
![Screenshots imagse](screenshots/5updateddb.png)
* Get all players
![Screenshots imagse](screenshots/6updated.png)

