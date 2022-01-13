/*
* Bouncing Balls
* https://www.codewars.com/kata/5544c7a5cb454edb3c000047
* */

package com.codewars.sixkyu;

public class BouncingBallTest {
    public static void main(String[] args) {
        BouncingBall bb = new BouncingBall();
        System.out.println(bb.bouncingBall(3,0.66,1.5));
        System.out.println(bb.bouncingBall(3,1,1.5));
    }
}
class BouncingBall{
//    Three conditions must be met for a valid experiment:
//    Float parameter "h" in meters must be greater than 0
//    Float parameter "bounce" must be greater than 0 and less than 1
//    Float parameter "window" must be less than h.
    private boolean isParamValid(double h, double bounce, double window){
        if(h>0 && bounce>0 && bounce<1 && window<h)
            return true;
        return false;
    }
    public int bouncingBall(double h, double bounce, double window){
        int result = -1;
        if(isParamValid(h,bounce,window)){
            while(h>window){
                result+=2;
                h*=bounce;
            }
        }
        return result;
    }
}