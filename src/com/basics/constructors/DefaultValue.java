// Default values of various datatypes

package com.basics.constructors;

public class DefaultValue {
    int i;
    boolean b;
    byte by;
    short sh;
    long lg;
    float f;
    double d;
    char c;
    String s;
    Object o;
    public static void main(String[] args) {
        DefaultValue dv = new DefaultValue();
        //Default constructor gets called
        System.out.println("Default values: \n int = "+dv.i+"\n boolean= "+dv.b+"\n byte= "+dv.by+"\n short = "+dv.sh+
                "\n long = "+dv.lg+"\n float = "+dv.f+"\n double = "+dv.d+"\n char = "+dv.c+"\n String = "+dv.s+
                "\n Object= "+dv.o);
    }
}
