**Rule Engine demo using Drools**

**Prerequisites**
- Install Postman

This is a demo for integrating Drools Rule Engine with Spring. There is a Client class, that has 4 fields: 
- Name
- Category (it can be Gold, Silver, Platinum, paid by client)
- Seniority (given by the number of years client has been a member)
- Priority (the priority is given by both Category type and Seniority). 
The rules that are implemented cover the conditions applied in order to check the priority of a certain client. If Seniority<3, according to category, the client has a certain priority.

Example: Name: John, Category: Silver, Seniority: 3 => Priority: 2

All conditions were stored in a priorityRules.drl file and using Drools (with associated dependencies), we can reconfigure these rules. After we change the rule file, we have to restart the instance of our app.

In order to check the functionality, we send a POST request to http://localhost:8080/client.

![image](https://user-images.githubusercontent.com/65168257/204259656-3daea231-a460-4169-aceb-ac8100b65f27.png)


**Next steps to be implemented**
After changing the rules configuration, the file is scanned and the changes are applied on running application, without having to restart the instance.
Using documentation, we can use KieScanner to load rule dynamically. It continuously monitors our Maven repository to check if a new release of a Kie project has been installed and if so, deploys it in the KieContainer wrapping that project. 


KieScanner kScanner = kieServices.newKieScanner( kContainer );

// Start the KieScanner polling the Maven repository every 10 seconds

kScanner.start( 10000L );

**Documentation**
https://docs.jboss.org/drools/release/6.5.0.Final/drools-docs/html_single/#d0e1920
