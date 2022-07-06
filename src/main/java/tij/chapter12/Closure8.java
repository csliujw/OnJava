package tij.chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    public static void main(String[] args) {
        Closure8 c7 = new Closure8();
        List<Integer>
                l1 = c7.makeFun().get(),
                l2 = c7.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }

    Supplier<List<Integer>> makeFun() {
        final List<Integer> ai = new ArrayList<>();
        // final 只是禁止改引用，而不是不准再内存中添加值。
        ai.add(1);
        return () -> ai;
    }
}
