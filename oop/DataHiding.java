package sarbajit.oop;

class RectangleDataHiding{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int l){
        if(l>=0){
            length = l;
        } else {
            length = 0;
        }
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b>=0){
            breadth = b;
        } else {
            breadth = 0;
        }
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class DataHiding {
    public static void main(String[] args) {
        RectangleDataHiding r1 = new RectangleDataHiding();

        r1.setLength(20);
        r1.setBreadth(20);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
