package com.jarbin.cloud.demo.sync;

public class TestSynchronized implements Runnable{

    private static int count = 0;
    private static Integer count2 = 128;
    private Integer num = 127;
    private Integer num2 = 128;
    private String str = "123";
    private String str2 = new String("123");

    public static void main(String[] args) {
        //TestSynchronized4 sync4 = new TestSynchronized4();
        for (int i = 0; i < 100; i++) {
            //Thread thread = new Thread(sync4);
            Thread thread = new Thread(new TestSynchronized());
            thread.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + count);
    }

    @Override
    public void run() {
        //insearse();
        //insearse2();
        //insearse3();
        insearse4();
    }

    /**
     * 非静态方法对于不同的类的实例对象无法锁住（实例对象级别）
     */
    public synchronized void  insearse(){
        for (int i = 0; i < 10000000; i++) {
            count++;
        }
    }

    /**
     *  静态方法对于不同的类的实例对象可以锁住（类对象级别）
     */
    public static synchronized void  insearse2(){
        for (int i = 0; i < 10000000; i++) {
            count++;
        }
    }

    /**
     *  静态代码块以class、静态变量、常量池变量为对象时，是类对象级别
     */
    public void insearse3(){
        synchronized (this){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
        synchronized (count2){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
        synchronized (num2){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
        synchronized (str2){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
    }

    /**
     *  静态代码块以实例对象、非静态且非常量池对象为锁对象时，是实例对象级别
     */
    public void insearse4(){
        synchronized (this){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
        synchronized (num){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }

        synchronized (str2){
            for (int i = 0; i < 10000000; i++) {
                count++;
            }
        }
    }
}
