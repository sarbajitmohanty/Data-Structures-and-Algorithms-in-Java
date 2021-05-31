package sarbajit.methods;

public class GCD {

    int gcd(int m, int n){
        while (m!=n){
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }
    int gcdRecursive(int m, int n){
        if(m%n==0)
            return n;
        else
            return gcdRecursive(n, m%n);
    }
    public static void main(String[] args) {
        GCD g = new GCD();
        System.out.println(g.gcd(35,56));
        System.out.println(g.gcdRecursive(35,56));
    }
}
