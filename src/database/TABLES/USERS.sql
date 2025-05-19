CREATE TABLE USERS(
                      USRID INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                      USERNAME VARCHAR(50) NOT NULL,
                      PASSWORD TEXT NOT NULL,
                      EMAIL VARCHAR(254) NOT NULL,
                      SALT TEXT NOT NULL,
                      ISADMIN BOOLEAN NOT NULL
);