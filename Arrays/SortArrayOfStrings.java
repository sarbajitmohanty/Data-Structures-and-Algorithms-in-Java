package sarbajit.Array;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.println(x);
    }
}
