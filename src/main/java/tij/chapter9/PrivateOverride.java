package tij.chapter9;


public class PrivateOverride {
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

    private void f() {
        System.out.println("private f()");
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}