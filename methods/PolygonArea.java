package sarbajit.methods;

import java.util.Scanner;

public class PolygonArea {
    double area(double l, double b){
        return l*b;
    }
    double area(double r){
        return Math.PI * Math.pow(r,2);
    }
    double area(double l, double b, double h){
        return l*b*h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolygonArea pa = new PolygonArea();
        System.out.println("Area of rectangle = "+pa.area(20.3, 17.6));
        System.out.println("Area of circle = "+pa.area(12.4));
        System.out.println("Area of cuboid = "+pa.area(4.3,5,7.8));
    }
}
