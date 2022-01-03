// Calculates time to sleep based on the no. of hours you want to sleep and time you need to get up.

package com.basics.beginnerprograms;

import java.util.Scanner;

public class SleepCalculator {
    int noOfSleepingHrs;
    int timeToGetUp;
    int timeToGoToSleep;
    String amOrPm;
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        display("Enter number of hours you want to sleep: "); //Only integer input
        noOfSleepingHrs = sc.nextInt()%24;  // In case you enter more than 24hrs, mod is used to take it as one cycle
        display("Enter time you have to get up: "); //Only integer input
        timeToGetUp = sc.nextInt();
        if(validateInput()){
            display("AM or PM?");
            amOrPm = sc.next().toLowerCase();
            if(timeToGetUp !=12 && amOrPm.equals("pm")) {   //Conversion of 12am to 24hrs
                timeToGetUp += 12;      // To convert from 12hrs to 24hrs format
            }
            else if(amOrPm.equals("am") && timeToGetUp == 12){
                timeToGetUp = 0;
            }
        }
        else{
            display("Enter valid values");
        }
    }
    public boolean validateInput(){
        if(timeToGetUp>12){
            return false;
        }
        return true;
    }
    public void setTimeToGoToSleep(){
        timeToGoToSleep = (timeToGetUp - noOfSleepingHrs);
        if(timeToGoToSleep<0){
            timeToGoToSleep += 24;
        }
        else if (timeToGoToSleep == 0){     // Conversion of 0hrs to 12am
            timeToGoToSleep = 12;
        }
        amOrPm = "am";
        if(timeToGoToSleep>12){               // Conversion back to 12hrs format
            timeToGoToSleep -= 12;
            amOrPm = "pm";
        }
    }
    public void display(Object value){
        System.out.println(value);
    }
    public static void main(String[] args) {
        SleepCalculator sleep = new SleepCalculator();
        sleep.getInput();
        sleep.setTimeToGoToSleep();
        sleep.display("Time to go to sleep: "+ sleep.timeToGoToSleep+" "+sleep.amOrPm);
    }
}
