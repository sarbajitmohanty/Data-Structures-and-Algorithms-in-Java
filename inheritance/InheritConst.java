package sarbajit.inheritance;

class Parent{
    public Parent(){
        System.out.println("Non-param of Parent");
    }
    public Parent(int x){
        System.out.println("Param of Parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Non-param of Child");
    }
    public Child(int y){
        System.out.println("Param of Child");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("Two Params of Child");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Non-param of GrandChild");
    }
    public GrandChild(int z){
        System.out.println("Param of GrandChild");
    }
}

public class InheritConst {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
    }
}
