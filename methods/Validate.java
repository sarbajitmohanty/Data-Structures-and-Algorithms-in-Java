package sarbajit.methods;

import java.util.Scanner;

public class Validate {
    boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age) {
        return age>=18 && age<=60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name = ");
        String name = sc.next();
        System.out.print("Enter age = ");
        int age = sc.nextInt();

        Validate vd = new Validate();

        System.out.println("Name = "+ vd.validate(name));
        System.out.println("Age = "+ vd.validate(age));
    }
}
