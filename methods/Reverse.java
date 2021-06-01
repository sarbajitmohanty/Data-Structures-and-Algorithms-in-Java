package sarbajit.methods;

import java.util.Arrays;

public class Reverse {
    int reverse(int n){
        int rev=0;
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }
    int [] reverse(int A[]){
        int[] B = new int[A.length];
        for(int i = A.length-1,j=0; i>=0; i--,j++){
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        int[] A = {3,6,8,2,4,9,10,17,8,5,12};
        Reverse re = new Reverse();
        System.out.println("Reverse of integer = "+re.reverse(237));
        int[] B = re.reverse(A);
        for (int x: B) {
            System.out.print(x+",");
        }
    }
}
