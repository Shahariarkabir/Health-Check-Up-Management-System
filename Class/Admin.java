package Class;
import Interface.*;

public class Admin extends Person implements Printable {

    //constructor
    public Admin(int Id, String name) {
        super(Id , name);
    }

    //implementing the interface method
    @Override
    //this method print Details of Admin
    public void printDetails() {

        System.out.println(super.toString());
    }

}