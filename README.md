## Para subir o banco de dados MySQL
```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=test -p 3306:3306 -d mysql
```

## Para subit a aplicação
```
mvn spring-boot:run
```
