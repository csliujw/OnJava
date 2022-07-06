package tij.chapter17;

import java.util.stream.Stream;

public class InfiniteRecursion {
    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new).limit(10).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }
}