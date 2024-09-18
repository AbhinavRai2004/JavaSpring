package springprogram6.beans;

public class Student {
    private String name;
    private int rollNo;
    private Address address;

    public Student(int rollNo, String name,Address address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(rollNo + " " + name + " " + address);
    }
}
