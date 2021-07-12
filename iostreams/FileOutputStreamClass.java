package sarbajit.iostreams;

import java.io.*;

public class FileOutputStreamClass {

    public static void main(String[] args) throws Exception {

        try(FileOutputStream fos=new FileOutputStream("C:/Java/Test.txt");) {
            String str="Learn Java Programming.";

            byte b[]=str.getBytes();

        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
            //fos.write(b, 6, str.length()-6);

            fos.write(b);

            //fos.close();

        }
        /*catch(FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }*/
    }

}