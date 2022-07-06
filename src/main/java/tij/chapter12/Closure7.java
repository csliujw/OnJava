package tij.chapter12;

import java.util.function.IntSupplier;

public class Closure7 {
    public static void main(String[] args) {
        Integer i = 0;
        i += 1;
        System.out.println(i.getClass());
    }

    IntSupplier makeFun(int x) {
        Integer i = 0;
//        i = i + 1;
        return () -> x + i;
    }
}
