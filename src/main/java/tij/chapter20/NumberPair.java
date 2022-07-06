package tij.chapter20;

public class NumberPair<U extends Number, V extends Number> {
    U first;
    V send;

    public NumberPair(U first, V send) {
        this.first = first;
        this.send = send;
    }

    public static void main(String[] args) {
        NumberPair<Integer, Integer> numberPair = new NumberPair(1, 2);
        System.out.println(numberPair.sum());
    }

    public double sum() {
        return first.doubleValue() + send.doubleValue();
    }
}
