package sarbajit.methods;

public class MaximumNumber {
    static int maxNumber(int ...A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        } else {
            int max = A[0];
            for (int i = 0; i < A.length; i++) {
                if (A[i] > max) {
                    max = A[i];
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxNumber());
        System.out.println(maxNumber(10));
        System.out.println(maxNumber(10,20));
        System.out.println(maxNumber(12,2,42,23));
    }
}
