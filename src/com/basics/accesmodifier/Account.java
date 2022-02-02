package com.basics.accesmodifier;

public class Account {
    long accountNumber1;
    long accountBalance1;
    private long accountNumber2;
    private long accountBalance2;
    public void showData(){
        // shows data
    }
    public void deposit(int a){
        if(a<0)
            System.out.println("Error");
        else accountBalance2 += a;
    }
}
class Hacker{
    public static void main(String[] args) {
        Account a = new Account();
        a.accountBalance1 = -100;
        // A hacker account can easily change accountBalance1 since it's not private
//        a.accountBalance2(-100);
        // throws error. Can't access private members
        a.deposit(-100);
        /* Checks and since a is -ve value, throws error
         Getter and setter method, private access modifier
         acts as protective shields to prevent data loss and hacking attempts. */
    }
}