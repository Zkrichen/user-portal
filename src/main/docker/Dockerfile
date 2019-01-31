FROM tomcat:8.5-alpine
VOLUME /tmp
COPY user-portal-1.0.war /usr/local/tomcat/webapps/user-portal.war
RUN sh -c 'touch /usr/local/tomcat/webapps/user-portal.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/tomcat/webapps/user-portal.war"]
