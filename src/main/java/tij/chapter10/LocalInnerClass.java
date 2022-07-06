package tij.chapter10;

public class LocalInnerClass {
    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.getLocalInnerClass().values();
    }

    public Contents getLocalInnerClass() {
        class Local implements Contents {
            @Override
            public void values() {
                System.out.println("local values");
            }
        }
        return new Local();
    }
}
