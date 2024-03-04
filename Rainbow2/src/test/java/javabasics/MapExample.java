package javabasics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> m= new HashMap<Integer,String>();
        m.put(34355,"learn");
        m.put(3455,"more");
        System.out.println(m);
       System.out.println( m.get(34355));
        Map<List, List> m1 =new HashMap<List, List>();
    }
}
