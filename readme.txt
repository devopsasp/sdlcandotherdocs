#################################################################################
Connecting to NO SQL Database MongoDB
###########################################################
1.Add dependency 

  <dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongo-java-driver</artifactId>
    <version>3.12.14</version>
</dependency>

1.Start MongoDb Database 
2.In Java Program create a client connection 
 using com.mongodb.MongoClient
  MongoClient client=new MongoClient("localhost",27017);
  
3.Getting database instance from MongoDB
com.mongodb.client.MongoDatabase

MongoDatabase db=client.getDatabase("payroll");

4.Creating a collection 

   db.createCollection(COLLECTION_NAME)
   
   
5.Retrieving existing collections from database;
    collection=db.getCollection(COLLECTION_NAME)
    
6.Creating a document 

 Document doc=new Document();
  doc.put(KEY,VALUE);
  
7.Add a document to collection 

 collection.insertOne(doc)     
 
 8.Getting Records from collection
 
  FindIterable<Document> iterable=collection.find()



 
 
   








  