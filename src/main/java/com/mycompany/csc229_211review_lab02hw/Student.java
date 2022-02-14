package com.mycompany.csc229_211review_lab02hw;

    public class Student extends Person {
      String name;
        int gpa = 0;

    Student(String name, int gpa) {
       this.name = name;
       this.gpa = gpa;
    }
        Student() {
       this.name = "";
       this.gpa = 0;
    } 
       //get gpa
    public int getGpa() {
        return gpa;
    }
       //set gpa
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    
    
    @Override
    public String getAddress() {return this.address;
    }

    @Override
    public void setAddress(String address) {
            this.address=address;
    }

}