package sarbajit.staticNfinal;

class MethodTest {
    static int x=10;
    int y=20;

    void show() {
        System.out.println(x+" "+y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        MethodTest t1=new MethodTest();
        t1.show();
        t1.x=30;
        t1.y=50;

        MethodTest t2=new MethodTest();
        t2.show();

    }
}
