package src.com.scaleupindia.com.scaleupindia.entity;

import src.com.scaleupindia.com.scaleupindia.utility.GeneratorUtil;

import java.util.Optional;

public class Employee {
    private int id;
    private String name;
    private int marks;
    private Optional<Address> address;

    public Employee() {
        super();
        this.id = 100;
        this.name = "ScaleUp india";
        this.marks = 100;
        this.address = Optional.of(GeneratorUtil.populateAddress());
    }

    public Employee(int id, String name, int marks,Address address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = Optional.of(address);
    }
    public Employee(int id, String name, int marks,Optional<Address> address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }
}
