package sarbajit.methods;

public class VariableArguments {
    static void show(int ...A){
        for (int x: A)
            System.out.print(x+",");
        System.out.println();
    }
    static double avg(int ...N){
        double sum =0;
        for(int x: N)
            sum+=x;
        return sum/N.length;
    }
    public static void main(String[] args) {
        show(1,2,3,4,5,6);
        show(new int[]{1,5,2,8,65,3});
        System.out.println(avg(2,3,5));
    }
}
