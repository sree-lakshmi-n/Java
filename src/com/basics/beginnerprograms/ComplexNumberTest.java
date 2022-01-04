package com.basics.beginnerprograms;

class ComplexNumber {
    private int real;
    private int imag;
    // If parameterised constructor is defined, compiler won't add default constructor.
    // You should add it explicitly.
    // Else, it'd throw error if you try to create an object with no parameters.
    ComplexNumber() {
        real = 0;
        imag = 0;
    }
     ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber add(ComplexNumber c){
        int real = this.real + c.real;
        int imag = this.imag + c.imag;
        return new ComplexNumber(real,imag);
    }
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int real = c1.real + c2.real;
        int imag = c1.imag + c2.imag;
        return new ComplexNumber(real,imag);
    }
    public String print(){
        return "("+this.real + "+"+this.imag+"i)";
    }
}

public class ComplexNumberTest{
    public static void main(String[] args) {
        ComplexNumber[] cArr1 = new ComplexNumber[]{new ComplexNumber(),
                new ComplexNumber(10,4), new ComplexNumber(-4,9),
                new ComplexNumber(8,90)};
        ComplexNumber[] cArr2 = new ComplexNumber[]{new ComplexNumber(10,20),
                new ComplexNumber(14,-4), new ComplexNumber(-90,99),
                new ComplexNumber()};
        ComplexNumber[] cArr3 = new ComplexNumber[]{new ComplexNumber(1,-2),
                new ComplexNumber(11,-14), new ComplexNumber(),
                new ComplexNumber(-70,0)};

        System.out.println("Testing add method with 1 parameter...");
        for (int i = 0; i < cArr1.length; i++) {
            System.out.println(cArr1[i].print()+" + "+cArr2[i].print()
                    +" = "+cArr1[i].add(cArr2[i]).print());
        }
        System.out.println();
        System.out.println("Testing add method with 2 parameters...");
        for (int i = 0; i < cArr1.length; i++) {
            System.out.println(cArr2[i].print() + " + " + cArr3[i].print()
                    + " = " + cArr1[i].add(cArr2[i], cArr3[i]).print());
        }
    }
}