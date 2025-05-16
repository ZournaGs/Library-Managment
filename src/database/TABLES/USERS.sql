CREATE TABLE USERS(
                      USRID INT GENERATED ALWAYS AS IDENTITY,
                      USERNAME VARCHAR(50) NOT NULL,
                      EMAIL VARCHAR(254) NOT NULL,
                      PASSWORD TEXT NOT NULL,
                      SALT TEXT NOT NULL
);