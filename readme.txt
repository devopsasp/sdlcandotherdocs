Exception handling in Spring Boot
---------------------------------------------------------
#Controller Advice

@ControllerAdvice annotation is used to handle exceptions globally

@ExceptionHandler is used to handle specific exceptions and send custom responses 
client 


#ControllerAdvice is a speciallized form of spring stereotype annotation
#It allows handling of exceptions across whole application in one global handling 
component

#Sending location in response

#UriComponentsBuilder
   class helps in building UriComponent Instances
   These instances can be sent in response for an operation like add or 
   getting uri for different resources
   