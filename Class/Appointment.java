package Class;
public class Appointment {

    private int patient_Id;
    private String date;

    //constructor
    public Appointment(int patient_Id, String date) {
        this.patient_Id = patient_Id;
        this.date = date;
    }


    public int getPatient_Id() {
        return patient_Id;
    }


    public void setPatient_Id(int patient_Id) {
        this.patient_Id = patient_Id;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String toString() {
        return ("ID: " + patient_Id + ", Appointment Date: " + date);
    }

}