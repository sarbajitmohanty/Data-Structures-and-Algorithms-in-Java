package sarbajit.methods;

public class ArrayMax {
    int arrayMax(int A[]) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {3,6,8,2,4,9,10,17,8,5,12};
        ArrayMax am = new ArrayMax();
        System.out.println(am.arrayMax(A));
    }
}
