package tij.chapter6;

// 静态内部类的初始化时机
public class StaticInnerClassInit {

    static class InnerClass {
        static {
            System.out.println("Inner Class init");
        }

        public static final int i = 0;
        public static int k = 10;
    }

    public static void main(String[] args) {
        System.out.println(InnerClass.i); // 不会触发类加载，只会打印 0
        System.out.println(InnerClass.k); // 会触发类加载 打印 Inner Class init 和 10
    }
}
