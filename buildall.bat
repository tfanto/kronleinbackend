call docker system prune -a -f

cd kronleinbackend-db
call mvn clean install -DskipTests
call createDockerImage.bat
cd ..

cd kronleinbackend-server
call mvn clean install -DskipTests
call createDockerImage.bat
cd ..


docker-compose build

docker-compose up -d



