// Types of constructors

package com.basics.constructors;

public class Constructors {
    String className;
    int classId;
    public Constructors(){    //no argument constructor
        this.classId = 1;
        this.className = "No argument Constructor";
        System.out.println("Class id: "+classId+"\n Class name: "+ className);
    }
    public Constructors(String className){ //parameterised constructor
        this.classId = 2;
        this.className = className;
        System.out.println("Class id: "+classId+"\n Class name: "+ className);
    }
    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors("Parameterized Constructor ");
    }
}
