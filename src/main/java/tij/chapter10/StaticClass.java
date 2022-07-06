package tij.chapter10;

public class StaticClass {
    public static void main(String[] args) {
        System.out.printf("%d", Inner.say());
    }

    static class Inner {
        private static int count = 10;

        public static int say() {
            return 1;
        }
    }
}
