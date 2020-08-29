 // Admin class to create an admin for login
public class Admin
{
    
    private String name;
    private int Id;     // variables  


     // Constructor to initialize the variables
    public Admin(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }


    //getter and setter
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return Id;
    }


    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    
}
