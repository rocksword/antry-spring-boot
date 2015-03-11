$java -jar target/myproject-0.0.1-SNAPSHOT.jar

#remote debugging support enabled
$java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar target/myproject-0.0.1-SNAPSHOT.jar