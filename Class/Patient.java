package Class;
import Interface.*;

import java.util.ArrayList;


public class Patient extends Person implements Printable {


    private String Gender;
    private int age;
    private ArrayList<Cost> test;


    //constructor


    public Patient(int Id, String name, String Gender, int age, ArrayList<Cost> test) {
        super(Id ,name);
        this.Gender = Gender;
        this.age = age;
        this.test = test;
    }


    //getter and setter

    public String getGender() {
        return Gender;
    }


    public void setGender(String Gender) {
        this.Gender = Gender;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public ArrayList<Cost> getTest() {
        return test;
    }


    public void setTest(ArrayList<Cost> test) {
        this.test = test;
    }


    //polymorphism implemented the super and child class have same method
    @Override
    public String toString() {
        return super.toString() + " " + Gender + " " + age;
    }


    @Override
    //implementing the interface method
    //this method print Details of Patient
    public void printDetails() {
        System.out.println(toString());
    }

}