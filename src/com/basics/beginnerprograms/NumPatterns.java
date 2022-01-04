// Number Patterns

package com.basics.beginnerprograms;

public class NumPatterns{
    /*
    1 2 3 4 5
    2 3 4 5
    3 4 5
    4 5
    5
    */
    public void pattern1(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    public void pattern2(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-(i-1) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
     */
    public void pattern3(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5-(i-1); j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
     */
    public void pattern4(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    public void pattern5(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    5
    4 5
    3 4 5
    2 3 4 5
    1 2 3 4 5
     */
    public void pattern6(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5-(i-1); j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
     */
    public void pattern7(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
     */
    public void pattern8(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j >=5-(i-1) ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
     */
    public void pattern9(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /*
    5
    4 4
    3 3 3
    2 2 2 2
    1 1 1 1 1
     */
    public void pattern10(){
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= 5-(i-1) ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /*
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1
     */
    public void pattern11(){
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /*
    1 1 1 1 1
    2 2 2 2
    3 3 3
    4 4
    5
     */
    public void pattern12(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5-(i-1) ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 5
    4 3 2 1
    1 2 3
    2 1
    1
     */
    public void pattern13(){
        for (int i = 1; i <= 5 ; i++) {
            if (i % 2 == 0) {
                for (int j = 5 - (i - 1); j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= 5 - (i - 1); j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 5 6 7
    1 2 3 4 5
    1 2 3
    1
     */
    public void pattern14(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 7-(2*(i-1)) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    0 1
    1 0 1
    0 1 0 1
     */
    public void pattern15(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    0 1
    1 0 1
    0 1 0 1
     */
    public void pattern16(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
    /*
    1 3 5 7 9
    3 5 7 9
    5 7 9
    7 9
    9
     */
    public void pattern17(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 2*i-1; j <= 9 ; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    2 4
    1 3 5
    2 4 6 8
    1 3 5 7 9
     */
    public void pattern18(){
        for (int i = 1; i <= 5 ; i++) {
            if(i%2==0){
                for (int j = 2; j <=2*i ; j+=2) {
                    System.out.print(j+" ");
                }
            }
            else{
                for (int j = 1; j <=(2*i-1) ; j+=2) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    /*
    5 5 5 5 5
    5 4 5 5 5
    5 4 3 5 5
    5 4 3 2 5
    5 4 3 2 1
     */
    public void pattern19(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if(i>=j){
                    System.out.print(5-(j-1)+" ");
                }
                else{
                    System.out.print(5+" ");
                }
            }
            System.out.println();
        }
    }
    /*
    5 5 5 5 5
    4 5 5 5 5
    3 4 5 5 5
    2 3 4 5 5
    1 2 3 4 5
     */
    public void pattern20(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if(i>=j){
                    System.out.print(5-(i-1)+(j-1)+" ");
                }
                else{
                    System.out.print(5+" ");
                }
            }
            System.out.println();
        }
    }
    /*
    1
    2 3
    4 5 6
    7 8 9 10
     */
    public void pattern21(){
        int num=0;
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((num+=1)+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
     */
    public void pattern22(){
        int k;
        for (int i = 1; i <= 5 ; i++) {
            k=i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(k+" ");
                k+= 5-j;
            }
            System.out.println();
        }
    }
    /*
    1
    1 2 3
    1 2 3 4 5
    1 2 3 4 5 6 7
     */
    public void pattern23(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1 * * * * * * 1
    1 2 * * * * 2 1
    1 2 3 * * 3 2 1
    1 2 3 4 4 3 2 1
     */
    public void pattern24(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                if(j<=i) System.out.print(j+" ");
                else System.out.print("* ");
            }
            for (int j = 4; j >= 1 ; j--) {
                if(j<=i) System.out.print(j+" ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * * * 1 1 * * *
    * * 2 1 1 2 * *
    * 3 2 1 1 2 3 *
    4 3 2 1 1 2 3 4
     */
    public void pattern25(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 4; j >= 1 ; j--) {
                if(j<=i) System.out.print(j+" ");
                else System.out.print("* ");
            }
            for (int j = 1; j <= 4 ; j++) {
                if(j<=i) System.out.print(j+" ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 4 3 2 1
    1 2 3 * * 3 2 1
    1 2 * * * * 2 1
    1 * * * * * * 1
     */
    public void pattern26(){
        for (int i = 4; i >= 1 ; i--) {
            for (int j = 1; j <= 4 ; j++) {
                if(j<=i) System.out.print(j+" ");
                else System.out.print("* ");
            }
            for (int j = 4; j >= 1 ; j--) {
                if (j <= i) System.out.print(j + " ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 5
    6 7 8
    9
     */

    public void pattern27(){
        int num = 0;
        for (int i = 1; i <= 5; i+=2) {
            for (int j = 5; j >= 1; j--) {
                if(i>j) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            System.out.println();
        }
    }
    /*
            1
        2 3 4
    5 6 7 8 9
     */
    public void pattern28(){
        int num = 0;
        for (int i = 1; i <= 5; i+=2) {
            for (int j = 5; j >= 1; j--) {
                if(j>i) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            System.out.println();
        }
    }
    /*
            1
        2 3 4 5 6
    7 8 9 10 11 12 13 14
     */
    public void pattern29(){
        int num = 0;
        for (int i = 1; i <= 5; i+=2) {
            for (int j = 5; j > 1; j--) {
                if(j>i) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            for (int j = 1; j < 5; j++) {
                if(j>i) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            System.out.println();
        }
    }
    /*
       1
     2 3 4
    5 6 7 8 9
*/
    public void pattern30(){
        int num = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 5; j > 1; j--) {
                if(j>i) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            for (int j = 1; j < 5; j++) {
                if(j>i) System.out.print("  ");
                else System.out.print((num+=1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumPatterns np = new NumPatterns();
        np.pattern1();
        np.pattern2();
        np.pattern3();
        np.pattern4();
        np.pattern5();
        np.pattern6();
        np.pattern7();
        np.pattern8();
        np.pattern9();
        np.pattern10();
        np.pattern11();
        np.pattern12();
        np.pattern13();
        np.pattern14();
        np.pattern15();
        np.pattern16();
        np.pattern17();
        np.pattern18();
        np.pattern19();
        np.pattern20();
        np.pattern21();
        np.pattern22();
        np.pattern23();
        np.pattern24();
        np.pattern25();
        np.pattern26();
        np.pattern27();
        np.pattern28();
        np.pattern29();
        np.pattern30();
    }
}