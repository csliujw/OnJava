package tij.chapter5;

// reuse/Beetle.java
// The full process of initialization
class Insect {
    private static int x1 = printInit("static Insect.x1 initialized");
    protected int j;
    private int i = 9;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private static int x2 = printInit("static Beetle.x2 initialized");
    private int k = printInit("Beetle.k.initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}