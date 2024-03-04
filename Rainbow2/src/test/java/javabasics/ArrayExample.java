package javabasics;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a = {45,78,90,23};
        for(Integer output:a){
            System.out.println(output);
        }

        System.out.println(a[1]);
        String[] h ={ "learnmore", "more"};
        System.out.println(h[1]);
        System.out.println(a.length);
        for(int c=0; c<a.length; c++)
        {
            System.out.println(a[c]);
        }

    }
}
