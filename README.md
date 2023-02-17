# Java-Pokemizer
A distributed java/spring/gradle backend for the Pokemizer app

This application uses a SQL database (MySQL /w Amazon RDS or Amazon Aurora) for its structured data based services and a NoSQL database (MongoDB or DocumentDB) for the services which may come under higher data traffic strain and have greater situational complexity.

It uses events instead of API calls so that our Announcements service can record the results of battles and display them without directly involving our other services, as well as acting as a fail safe in the event that a service outtage occurs.

How I made the bones for each service:
* Go to the [Spring Initializr](https://start.spring.io/) and choose what you want
* Import with Gradle from within Eclipse to setup and install dependencies
* Add necessary extra dependencies that Initializr goofs on
* Setup configuration to allow spring dev profiles to accept all requests for testing
* Setup a basic controller/REST endpoint to check if things are working

Service Explanations:
* Trainer Service - Manages basic information related to the trainer (user) and the trainer's pokemon. Powered by a SQL DB.

* Pokedex Service - Manages basic information about the Pokemon, their attributes and abilities. Powered by a SQL DB.

* Battle Service - Manages information about currently occuring battles. Powered by a NoSQL DB.

* Announcement Service - Tracks battle highlights and audits battles in the event that a service crashes.

* Tester Service - Sevice which interacts with front-end components which make simple requests to whichever backend API is configured to deploy (Java, Kotlin, .NET). Deployment stages should fail if any of these components end up being deployed to production.