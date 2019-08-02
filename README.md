## Build the Application

`mvn package`

## Create the Database (Optional)
The following steps are optional. If you do not perform them, then a memory database will be
created upon startup.
1. Connect to your database
1. Execute the following SQL scripts:

`src/main/resources/schema.sql`

`src/main/resources/data.sql`


If you are using an external database then supply the following properties on the command
line when you start the application
- `-Dspring.datasource.url=`*jdbc url to your database*
- `-Dspring.datasource.username=`*username of your database*
- `-Dspring.datasource.password=`*password for username*


## Run the Application
Execute the following java command to run the application in an embedded container:

`java -jar target\jeff-miller-assessment-1.0.0.jar`

The application runs on port 80 by default. To change the port used, specifiy the following
property on the command line when you start the application:

- `server.port=`*desired port number*


## Access the Application

Access the application with browser at this url: [http://localhost](http://localhost).
If port was changed with `server.port` property then specify port in url 
(for example [http://localhost:8080](http://localhost:8080)).
