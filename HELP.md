mvn spring-boot:build-image
Make Sure Jenkin is running on port 8080
Go to the directory where you installed Jenkins (by default, it's under Program Files/Jenkins)
Open the Jenkins.xml configuration file.
You can find --httpPort=8080 and replace the 8080 with the new port number.
Restart your Jenkins server.
$ jenkins.exe restart
docker run --tty --publish 8080:8080 demo:0.0.1-SNAPSHOT



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
11. Select your project in Jenkins
12. Click on Configure
13. Go to build section
14. Click on Add Build Steps
15. Login To your docker hub account
16. Click on Create Repository
17. Give some name(docker-jenkins-integration)
18. Select docker build and publish
19. Repository name(satishchpn)
20. Add Registry Credentials(Give Docker Hub Credentials)
21. Select that credentials in Dropdown
22. Apply/Save
23. Trigger the build now
24. After Successful Build you can see the docker image to docker hub and also by typing docker images in cmd
25. In Jenkins Console Output log you will find(Successfully tagged satishchpn/docker-jenkins-integration-demo:latest),here 	satishchpn/docker-jenkins-integration-demo:latest is the image name with latest tag
25. This images can be utilized to run the application in the VM/Cloud Server 
26. Open Cmd and run below command 
 	docker run --tty  --name myhost --publish 8080:8080 satishchpn/docker-jenkins-integration-demo:latest
 	Here container name=myhost
 	To See Cointer Ip Address :  docker inspect --format="{{json .NetworkSettings.IPAddress}}"  myhost
 	To See Cointer Networks Details :  docker inspect --format="{{json .NetworkSettings.Networks}}"  myhost
27. Your server will get started
28. Open In Browser ip:8080

