package sarbajit.staticNfinal;

class FinalTest {
    public final void show() {
        System.out.println();
    }
}

class Test1 extends FinalTest {
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class Final {

    /*final float PI;

    public Final() {
        PI=3.1425f;
    }*/

    public static void main(String[] args) {

        /*final float PI;
        PI=3.1425f;
        System.out.println(PI);*/

    }
}