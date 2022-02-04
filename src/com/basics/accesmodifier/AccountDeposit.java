// Illustrating difference between static variable and instance variable
package com.basics.accesmodifier;

public class AccountDeposit {
    private long accountNum;
    private long accountBalance;
    private static int count;
    private int noOfTransactions;
    public void deposit(int amount){
        noOfTransactions +=1;
        count += 1;
        accountBalance += amount;
    }
    public static void main(String[] args) {
        AccountDeposit ad1 = new AccountDeposit();
        ad1.deposit(1000);
        ad1.deposit(1000);
        System.out.println(ad1.accountBalance);
        System.out.println(ad1.noOfTransactions);
        System.out.println(count);
        System.out.println("----------------");
        AccountDeposit ad2 = new AccountDeposit();
        ad2.deposit(1000);
        ad2.deposit(1000);
        System.out.println(ad2.accountBalance);
        System.out.println(ad2.noOfTransactions);
        System.out.println(count);
        System.out.println("----------------");
        AccountDeposit ad3 = new AccountDeposit();
        ad3.deposit(1000);
        ad3.deposit(1000);
        System.out.println(ad3.accountBalance);
        System.out.println(ad3.noOfTransactions);
        System.out.println(count);
    }
}