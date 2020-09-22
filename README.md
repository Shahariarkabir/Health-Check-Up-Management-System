# Health-Check-Up-Management-System

# Overview
The Health Check-Up management system (HCMS) is an integrated Console based application which is written in Java that handles different directions of clinic’s check-up workflows.
This project helps the Admin and Patient. Also, it helps to maintain the patient's health report and appointment. 
 It manages the smooth healthcare performance along with administrative and medical control. That is a cornerstone for the successful operation of the healthcare facility.


# Goals 
●	Administrators are able to manage appointments, deliver check-up reports and have more facilities. <br>
●	Patients can easily book an appointment, check testing costs and collect the reports. <br>

# Features of the Project 

➔	In this project the “Admin” has the following features: <br>

◆	Log-In <br>
◆	Create Patients Appointments. <br>
◆	View Patients Appointments Details. <br>
◆	Check the particular check-up cost. <br>
◆	View Patients Test Details. <br>
◆	View Total patients list. <br>
◆	 Log-out <br>

➔	In this project the “Patient” has the following features: <br>

◆	Log-In <br>
◆	Book Appointments. <br>
◆	View Appointments Details. <br>
◆	Check testing costs. <br>
◆	View Patients Test Details. <br>
◆	 View Reports. <br>
◆	 Log-out <br>

#Specifications <br>
In order to run this project, we will require IntelliJ IDEA IDE, and Windows terminal/Console. When run this console user needs to submit a number as the print option. <br>  
When you run this project, you will see in the console A Welcome Message. Then In the console you’ll see a message that will ask you what type of user you are!! If you are Admin then you have to choose Admin option or if you are a Patient then you’ll choose the Patient option. If any user chooses the wrong option then a message will show that he is wrong.

I.	Admin: <br>
After log in, Admin can choose multiple options. By using those options, they can view data of patient, appointments and the reports. If an Admin wants to go to the home page then he can log-out from the system.

II.	Patient: <br>
After log in, patients can choose multiple options. They can book appointments, view appointments, test costs and test reports. If a Patient wants to go to the home page then he can log-out from the system.

# Tools Used <br>
●	IntelliJ IDEA IDE <br>
●	Notepad++  <br> 
●	Git Bash  <br>
●	Windows Terminal  <br>
●	Flowchart  <br>

#OOP and java Concepts Used   <br>

●	Scanner Class:  <br>

We used Scanner class is used to get user input. To use the Scanner class, we have created two objects of the class. The objects are – scnum, scstr. <br>

●	Inheritance:  <br>

We used inheritance to inherit the Parent Abstract Class Person to use Components For the project. Here, the children classes for the Person class are Admin & Patient. <br>


●	 	Association <br>

Association in Java is a connection or relation between two separate classes that are set up through their objects. relationship indicates how objects know each other and how they are using each other’s functionality. <br>

●	 Interface: <br>

We had to implement interfaces defined in Printable class to customize Our needs. We implemented those methods as per our usage and Requirements. <br>

●	Polymorphism<br>

We made some of our methods polymorphism in Report class in our project. The methods are printDetails() and printDetails( Reports r). <br>

●	Abstraction:<br>
We have used  an  Abstract Class which is Person in our project. An abstract class is a class that we cannot instantiate (cannot create object).  <br>

●	 Typecasting:<br>
There’re many type castings used project wise. Sometimes we had to get our job done by casting data types to another. We used type casting in Main Class ,Patient Class, Cost Class in our project. <br>

●	Arrays <br>
  An array is a collection of similar types of data or value. As we are working on different types of similar data, we are using an array here to complete our project. <br>

●	Files and I/O <br>
File Handling is necessary to perform various tasks on a file, such as read, write, etc. We use two important streams are FileInputStream and FileOutputStream. In Main Class after printing the Patient’s report , The file with patient name generated. it contains the Report of the patient.  <br>

●	Package <br>
Packages are a feature of the Java programming language that help us to organize and structure our classes and their relationships to one another. We created user defined packages here. These are : Class & Interface. <br>

●	Exception Handling <br>
A Java exception is an object that describes an exceptional condition that has occurred in a piece of code. When an exceptional condition arises, an object representing that exception is created and thrown in the method that caused the error. That method may choose to handle the exception itself or pass it on.  We used FilenotFound exception in Main Class in our project.  <br>

# Limitations and Possible Future Improvements  <br>
There are a lot of limitations for this project. Patients cannot use this system online for appointment and contact. There is no scope to access this system by multiple admins. Here there is no option for patients' images and sending data through online. As we can’t use databases here so it’s not possible to create a user interface and also, we could not manage the online payment system here.  <br>

# Scope to improve this project in future <br>
There are many scopes to improve this project. In the future, we can Design and Implement as Apps, they will be able to use this system though online. Patients will be able to download the data from the system as a file. In future, online help centers for patients will be available and patients will be fixed with appointments with doctors.  <br>
 
# Conclusion <br>
Here in this system, there are two types of users - one is admin and another is patient. Most of the tasks are done by Admin. Patients can easily get appointments, test expenses and test reports through the console system.    <br>
In this project, we are using JDK-12 (java) and Windows Terminal. We mostly use the OOP concepts to build this system.


