package com.basics.beginnerprograms;

public class AccessModifierInitialising {
    private int rollNum = 1;
    public String name = "Jane";
    protected String mailId = "jane@123.com";
    long phoneNum = 123456789;

    public AccessModifierInitialising() {
    }
    private AccessModifierInitialising(int rollNum){
        this.rollNum = rollNum;
        name = "Joe";
        mailId = "joe@123.com";
        phoneNum = 987654321;
    }
    protected void printResult(){
        System.out.println("Result");
    }
}
