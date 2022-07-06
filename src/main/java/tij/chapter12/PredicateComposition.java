package tij.chapter12;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateComposition {
    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fongopuckey")
                .filter(p4)
                .forEach(System.out::println);
    }    static Predicate<String>
            p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
    // （不包含 bar且长度小于5）或者（它包含 foo。）
    p4 = p1.negate().and(p2).or(p3);


}
