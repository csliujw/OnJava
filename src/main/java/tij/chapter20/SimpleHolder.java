package tij.chapter20;

public class SimpleHolder {
    private Object obj;

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("item");
        String o = (String) holder.get();
    }

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }
}
