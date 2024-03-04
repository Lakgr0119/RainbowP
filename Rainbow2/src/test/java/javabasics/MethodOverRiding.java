package javabasics;

public class MethodOverRiding extends MethodOverLoading{
    public static void main(String[] args) {
      MethodOverRiding m = new MethodOverRiding();
      m.m1();
    }
    public int m1(){
    int a=78;
    System.out.println(a);
    return a;
    }
}
