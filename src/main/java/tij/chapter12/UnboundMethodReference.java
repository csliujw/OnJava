package tij.chapter12;


interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

class X {
    String f() {
        return "X::f()";
    }
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // 同等效果
    }
}
