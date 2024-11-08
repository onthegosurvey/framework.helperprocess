./gradlew clean assemble
./gradlew clean publish
mkdir /opt/tomcat/webapps/libs/chat/onthego/onthego-helperprocess
mkdir /opt/tomcat/webapps/libs/chat/onthego/onthego-helperprocess/$1
cp build/libs/*.jar /opt/tomcat/webapps/libs/chat/onthego/onthego-helperprocess/$1/onthego-helperprocess-$1.jar
cp build/publications/mavenJava/pom-default.xml /opt/tomcat/webapps/libs/chat/onthego/onthego-helperprocess/$1/onthego-helperprocess-$1.pom