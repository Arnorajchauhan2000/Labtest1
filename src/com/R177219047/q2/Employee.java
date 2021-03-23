package com.R177219047.q2;

class Employee implements Cloneable{
    int id;
    String name;
    Department d;
    Employee(int i, String n, Department di){
        this.id = i;
        this.name = n;
        this.d = di;
    }
    public void setD(Department d) {
        this.d = d;
    }
    public Department getD() {
        return d;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (Employee)super.clone();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Your Emp ID : "+id + " Your Name : "+ name +d;
    }
}






























//ddddddddddd