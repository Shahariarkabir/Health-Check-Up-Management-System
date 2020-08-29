
// Admin class to create an admin for login
public class Admin extends patient {

    private String name;
    private int Id; // variables

    // Constructor to initialize the variables
    public Admin(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    // getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void showDetails() {
        System.out.println("Admin ID: " + getId());
        System.out.println("Admin Name: " + getName());
    }
}
