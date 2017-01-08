
#Exception Handler Spring-REST#

##RESTful web service using Spring Exception handler ##

This project shows a RESTful web service using Spring. It demonstrates the GET, POST, PUT, and DELETE operations and the Exception Handler implementation as well.

Handling exceptions with Spring Framework and CXF is as simple as:

- Create a  custom exception class that extends RuntimeException interface.
- Create a Java class that implements ExceptionMapper interface and map the previous custom exception class.
- Annotate that class with @Provider.
- Publish the provider in the cxf-servlet.xml file.

#### Prerequisites

- Java 7
- Maven 3

#### Tools and Technologies

* JDK 1.7
* Spring 3.2.0.RELEASE
* jackson-mapper-asl 1.9.13
* jaxb-api 3.0.3
* Tomcat 7.0
* Maven
* Eclipse 

### Build and run
#### Configurations

Open the `properties` of the project and set your own Targeted Runtime (server).

#### From terminal

Go on the project's root folder, then type:

    $ mvn tomcat:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it on *Server*.

### Run

- Run the application and go on http://localhost:8080/restservice/services/
- Use the following urls to invoke interface methods using a testing tool:

  * DELETE operation, so that you are allowed to delete an object from the list, try to go with an id non-existent so that you can see the custom exception:
  `http://localhost:8080/restservice/services/studentService/student/{id}`, where {id} it´s the student id to be deleted.
  
    * GET operation, so that you are allowed to see all objects in a list, try to go:                  `http://localhost:8080/restservice/services/studentService/student`, you will see all students, by default there is only one.
    
    * GET operation, so that you are allowed to see an object from the list, try to go:                  `http://localhost:8080/restservice/services/studentService/student/111`, where 111 is the id for the default student.
    
    * POST operation, so that you are allowed to add an object to the list, try to go:                  `http://localhost:8080/restservice/services/studentService/student`, adding a Json with the following properties:
{
	"enrollmentId" : 0 ,
	"name" : " [ name ] ” ,
	"lastname" : “ [ lastname ] ”
}
* PUT operation, so that you are allowed to edit an object from the list, try to go:                  `http://localhost:8080/restservice/services/studentService/student`, adding a Json with the following properties:
{
	"enrollmentId" : [ id ] ,
	"name" : " [ name ] ” ,
	"lastname" : “ [ lastname ] ”
}
