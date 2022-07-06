package tij.chapter10;

public class Parcel {
    public static void main(String[] args) {
        Contents con = new Parcel().createContents();
        con.values();
    }

    public Contents createContents() {
        return new PContents();
    }

    private class PContents implements Contents {
        @Override
        public void values() {
            System.out.println("1231312");
        }
    }
}
