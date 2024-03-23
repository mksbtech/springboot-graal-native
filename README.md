# springboot-graal-native
Demo application to demonstrate Spring Boot support for Cloud Native Buildpacks to generate a lightweight container containing a native executable based on GraalVM.

# Steps to build and run

-Ensure that docker daemon is running on your machine
-Execute below commands
	1. gradle clean build
	2. gradle bootBuildImage
	3. docker run --rm -p 8080:8080 docker.io/library/demo:0.0.1-SNAPSHOT
	
Once the application is up,Open Postman and create a GET request with below url with message query param value as per your liking.

http://localhost:8080/greetings?message=YourName

Response received for above GET request
HelloYourName
