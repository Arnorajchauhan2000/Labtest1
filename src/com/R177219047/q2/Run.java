package com.R177219047.q2;

public class Run {
    public static void main(String[] args) {
        
        Department d1 = new Department(1001, "management");
        Employee e1 = new Employee(1, "Arnoraj",d1);
        //System.out.println(e1.getD().getDid());

        System.out.println(e1);


        try {
            Employee e2 = e1.clone();
            System.out.println(e2);
        } catch (Exception e) {
            //TODO: handle exception
        }
        e1.getD().setDname("Accounts");
        System.out.println(e1);
        
        

    }
}

























//ddddddddddddd