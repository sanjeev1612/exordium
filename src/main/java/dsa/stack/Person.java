package dsa.stack;

public class Person {
    String name;
    String rollNo;

    Person(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "  Roll No :" + this.rollNo;
    }
}
