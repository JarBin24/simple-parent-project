package com.jarbin.cloud.demo.lambda;

public class TestLambda {

    public static void main9(String[] args){
        //jdk 1.7
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(this.hashCode());
            }
        }).start();

        //jdk 1.8
        new Thread(() -> System.out.println("7777")).start();
    }

    public static void main(String[] args){
        //jdk 1.7
        Comparator comparator = new Comparator() {
            @Override
            public int compare(int a) {
                System.out.println("start1");
                return a;
            }
        };
        comparator.compare(1);

        //jdk 1.8
        Comparator comparator2 = (a) -> {
            System.out.println("start2");
            return a;
        };
        comparator2.compare(2);
    }
}
