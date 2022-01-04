package com.basics.constructors;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(10);
        rect.setWidth(30);
        rect.display("Area of rectangle: " + rect.area());
    }
}
class Rectangle {
    private int height;
    private int width;
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int area(){
        return this.height*this.width;
    }
    public void display(Object result){
        System.out.println(result);
    }
}