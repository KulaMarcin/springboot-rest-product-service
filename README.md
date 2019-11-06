# springboot-rest-product-service ![](leaf.png)

<br>
<br>
<br>

<b>What is springboot-rest-product-service?</b>

It is a simple <b><i>Spring Boot REST</b></i> application, that provides communication with the database through <b>[GET]</b>, <b>[POST]</b>, <b>[PUT]</b> and <b>[DELETE]</b> requests.

<br>
<br>

<b>Database</b>

The MySQL database contains one table called <b>product</b> with 3 columns: id, item and price. The script to create the table is in the <b>sql_script_to_create_product_table</b> directory. The schema name is <b>springboot_rest_product_service</b>.

<br>
<br>

<b>Database connection</b>

The database connection is created based on the <b>application.properties</b> configuration file. This file contains parameters such as database address, username and password. The <b><i>mysql-connector-java</i></b> dependency has been added to the <b>pom.xml</b> file. 

<br>
<br>

<b>Database communication</b>

The <b>ProductRepository</b> interface extends <b>JpaRepository<Product, Integer></b>, which is why ProductRepository provides a number of CRUD methods for the Product entity. The dependency for <b><i>spring-boot-starter-data-jpa</b></i> has been added to the <b>pom.xml</b> file. 

<br>
<br>

<b>Request handling</b>


The project uses <b><i>Spring Data Rest</b></i>, which based on the existing JpaRepository (ProductRepository) automatically creates the <b>REST CRUD</b> implementation and provides support for the following requests: 

<br>

<b>[GET]</b>    /products - returns a list of all products as a JSON object
<br>
<b>[GET]</b>    /products/{productId}  - returns a product with the specified id as a JSON object
<br>
<br>
<b>[POST]</b>   /products - creates a new product. In the request body, a JSON object with values is passed
<br>
<br>
<b>[PUT]</b>    /products/{productId} - updates a product with the specified id. In the request body, the JSON object with the new values is passed
<br>
<br>
<b>[DELETE]</b> /products/{productId} - removes the product with the specified id

<br>

The dependency for <b><i>spring-boot-starter-data-rest</b></i> has been added to the <b>pom.xml</b> file

<br>
<br>

<b>Actuator</b>

An Actuator has also been added to the project, which provides several additional requests such as:

<br>

<b>[GET]</b> /actuator/health - application status

<b>[GET]</b> /actuator/info - information about the application
 
<br>
<br>

<b>Server</b>

By default, the application uses the embedded Tomcat server, which is provided by the <b><i>spring-boot-starter-web</b></i> dependency, so you don't need an external server.

