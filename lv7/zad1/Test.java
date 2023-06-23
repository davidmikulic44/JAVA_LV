package zad1;

import zad1.LansirnaRampa;
import zad1.Raketa;

public class Test {
    public static void main(String[] args){
        LansirnaRampa lr = new LansirnaRampa();
        Raketa r1 = new Raketa("Raketa1", lr);
        Raketa r2 = new Raketa("Raketa2", lr);

        r1.start();
        r2.start();

    }
}
