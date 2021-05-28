
````
http://localhost:8080/greeting
````
````json
{
"id": 4,
"content": "Hello, World!"
}
````

````
http://localhost:8080/greeting?name=João
````

````json
{
"id": 4,
"content": "Hello, João!"
}
````
````
http://localhost:8080/api/v1/objecto
````

````json
[
  {
    "id": 1,
    "name": "Objecto Teste",
    "description": "Description Cool 🎯",
    "date": "2000-12-05",
    "amount": 1
  }
]
````



[Postgres Download](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

## Database Configuration

````properties
spring.datasource.url=jdbc:postgresql://localhost:5432/objecto
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
````
````bash
echo "# spring-boot-rest-api" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Joaosilgo/spring-boot-rest-api.git
git push -u origin main
````