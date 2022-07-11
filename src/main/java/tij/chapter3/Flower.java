package tij.chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Flower {
    private int price;
    private String name;

    public Flower(int price) {
        this.price = price;
    }

    public Flower(String name) {
        this(12);
        this.name = name;
    }

    public static void main(String[] args) {
        Flower hello = new Flower("hello");
        System.out.format("my name is %s, age = %d", hello.name, hello.price);
    }
}
