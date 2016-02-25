set "MAVEN_OPTS=-Xmx512m  "

mvn -DskipTests clean install tomcat7:run
