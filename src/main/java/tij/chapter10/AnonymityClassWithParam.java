package tij.chapter10;

class Objects {
    public Objects(int value) {
        System.out.println(value);
    }

    public void say(String msg) {
        System.out.println(msg);
    }
}

public class AnonymityClassWithParam {

    public static void main(String[] args) {
        AnonymityClassWithParam clazz = new AnonymityClassWithParam();
        clazz.objs().say("hello");
    }

    public Objects objs() {
        return new Objects(3) {
            @Override
            public void say(String msg) {
                System.out.println("=====" + msg);
            }
        };
    }
}
