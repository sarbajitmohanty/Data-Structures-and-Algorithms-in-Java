package sarbajit.methods;

public class SumOfAllElements {
    static int sum(int ...N){
        int s = 0;
        for (int i=0; i<N.length; i++){
            s+=N[i];
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,34,3));
    }
}
