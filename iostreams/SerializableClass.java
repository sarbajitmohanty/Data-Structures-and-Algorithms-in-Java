package sarbajit.iostreams;

import java.io.*;

class StudentDemo implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public StudentDemo() {
    }
    public StudentDemo(int r,String n,float a,String d) {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString() {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}

public class SerializableClass {
    /* public static void main(String[] args) throws Exception {
         FileOutputStream fos=new FileOutputStream("C:\\Java\\Student3.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);

         Student s=new Student(10,"John",89.9f,"CSE");

         oos.writeObject(s);

         fos.close();
         oos.close();

     }
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Java\\Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        StudentDemo s=(StudentDemo) ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();

    }
}