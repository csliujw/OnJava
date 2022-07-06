package tij.chapter5;

public class TestThis {
    public TestThis() {
        this("lisi");
    }

    public TestThis(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestThis testThis = new TestThis();
    }
}
