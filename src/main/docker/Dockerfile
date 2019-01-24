FROM tomcat:8.5-alpine
VOLUME /tmp
COPY user-portal-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/user-portal.war
RUN sh -c 'touch /usr/local/tomcat/webapps/user-portal.war'