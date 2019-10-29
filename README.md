# SimpleSpringApp

This is a basic app which delivers an API to serve some operations on a Project Collection.

We have a few challenges for you:
1. Add the possibility to update and delete a project
2. A Project should contain multiple Tasks, add logic to handle CRUD on Tasks inside a Project
3. A GET on /projects should return only project info, but GET on /projects/{projectId} should also contain the list of Tasks
4. I want to save a log in DB every hour specifying how many projects were created in the past hour
5. Add an unit test for the method that creates the log

Here are some links to get you started:<br>
https://spring.io/guides/gs/spring-boot/<br>
https://www.baeldung.com/spring-boot-start
