package zad1;

import zad1.LansirnaRampa;

public class Raketa extends Thread{
    private String ime;
    private LansirnaRampa lr;

    Raketa(String ime, LansirnaRampa lr){
        this.ime=ime;
        this.lr=lr;
    }

    public void run(){
        System.out.println("Ime rakete: "+ime);
        System.out.println("Krece lansiranje!");
        lr.lansiraj();
        System.out.println("'"+ime+"' polijece.");
    }
}
