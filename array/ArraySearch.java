package sarbajit.array;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = {1,2,3,4,5,6};
        int key = scanner.nextInt();
        for (int i=0; i<A.length; i++) {
            if (A[i]==key){
                System.out.println("Element found at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element Not Found");
    }
}
