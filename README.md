# Deploying Web Applications in Jetty

ref: https://www.baeldung.com/deploy-to-jetty

### Build the war file
```
mvn package
```
This builds the war file at: ./target/jetty-example.war

### Deploy by Copying WAR
To deploy a web application to Jetty server, we can copy the WAR file into the $JETTY_HOME/webapps directory.
ex. JETTY_HOME../jetty-distribution-9.4.40.v20210413/, which has the jetty distribution start.jar file
```
cp target/jetty-example.war ../jetty-distribution-9.4.40.v20210413/webapps/
```

### Start the server
After copying, we can start the server by navigating to $JETTY_HOME and running the command:
```
cd ../jetty-distribution-9.4.40.v20210413/
java -jar start.jar
```

## Verify the service at Context Path: /jetty-example
http://localhost:8080/jetty-example/
