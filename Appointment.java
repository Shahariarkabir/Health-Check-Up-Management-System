public class Appointment

{

    private Patient patient;
    private String date;
    private Admin admin;

    public Appointment() {
    }

    public Appointment(Patient patient, String date, Admin admin) {
        this.patient = patient;
        this.date = date;
        this.admin = admin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

}