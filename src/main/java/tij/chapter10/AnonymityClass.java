package tij.chapter10;

public class AnonymityClass {

    public static void main(String[] args) {
        AnonymityClass anonymityClass = new AnonymityClass();
        anonymityClass.contents().values();
    }

    public Contents contents() {
        return new Contents() {
            @Override
            public void values() {
                System.out.println(123);
            }
        };
    }
}
