package com.basics.beginnerprograms;

public class RewritingtoStringMethod {
    private String str = "Hi";
    public String toString(){
        return "Hello world";
//         return str+" world";
    }
    // You've implemented toString() of Object class.
    // => You've rewritten display format of objects.
    public void print(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        RewritingtoStringMethod rs = new RewritingtoStringMethod();
        System.out.println(rs);
        /*
         Expected output: Address of object rs
         like com.basics.beginnerprograms.RewritingtoStringMethod@11c724db

         Received output: Prints Hello World
         Because, you've implemented toString() of Object class above.
        */
        rs.print();
    }
}