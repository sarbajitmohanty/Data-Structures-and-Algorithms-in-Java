package sarbajit.methods;

public class MethodOverloading {
    int max(int x, int y){
        return x>y ? x : y;
    }
    double max (double x, double y){
        return x>y ? x : y;
    }
    int max(int x, int y, int z){
        return x>y && x>z  ?  x : (y>z ? y : z);
    }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.max(1,5,76));
        System.out.println(mo.max(2.5,4.2));
    }
}
