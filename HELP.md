mvn spring-boot:build-image
docker run --tty --publish 8083:8080 demo:0.0.1-SNAPSHOT
192.168.99.100:8083


#Open Jenkins
1. Click on New Item
2. Give Some name to the job(docker-jenkins-integration)
3. Click on Free style project
4. Ok
5. Select github project
6. Give the project url(https://github.com/satishchpn/demo)
7. In Source Code Management section  select git 
8. Give the repository url(https://github.com/satishchpn/demo.git)
9. In Build triggers section select poll scm
10. In schedule give (* * * * *) means trigger this job on each commit
11. In Build Section Click Add build step
12. Select Invoke Top level maven targets
12. In goals(install)

#Steps to Integrate with Docker
1. Go to Jenkins home page
2. Manage Jenkins
3. Select Manage Plugins
4. Click on Available
5. In Filter search docker
6. Add DockerBees Docker build and publish plugin
7. Add Docker Plugin
8. Add Docker build step plugin
9. Install Without restart
10. Select Restart Jenkins when installation complete and no job running
9. Can confirm > Go To home page> Click on configure > Build > Add Build Step we should find that
10. Create Docker file for the project

