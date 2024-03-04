package javabasics;

import org.checkerframework.common.value.qual.EnsuresMinLenIf;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

       List<Integer> l = new ArrayList<Integer>();
      l.add(34);
     l.add(45);
     for (Integer a:l){
         System.out.println(a);
     }
       System.out.println(l);
      l.add(100);
      System.out.println(l);
      System.out.println(l.get(2));
       List<String> l1 = new ArrayList<String>();
       l1.add("learn");
       l1.add("add");
       System.out.println(l1);
       List<Integer> h = new ArrayList<Integer>();
     h.add(564);
      h.add(450);
      System.out.println(h);
      for (Integer hh:h){
          System.out.println(hh);
      }


  }
}
