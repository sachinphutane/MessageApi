Spring Cloud
---------------------------------------------------------
 
It gives you many different libraries for implementing micro services using Spring
--------------------------------------------------------------------------------------------
1) OpenFeign
 
   It is used to make REST calls.

   Steps to use OpenFeign

   I) Add dependency in pom.xml

   II) Create an interface with method matching signature of remote method

   III) Enable feign client

  --------------------------------------------------------------------------------------------

  We want to assign unique name to every microservice and use that name to refer that microservice.
  It is by using  

 2) Eureka : It service registry and discovery server.
             Every microservice registers itself with Eureka.
             Eureka server typically runs on port 8761

 ----------------------------------------------------------------------------------------------

 3) API gateway
     This is used to navigate calls to microservices.
     All calls are first made to api gateway and then api gateway will route call to repsective microservice.



 ---------------------------------------------------------------------------------------------------------