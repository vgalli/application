# Application test

Description:   
    domain module contains the domain object(s)
    application module The main application
    server module The service to be consumed
    
 The build produces multiple jars and package them with the application dependencies.
 
 The application-1.0.0-SNAPSHOT jar consumes the service-1.0.0-SNAPSHOT.jar
 
 For convenience in the build folder you will find
    - lib folder - Produced jar files + dependencies (spring, ...)
    - data.json Sample data file.
    - start.sh  Executes the application. (fee the classpath with the lib folder content and set the data file as a parameter)
  
  
 Framework used:    
    - Spring for Dependency injection (context xml file used applicationContext.xml)