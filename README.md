# Spring boot boilerplate to use Emojis with MySQL

Here is a little boilerplate if you want to start a project with Spring Boot and MySQL, and if you intend to use Emojis into
your MySQL database.

## Get started

Start the Docker MySQL instance with the following :

```shell script
$ docker-compose up -d
```

Stop the containers with :

```shell script
$ docker-compose down
```

Run tests with :

```shell script
$ ./gradlew test
```

## Notes
### What is needed to enable emojis ?

Your MySQL Database Tables `CHARACTER SET` and `COLLATE` must respectively be `utf8mb4` and `utf8mb4_unicode_ci` (for the collate, other variants are available).
For instance in this project the `Post` table : 
```sql
CREATE TABLE post
(
    id      INT AUTO_INCREMENT NOT NULL,
    title   VARCHAR(255)       NOT NULL,
    content TEXT               NOT NULL,
    PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
```


Your Spring boot connection to the MySQL Database must contain the parameters `useUnicode=true` and `characterEncoding=UTF-8`.
For instance in this project the configuration property `spring.datasource.url` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/emojis?useUnicode=true&characterEncoding=UTF-8
```

Have fun !