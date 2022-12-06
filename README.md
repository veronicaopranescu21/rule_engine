**Rule Engine demo using Drools**

**Prerequisites**
- Install Postman

This is a demo for integrating Drools Rule Engine with Spring, parsing a given JSON file and measuring time response for HTTP request. 

All conditions were stored in a priorityRules.drl file and using Drools (with associated dependencies), we can reconfigure these rules. After we change the rule file, we have to restart the instance of our app.

In order to check the functionality, we send a POST request as JSON to http://localhost:8080/client.

![image](https://user-images.githubusercontent.com/65168257/206048151-5593a15d-6b23-40db-ab03-5b316a1c2394.png)

After executing the rules, 3 new validation fields were added to JSON response:

![image](https://user-images.githubusercontent.com/65168257/206048476-9f6ee77a-c052-4a49-bbbf-962bf49ab92a.png)

**Each HTTP request time response is measured:**

![image](https://user-images.githubusercontent.com/65168257/206049223-34fc72e7-c29d-43c5-823d-2df27f7b7200.png)


**Next steps to be implemented**

- After changing the rules configuration, the file is scanned and the changes are applied on running application, without having to restart the instance.
Using documentation, we can use KieScanner to load rule dynamically. It continuously monitors our Maven repository to check if a new release of a Kie project has been installed and if so, deploys it in the KieContainer wrapping that project. 

KieScanner kScanner = kieServices.newKieScanner( kContainer );

// Start the KieScanner polling the Maven repository every 10 seconds

kScanner.start( 10000L );

- For now, the configuration file is fetched from local, an improvement should be to get the config from remote location.

**Documentation**
https://docs.jboss.org/drools/release/6.5.0.Final/drools-docs/html_single/#d0e1920
