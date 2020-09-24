package Class;
import Interface.*;
import java.util.ArrayList;

public class Reports implements Printable {

    private Patient patient;
    private ArrayList<Cost> cost;
    private ArrayList<String> reports;
    public Reports(Patient patient, ArrayList<Cost> cost, ArrayList<String> reports) {
        this.patient = patient;
        this.cost = cost;
        this.reports = reports;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public ArrayList<Cost> getCost() {
        return cost;
    }
    public void setCost(ArrayList<Cost> cost) {
        this.cost = cost;
    }
    public ArrayList<String> getReports() {
        return reports;
    }
    public void setReports(ArrayList<String> reports) {
        this.reports = reports;
    }

    @Override
    //implementing the interface method
    //this method the print the report of each test
    public void printDetails() {
        System.out.println(patient.toString());
        for (int i = 0; i < cost.size(); i++) {
            System.out.println(cost.get(i).getTest_ID() + " " + cost.get(i).getTest_Name() + " " + reports.get(i));
        }
    }

    //polymorphism method overloading implemented here
    //this method returns all the report Details as String
    public String printDetails(Reports r) {

        String Details = "ID     : " + r.patient.getId() + System.lineSeparator() + ""
                + "NAME   : " + r.patient.getName() + System.lineSeparator() + ""
                + "GENDER : " + r.patient.getGender() + System.lineSeparator() + ""
                + "AGE    : " + r.patient.getAge() + System.lineSeparator();
        for (int i = 0; i < cost.size(); i++) {
            Details = Details + System.lineSeparator() + cost.get(i).getTest_ID() + " " + cost.get(i).getTest_Name() + " " + reports.get(i);
        }

        return Details;
    }


}
