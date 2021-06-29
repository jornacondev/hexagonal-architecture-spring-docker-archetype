# Hexagonal architecture with spring boot and Docker
## Requirements
* Maven installed
* Docker installed

## How to install

1. Download the project and from the archetype root run: ```mvn install```
2. Create a new project directory
3. Run the generate command:```mvn archetype:generate -DarchetypeCatalog=local```
4. Enter the required parameters and the project is created, for example:

    * groupId: ```com.jornacondev.samples```
   
    * artefactId: ```sample-artifact```
   
    * package: ```com.jornacondev.samples```
5. Open the project and go to Dockerfile
   
    * Change this line ```RUN cp /app/target/hexagonal-architecture-*.jar /app.jar```
    with ```RUN cp /app/target/{ARTIFACTID THAT YOU USED IN THE POINT 4}-*.jar /app.jar```
6. From the project root you can run: ```docker-compose up``` to start the sample project.
7. Enter into: ```http://localhost:8080/greeting``` to see the Hello application message.

# Important
* This is just an archetype to have the project structure, do not forget to remove the Sample classes, there is a TODO to search it easily. 