package org.wgcodecompany.classes;

//import lombok.Builder;
//import lombok.Data;
//import lombok.Value;

//@Value
//@Builder
//@Data
public class Student {

    public String name;
    public int age;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return ("Student's name is: " + this.getName() +
                "\n Student age is: " + this.getAge() +
                "\n Student address is: " + this.getAddress());
    }

    public static void main(String[] args) {
        Student john = new Student("John", 21, "1234 E. king's NY");
        System.out.println(john);

    }
}


