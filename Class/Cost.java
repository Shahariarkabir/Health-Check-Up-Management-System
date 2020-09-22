package Class;
import Interface.*;

public class Cost implements Printable {

    private int Test_ID;
    private String Test_Name;
    private int Test_cost;

    // constructor
    public Cost(int Test_ID, String Test_Name, int Test_cost) {
        this.Test_ID = Test_ID;
        this.Test_Name = Test_Name;
        this.Test_cost = Test_cost;
    }

    // getter and setter
    public int getTest_ID() {
        return Test_ID;
    }

    public void setTest_ID(int Test_ID) {
        this.Test_ID = Test_ID;
    }

    public String getTest_Name() {
        return Test_Name;
    }

    public void setTest_Name(String Test_Name) {
        this.Test_Name = Test_Name;
    }

    public int getTest_cost() {
        return Test_cost;
    }

    public void setTest_cost(int Test_cost) {
        this.Test_cost = Test_cost;
    }

    @Override
    public String toString() {
        return "Test ID = " + Test_ID + ", Test Name = " + Test_Name + ", Test cost = " + Test_cost;
    }

    // implementing the interface method
    // this method print Details of Test
    @Override
    public void printDetails() {
        System.out.println(Test_ID + " " + Test_Name + " " + Test_cost);
    }
}