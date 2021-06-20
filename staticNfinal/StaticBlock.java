package sarbajit.staticNfinal;

class StaticTest {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class StaticBlock {

    /*static {
        System.out.println("Block 1");
    }*/

    public static void main(String[] args) {
        //StaticTest t=new StaticTest();
        System.out.println("Main");
        StaticTest t=new StaticTest();
    }

    /*static {
    System.out.println("Block 2");
    }*/
}