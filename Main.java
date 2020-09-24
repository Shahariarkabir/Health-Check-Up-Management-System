//package Import  Class & interface
import Class.*;
import Interface.*;
// we call library package
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Main {

    public static void main(String arg[]) {
 
        Scanner scnum = new Scanner(System.in);
        Scanner scstr = new Scanner(System.in);


        //create admin objects
        Admin admin1 = new Admin(101, "Dr. Shahariar"); //( permitter data )
        Admin admin2 = new Admin(102, "Dr. Riya");


        //add objects to ArrayList
        ArrayList<Admin> admin = new ArrayList<Admin>();
        admin.add(admin1); 
        admin.add(admin2);


        //create cost objects
        Cost test1 = new Cost(501, "Blood C/S Aerobic", 150);
        Cost test2 = new Cost(502, "Bone Marrow Fluid C/S", 450);
        Cost test3 = new Cost(503, "Covid-19", 250);
        Cost test4 = new Cost(504, "Ct Anglo Ct", 1200);
        Cost test5 = new Cost(505, "Emg Both Lower Limbs", 850);


        //add Cost Object to ArrayList
        ArrayList<Cost> test = new ArrayList<Cost>();
        test.add(test1);
        test.add(test2);
        test.add(test3);
        test.add(test4);
        test.add(test5);


        //create ArrayList of test for patient
        ArrayList<Cost> patient1_test = new ArrayList<Cost>();
        patient1_test.add(test1);
        patient1_test.add(test3);


        ArrayList<Cost> patient2_test = new ArrayList<Cost>();
        patient2_test.add(test2);
        patient2_test.add(test4);


        ArrayList<Cost> patient3_test = new ArrayList<Cost>();
        patient3_test.add(test4);
        patient3_test.add(test3);


        //create patient objects
        Patient patient1 = new Patient(3001, "Shahariar", "Male", 21, patient1_test);
        Patient patient2 = new Patient(3002, "Kabir", "Male", 23, patient2_test);
        Patient patient3 = new Patient(3003, "Riya", "Female", 18, patient3_test);


        //add patient object to ArrayList
        ArrayList<Patient> patient = new ArrayList<Patient>();
        patient.add(patient1);
        patient.add(patient2);
        patient.add(patient3);


        //create report for each patient test
        ArrayList<String> patient1_report = new ArrayList<String>();
        patient1_report.add("500");
        patient1_report.add("Negative");


        ArrayList<String> patient2_report = new ArrayList<String>();
        patient2_report.add("Positive");
        patient2_report.add("clear");


        ArrayList<String> patient3_report = new ArrayList<String>();
        patient3_report.add("clear");
        patient3_report.add("Positve");


        //create Report objects
        Reports report1 = new Reports(patient1, patient1_test, patient1_report);
        Reports report2 = new Reports(patient2, patient2_test, patient2_report);
        Reports report3 = new Reports(patient3, patient3_test, patient3_report);


        //Add report objects  to ArrayList
        ArrayList<Reports> report = new ArrayList<Reports>();
        report.add(report1);
        report.add(report2);
        report.add(report3);


        //ArrayList to hold the appointments
        ArrayList<Appointment> appointment = new ArrayList<Appointment>();
        appointment.add(new Appointment(3001, "23 Sep 2020"));
        appointment.add(new Appointment(3002, "25 Sep 2020"));
        appointment.add(new Appointment(3003, "30 Sep 2020"));


        //loop provide the options repeatedly
        while (true) {

            System.out.print("\nWelcome To  Health Check-Up Management System"
                    + "\nIn This System, we provide you"
                    + "\n1. Admin"
                    + "\n2. Patient"
                    + "\nPlease Enter Your Preferred Option :");


            int option = scnum.nextInt();

            if (option == 1) {
                //get id from admin
                System.out.print("Can I know your Admin ID :");
                int admin_id = scnum.nextInt();
                int index;
                //call findAdmin() to check if the id entered valid
                if (findAdmin(admin, admin_id) >= 0) {
                    //if valid store the arraylist index  to index
                    index = findAdmin(admin, admin_id);
                } else {

                    while (true) {
                        System.out.print("Oops!! Admin You Provide Wrong Information"
                                + "\nNo Worry Admin, Please Enter again :");


                        //repeat the process until get the valid id
                        admin_id = scnum.nextInt();
                        if (findAdmin(admin, admin_id) >= 0) {
                            index = findAdmin(admin, admin_id);
                            break;
                        }
                    }
                }
                                
                while (true) {
                    System.out.print("Hurree!!"
                            + "\nAdmin is always a SuperHero You can use Functionality from the list");


                    //print the menu
                    System.out.print("\n1. Add New Patient"
							+ "\n2. Search Patient"
                    		+ "\n3. Add Report"
							+ "\n4. Add Tests for Patient"
							+ "\n5. Create Patients Appointments."
                            + "\n6. View Patients Appointments Details."
                            + "\n7. Check Particular check-up cost."
                            + "\n8. View Patients test Details."
                            + "\n9. View Total patients list"
                            + "\n10. Logout"
                            + "\nPlease Enter your Preferred Option : ");

                    int choice = scnum.nextInt();
                    if (choice == 1) {
                    	do
						{
							try
							{
								int patient_ID;
								
								do {
								//get patient id
								System.out.print("Please Enter patient ID : ");
								patient_ID = scnum.nextInt();								
								
								Patient p = GetPatient(patient, patient_ID);
								
								if(p != null)
									System.out.println("Patient already exists");
								else
									break;
								
								}while(true);
								
								scnum.nextLine();
								
								//get patient name
								System.out.print("Please Enter patient Name : ");
								String patient_Name = scnum.nextLine();
								
								//get patient gender
								System.out.print("Please Enter patient Gender : ");
								String patient_Gender = scnum.nextLine();
		
								do
								{
									try
									{
										//get patient age
										System.out.print("Please Enter patient Age : ");
										int patient_Age = scnum.nextInt();
										scnum.nextLine();
										
										do 
										{
											
										try
										{
											int count;
											String test_ID[];
											do 
											{
												count = 0;
												
												System.out.print("\nAvailable Tests:");
												//get patient tests
												for(int i=0; i<test.size(); ++i)
													System.out.print(" " + test.get(i).getTest_ID());
												
												System.out.print("\nEnter the test numbers separated by space from the above list: ");
												String patient_Test = scnum.nextLine();
												
												test_ID = patient_Test.split(" ");																								
												
												for(int i=0; i<test_ID.length; ++i)
												{
													for(int j=0; j<test.size(); ++j)
													{
														if(test.get(j).getTest_ID() == Integer.parseInt(test_ID[i]))
														{
															++count;
															break;
														}
													}
												}
												
												if(count != test_ID.length)
													System.out.println("Invalid choice of Test IDs");
											}while(count != test_ID.length);
											
											ArrayList<Cost> patient_test = new ArrayList<Cost>();
											
											for(int i=0; i<test_ID.length; ++i)
											{
												for(int j=0; j<test.size(); ++j)
												{
													if(test.get(j).getTest_ID() == Integer.parseInt(test_ID[i]))
														patient_test.add(test.get(j));
												}
											}												
									        
											patient.add(new Patient(patient_ID, patient_Name, patient_Gender, patient_Age, patient_test));
											System.out.println("Patient added successfully\n");
											break;
										}
										catch(InputMismatchException e)
										{
											scnum.nextLine();
											System.out.println("Test ID must be an Integer.");											
										}
										catch(NumberFormatException e)
										{
											scnum.nextLine();
											System.out.println("Test ID must be an Integer.");											
										}	
									}while(true);
										
									break;
									}
									//catch exception
									catch(InputMismatchException e)
									{
										scnum.nextLine();
										System.out.println("Patient Age must be an Integer.");
									}
								}while(true);
							
							break;
							}
							//catch exception
							catch(InputMismatchException e)
							{
								scnum.nextLine();
								System.out.println("Patient ID must be an Integer.");
							}
						}while(true);
                    	
					}
					else if (choice == 2) {
						do
						{
							try
							{
								//get patient id
								System.out.print("Please Enter patient ID : ");
								int patient_ID = scnum.nextInt();
								
								Patient p = GetPatient(patient, patient_ID);
								
								if (p != null)    
									//display patient info 
									System.out.println(p.toString());
								else
									System.out.println("NO patient with such ID");
								
								break;
							}
							//catch exception
							catch(InputMismatchException e)
							{
								scnum.nextLine();
								System.out.println("Patient ID must be an Integer.");
							}
						}while(true);
					}	
					else if (choice == 3) {
						do
						{
							try
							{
								//get patient id
								System.out.print("Please Enter patient ID : ");
								int patient_ID = scnum.nextInt();
								scnum.nextLine();
								
								Patient p = GetPatient(patient, patient_ID);
						        
								boolean found = false;
								
								if (p != null) 
								{									
									//create report for patient test
							        ArrayList<String> patient_report = new ArrayList<String>();

							        int i;
							        for(i=0; i<report.size(); ++i)
							        {
							        	if(report.get(i).getPatient().getId() == p.getId())
							        	{
							        		for(int j=0; j<report.get(i).getReports().size(); ++j)
							        			patient_report.add(report.get(i).getReports().get(j));
							        		
							        		found = true;
							        		break;
							        	}
							        }
							        
							        int n = p.getTest().size() - patient_report.size();	
							        
							        if(n > 0)
							        {
										for(int j=0; j<n; ++j)
										{
											System.out.print("Enter value for the Test ID " + p.getTest().get(j + patient_report.size()).getTest_ID() + ": ");
											String value = scnum.nextLine();

											patient_report.add(value);
										}		
										if(found)
											report.get(i).setReports(patient_report);
										else
											report.add(new Reports(p, p.getTest(), patient_report));
										System.out.println("Report added successfully.");
							        }
									else
										System.out.println("No new Report to be added.");
										
								}
								else
									System.out.println("NO patient with such ID");
								
								break;
							}
							//catch exception
							catch(InputMismatchException e)
							{
								scnum.nextLine();
								System.out.println("Patient ID must be an Integer.");
							}
						}while(true);
						
					}
					else if (choice == 4) {
						do
						{
							try
							{
		                        //get patient id
		                        System.out.print("Please Enter patient ID : ");
		                        int patient_ID = scnum.nextInt();
		                       	                        		
		                        //call GetPatient method
		                        //GetPatient method return the Patient object of that id ,if id not found it return null
		                        //Patient object p store the patient with above id
		                        Patient p = GetPatient(patient, patient_ID);
		
		                        if (p != null) {
		                            	ArrayList<Cost> al_test = p.getTest();
		                            	boolean found, found2;
		                            	do
		                            	{
		                            		found = found2 = false;
		                            		try
		                            		{
		                            			System.out.print("Enter Test ID to add: ");
		                            			int test_id = scnum.nextInt();
		                            			
		                            			for(int i=0; i<test.size(); ++i)
												{
													if(test.get(i).getTest_ID() == test_id)
													{	
														found2 = true;
														for(int j=0; j<al_test.size(); ++j)
														{
															if(al_test.get(j).getTest_ID() == test_id)
															{
																found = true;
																System.out.println("Test already exists for the patient");
																break;
															}
														}
														if(!found)
														{	
															al_test.add(GetCost(test, test_id)); 
														}
														
													}
												}
		                            			if(found)
		                            				break;
		                            			
		                            			if(!found2)
		                            			{
		                            				System.out.println("Test ID does not exists");
		                            				break;
		                            			}
		                            				p.setTest(al_test);
		                            				System.out.println("Test added to patient successfully");


			                            			for(int i=0; i<report.size(); ++i)
			        						        {
			        						        	if(report.get(i).getPatient().getId() == p.getId())
			        						        	{
			        						        		report.get(i).setCost(p.getTest());
			        						        		break;
			        						        	}
			        						        }
		                            			
		                            			break;
		                            		}
		                            		catch(InputMismatchException e)
		                            		{
		                            			scnum.nextLine();
												System.out.println("Test ID must be an Integer.");
		                            		}
		                            		
		                            	}while(true);
		                            	
		                        } else {
		                            System.out.println("NO patient with such ID");
		                        }
		                        break;
							}
							catch(InputMismatchException e)
							{
								scnum.nextLine();
								System.out.println("Patient ID must be an Integer.");								
							}
						}while(true);
					}
					else if (choice == 5) {
						do
						{
							try
							{
		                        //get patient id
		                        System.out.print("Please Enter patient ID : ");
		                        int patient_ID = scnum.nextInt();
		                        //get the date
		                        System.out.print("Please Enter Preferred Date : ");
		                        String Date = scstr.nextLine();
		
		                        //call GetPatient method
		                        //GetPatient method return the Patient object of that id ,if id not found it return null
		                        //Patient object p store the patient with above id
		                        Patient p = GetPatient(patient, patient_ID);
		
		                        if (p != null) {
		                            //create appointment object
		                            Appointment a = new Appointment(patient_ID, Date);
		                            //add object to arrayList
		                            appointment.add(a);
		                            System.out.println("Appointment Booked");
		                        } else {
		                            System.out.println("NO patient with such ID");
		                        }
		                        break;
							}
							catch(InputMismatchException e)
							{
								scnum.nextLine();
								System.out.println("Patient ID must be an Integer.");								
							}
						}while(true);

                    } else if (choice == 6) {
                        System.out.println("Appointment Details");
                        int flag = 0;
                        //print the appointment Details
                        for (Appointment i : appointment) {
                            //compare the admin name of appointment object to admin name
                            System.out.println(i.toString());
                        }
                    } else if (choice == 7) {


                        System.out.println("List of all Checkups and their id");
                        for (Cost t : test) {
                            System.out.println(t.getTest_ID() + " - " + t.getTest_Name());
                        }
                        //get test id
                        System.out.println("Enter Test id");
                        int test_id = scnum.nextInt();


                        //call GetCost method
                        //GetCost method return the Cost object of that id ,if id not found it return null
                        Cost t = GetCost(test, test_id);


                        if (t != null) {
                            //print the cost details
                            t.printDetails();
                        } else {
                            System.out.println("NO check-up with such ID");
                        }


                    } else if (choice == 8) {
                        System.out.println("All Patients and their Id's");
                        for (Patient p : patient) {
                            System.out.printf("\n%-10s%-10s", p.getId(), p.getName());
                        }
                        //get patient id
                        System.out.print("\nEnter a patient id to see its report: ");
                        int patient_ID = scnum.nextInt();


                        //call GetPatient method
                        Patient p = GetPatient(patient, patient_ID); 
                        p.printDetails();
                        
                        if (p != null) {
                            for (Cost c : p.getTest()) {

                               

                                //print the checkup performed by the patient
                                c.printDetails();
                            }
                        	 //print the Report Details of the Patient
								/*
								 * for (Reports r : report) { if (r.getPatient().getId() == p.getId()) {
								 * r.printDetails(); } }
								 */
                        } else {
                            System.out.println("NO patient with such ID");
                        }


                    } else if (choice == 9) {


                        //print all patient Details
                        System.out.println("Total Patients List\n");
                        for (Patient p : patient) {

                            p.printDetails();
                            System.out.println();
                        }
                        // Here for Admin Logout Option;
                    } else if (choice == 10) {
                            break;
                    } else {
                        System.out.println("Invalid Option");
                    }

                    System.out.println("Admin, If  Want to Back Home Enter 0 \n Otherwise, Please Enter 10 for Log-out ");
                    //get input from the user
                    String again = scnum.next();
                    if (again.equals("0")) {
                        continue;

                    } else {
                        System.out.print("Do you want to go back to Login Screen ? (YES/NO) : ");
                        String login = scnum.next();
                        login = login.toUpperCase();
                        if (login.equals("YES")) {
                            break;
                        } else {
                            System.out.println("Thank you for using the System!!! ");
                            return;
                        }
                    }


                }


            } else if (option == 2) {

                //get Patient Id;;
                System.out.print("Can i know your Patient ID:");
                int patient_id = scnum.nextInt();
                int index;
                //call findPatient() to check if the id entered valid
                if (findPatient(patient, patient_id) >= 0) {
                    //if valid store the arraylist index  to index
                    index = findPatient(patient, patient_id);
                } else {
                    System.out.print("Ohh! No, You Provide Wrong Information Don't woerry,"
                            + "\nDon't Lose Your Hope Please Enter Patient ID again :");

                    //repeat the process until correct entered id
                    while (true) {
                        patient_id = scnum.nextInt();
                        if (findPatient(patient, patient_id) >= 0) {
                            index = findPatient(patient, patient_id);
                            break;
                        }
                        System.out.println("Oh No!! You Provide Wrong Information"
                                + "\nNo Worry , Please Enter again :");

                    }

                }

                while (true) {
                    //print menu
                    System.out.print("Yipee!!"
                            + "\nYou are a RockStar. Here we Glad to inform you"
                            + "\nWe have 5 Types of Awesome Category.");


                    System.out.println("\n1. Create Patients Appointments."
                            + "\n2. View Patients Appointments Details."
                            + "\n3. Check Particular check-up cost."
                            + "\n4. View Patients test Details."
                            + "\n5. View Reports"
                            + "\n6. Logout"
                            + "\nPlease Enter your Preferred Option");


                    int choice = scnum.nextInt();


                    if (choice == 1) {
                        //get date
                        System.out.println("Please Enter Preferred Date:");
                        String Date = scstr.nextLine();

                        //create appointment object
                        Appointment a = new Appointment(patient.get(index).getId(), Date);
                        //add object to arrayList
                        appointment.add(a);
                        System.out.println("Appointment created successfully");

                    } else if (choice == 2) {
                        System.out.println("Appointment Details");
                        int flag = 0;
                        //print the appointment Details
                        for (Appointment i : appointment) {
                            if (i.getPatient_Id() == patient.get(index).getId())
                                //compare the admin name of appointment object to admin name
                                System.out.println(i.toString());

                        }

                    } else if (choice == 3) {


                        System.out.println("List of all Checkups and their id");
                        for (Cost t : test) {
                            System.out.println(t.getTest_ID() + " - " + t.getTest_Name());
                        }
                        //get test id
                        System.out.println("Enter Test id");
                        int test_id = scnum.nextInt();

                        //call GetCost method
                        //GetCost method return the Cost object of that id ,if id not found it return null
                        Cost t = GetCost(test, test_id);


                        if (t != null) {
                            //print the cost details
                            t.printDetails();
                        } else {
                            System.out.println("NO check-up with such ID");
                        }


                    } else if (choice == 4) {

                        Patient p = patient.get(index);
                        if (p != null) {
                            for (Cost c : p.getTest()) {
                                //print the checkup performed by the patient
                                c.printDetails();
                            }
                        }

                    } else if (choice == 5) {

                        String file = "";
                        //print the Report Details of the Patient
                        for (Reports r : report) {
                            if (r.getPatient().getId() == patient.get(index).getId()) {
                                r.printDetails();
                                //file store all Report detail as String
                                file = r.printDetails(r);

                            }
                        }
                        //Add the report to file
                        try {
                            //create a file in the name of patient name
                            FileWriter myWriter = new FileWriter(patient.get(index).getName() + ".txt");
                            //write report to file
                            myWriter.write(file);
                            //close file
                            myWriter.close();
                            System.out.println("Report Successfully Saved to the file.");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }

                    // Here for  Patient Logout Option;
                    } else if (choice == 6) {
                        break;
                    } else {
                        System.out.println("Invalid Option");
                    }

                    System.out.println("Patient, If you Want to Back Home Enter 0 \n Otherwise, Please Enter 6 for Log-out");
                    String again = scnum.next();
                    if (again.equals("0")) {
                        continue;
                    } else {
                        System.out.print("Do you want to go back to Login Screen ? (YES/NO) : ");
                        String login = scnum.next();
                        login = login.toUpperCase();
                        if (login.equals("YES")) {
                            break;
                        } else {
                            System.out.println("Thank you for using the System!!! ");
                            return;
                        }
                    }

                }
            } else {
                System.out.println("Oh No!! You Provide Wrong Information"
                        + "\nNo Worry Admin, Please Enter again :");
            }


        }
    }


    private static int findAdmin(ArrayList<Admin> admin, int id) {
        for (int i = 0; i < admin.size(); i++) {
            if (admin.get(i).getId() == id) {
                return i;
            }
        }


        return -1;
    }


    private static Patient GetPatient(ArrayList<Patient> patient, int patient_ID) {
        for (Patient p : patient) {
            if (p.getId() == patient_ID) {
                return p;
            }
        }


        return null;
    }


    private static Cost GetCost(ArrayList<Cost> test, int test_id) {
        for (Cost p : test) {
            if (p.getTest_ID() == test_id) {
                return p;
            }
        }


        return null;
    }


    private static int findPatient(ArrayList<Patient> patient, int patient_id) {
        for (int i = 0; i < patient.size(); i++) {
            if (patient.get(i).getId() == patient_id) {
                return i;
            }
        }


        return -1;
    }


    private static Admin GetAdmin(ArrayList<Admin> admin, int admin_ID) {
        for (Admin p : admin) {
            if (p.getId() == admin_ID) {
                return p;
            }
        }

        return null;
    }
 
}