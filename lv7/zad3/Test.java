package zad3;

public class Test {
    public static void main(String[] args){
        LansirnaRampa lr = new LansirnaRampa();
        Raketa r1 = new Raketa("Raketa1", lr);
        Raketa r2 = new Raketa("Raketa2", lr);

        new Thread(r1).start();
        new Thread(r2).start();
    }
}