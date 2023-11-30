# Setup

---

Create Postgresql database:
```
CREATE DATABASE persons;
```
and table:
```
CREATE TABLE cars (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR,
    lastname VARCHAR,
    personal_code VARCHAR
); 
```
Go to backend folder:
```
cd backend
```
Run api:
```
./gradlew bootRun
```
Open new terminal and go to frontend folder:
```
cd frontend
```
Install dependencies:
```
npm i
```
Run frontend:
```
npm start
```