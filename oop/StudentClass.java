package sarbajit.oop;

class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3.0;
    }
    public char grade(){
        if(average()>=90)
            return 'E';
        else if (average()>=80)
            return 'A';
        else if (average()>=70)
            return 'B';
        else if (average()>=60)
            return 'C';
        else if (average()>=50)
            return 'D';
        else
            return 'F';
    }
    public String details(){
        return "Name: " + name + "\n" + "Roll: " + roll + "\n" + "Course: " + course + "\n" + "Average Marks: " + average() + "\n" + "Grade: " + grade();
    }
    public String toString(){
        return "Name: " + name + "\n" + "Roll: " + roll + "\n" + "Course: " + course + "\n" + "Average Marks: " + average() + "\n" + "Grade: " + grade();
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student s = new Student();

        s.roll=55;
        s.name="SARBAJIT";
        s.course="B.Tech";
        s.m1=98;
        s.m2=87;
        s.m3=80;

        System.out.println(s.details());
    }
}
