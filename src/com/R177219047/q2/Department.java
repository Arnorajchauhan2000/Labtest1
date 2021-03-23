package com.R177219047.q2;

public class Department {
    int did;
    String dname;
    Department(int i, String n){
        this.did= i;
        this.dname = n;
    }
    public void setDid(int did) {
        this.did = did;
    }
    public int getDid() {
        return did;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getDname() {
        return dname;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " and Your Department ID : "+did +" Your Department Name :"+dname;
    }
}


























//dddddddddd
