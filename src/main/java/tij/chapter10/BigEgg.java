package tij.chapter10;

class Egg {
    private Yolk y;

    Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
}

public class BigEgg extends Egg {
    public static void main(String[] args) {
        new BigEgg();
    }

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }
}
/* Output:
New Egg()
Egg.Yolk()
*/
