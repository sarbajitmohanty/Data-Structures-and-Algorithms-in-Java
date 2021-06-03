package sarbajit.oop;

class Triangle{
    private int base,height;

    public Triangle(){
        base=2;
        height=2;
    }
    public Triangle(int b, int h){
        setBase(b);
        setHeight(h);
    }
    public Triangle(int s){
        base = s;
        height = s;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int b){
        if(b>=0){
            base = b;
        } else {
            base = 0;
        }
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        if(h>=0){
            height = h;
        } else {
            height = 0;
        }
    }

    public double area(){
        return 0.5*base*height;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Triangle t = new Triangle(17,15);
        System.out.println(t.area());
    }
}