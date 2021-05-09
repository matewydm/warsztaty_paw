#!/bin/sh
mvn clean package && docker build -t pl.edu.agh/warsztaty .
docker rm -f warsztaty || true && docker run -d -p 8080:8080 -p 4848:4848 --name warsztaty pl.edu.agh/warsztaty 
