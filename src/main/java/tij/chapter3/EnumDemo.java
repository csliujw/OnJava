package tij.chapter3;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
        OFFER[] values = OFFER.values();
        for (OFFER value : values) {
            System.out.println(value.ordinal());
            System.out.println(value.toString());
        }
    }

    enum OFFER {
        P, SP, SSP, SSSP
    }
}
