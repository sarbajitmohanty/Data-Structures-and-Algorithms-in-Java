package sarbajit.Array;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] A = {3,9,7,8,12,6,15,5,4,10};
        int[] B = {3,9,7,8,12,6,15,5,4,10};

        System.out.println("Original Array");
        for(int x: A){
            System.out.print(x+" ");
        }
        System.out.println("");

        //left rotation
        System.out.println("After Left Rotation");
        int ltemp = A[0];
        for (int i=1; i<A.length; i++){
            A[i-1] = A[i];
        }
        A[A.length-1] = ltemp;
        for(int x: A){
            System.out.print(x+" ");
        }
        System.out.println("");

        //right rotation
        System.out.println("After Right Rotation");
        int rtemp = B[B.length-1];
        for (int i=B.length-1; i>0; i--){
            B[i] = B[i-1];
        }
        B[0] = rtemp;
        for(int x: B){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}
