package io.github.UdayHE.creational;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton first = Singleton.INSTANCE;
        Singleton second = Singleton.INSTANCE;
        System.out.println("First hashcode:" + first.hashCode());
        System.out.println("Second hashcode:" + second.hashCode());
    }
}
