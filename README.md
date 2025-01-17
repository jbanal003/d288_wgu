# D288 - Back-End Programming
## Back-End Application Programming

A travel agency has recently launched a complete overhaul of their front-end vacation bookings application using Angular and JavaScript. Lately, the front-end engineers have encountered various undocumented bugs when sending requests and fetching data from the back-end. Since the back-end was built in the early 1990s and the original developer has since retired and can no longer help troubleshoot, the existing team is concerned about the growing tech debt and lack of ongoing support. Your chief technology officer (CTO) decided to create a project to port over any mission-critical functionalities to a modern framework and has selected you, a software developer in Java, to start developing the minimally viable product (MVP) to migrate the legacy back-end to the modern Spring framework.

#

#### A. Create a new Java project using Spring Initializr, with each of the following dependencies:
<ul>
  <li> Spring Data JPA (spring-boot starter-data-jpa)
  <li> Rest Repositories (spring-boot-starter-data-rest)
  <li> MySQL Driver (mysql-connector-java)
  <li> Lombok
</ul>

  &nbsp;&nbsp;&nbsp; Note: Since the application properties will be empty, you will need to copy over the supplied application properties.

B. Create your subgroup and project by logging into GitLab using the web link provided and do the following:

<ul>
  <li> Connect your new Java project
  <li> Commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)
</ul>

  &nbsp;&nbsp;&nbsp; Note: Any submissions that do not have a commit after each task will not be evaluated. <br>
  &nbsp;&nbsp;&nbsp; Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.

<ul>
  <li>Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.
</ul>

  &nbsp;&nbsp;&nbsp; Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.

C. Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.

  &nbsp;&nbsp;&nbsp; Note: The packages should be on the same level of the hierarchy. <br>
  &nbsp;&nbsp;&nbsp; Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.
  
D. Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

E. Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

F. Write code for the services package that includes each of the following:

<ul>
  <li> A purchase data class with a customer cart and a set of cart items
  <li> A purchase response data class that contains an order tracking number
  <li> A checkout service interface
  <li> A checkout service implementation class
</ul>

G. Write code to include validation to enforce the inputs needed by the Angular front-end.

H. Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

  &nbsp;&nbsp;&nbsp; Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.

I. Add five sample customers to the application programmatically.

  &nbsp;&nbsp;&nbsp; Note: Make sure the customer information is not overwritten each time you run the application.
  
J. Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:

<ul>
 <li> That your application does not generate a network error when adding the data
 <li> Your database tables using MySQL Workbench to show the data was successfully added
</ul>
