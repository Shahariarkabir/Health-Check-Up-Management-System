package Class;
public  abstract class Person {
    protected  int Id;
    protected String name;



    //constructor
    public Person(int Id , String name) {
        this.Id = Id;
        this.name = name;

    }

    public int getId() {
        return Id;
    }


    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return Id + " " + name;
    }


}