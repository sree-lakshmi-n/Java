package com.basics.abstractclasses;

abstract class Employee {
    String name;
    String emailAddress;
    long phoneNumber;
    public void healthInsurance(){

    }
    public void leaveDetails(){

    }
    public void pfBenefits(){

    }
    abstract void workDescription();
    abstract void shiftTimings();
}

/*
* Method 1 - Make child class abstract
* abstract class Developer extends Employee{

}
* */

/*
* Method 2 - Complete abstract method definitions
* */

class Developer extends Employee{
    public void workDescription(){

    }
    public void shiftTimings(){

    }
}

class SupportProfessional extends Employee{
    public void workDescription(){

    }
    public void shiftTimings(){

    }
}
