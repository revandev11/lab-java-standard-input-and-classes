package org.example;

public class employee {
private String name;
private String email;
private int age;
protected double salary;
public employee(String name,String email,int age,double salary){
    this.name=name;
    this.email=email;
    this.age=age;
    this.salary=salary;
}

    public employee(String name, double salary) {
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
