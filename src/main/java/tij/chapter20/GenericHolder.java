package tij.chapter20;


public class GenericHolder<T> {
    private T obj;

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder();
        holder.set("item");
        String o = holder.get();
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}
