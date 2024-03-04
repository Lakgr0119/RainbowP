package javabasics;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MethodOverLoading {
    public static void main(String[] args) {
    MethodOverLoading m = new MethodOverLoading();
    m.m1(24);
    }
    public void m1(int a){
        System.out.println(a);
    }
    public void m1(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    public void m1(String a,int b){
        System.out.println(a);

    }
}
