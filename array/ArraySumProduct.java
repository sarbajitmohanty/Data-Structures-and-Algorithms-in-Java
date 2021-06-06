package sarbajit.array;

public class ArraySumProduct {

    public static void main(String[] args){
        int[] A = {1,2,3,4,5,6};
        int sum = 0, product = 1;
        for (int j : A) {
            sum = sum + j;
            product = product * j;
        }
        System.out.println("Sum: "+sum+"\n"+"Product: "+product);
    }
}
