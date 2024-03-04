package javabasics;

public class ReturnSample {
    int a =100;
    public static void main(String[] args) {
        ReturnSample r = new ReturnSample();
        r.m1();
    }
    public int m1(){
   int a = 1;
   System.out.println(a);
   System.out.println(this.a);
   return a;

    }
    public String m2(){
  String b="abc";
  return b;

    }
}
