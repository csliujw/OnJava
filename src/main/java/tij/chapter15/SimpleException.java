package tij.chapter15;

public class SimpleException extends Exception {
}

class InheritingExceptions {
    public static void main(String[] args) {
        InheritingExceptions exception = new InheritingExceptions();
        try {
            exception.f();
        } catch (SimpleException e) {
            e.printStackTrace();
        }
    }

    public void f() throws SimpleException {
        throw new SimpleException();
    }
}
