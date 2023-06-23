package zad3;

public class Raketa implements Runnable{
    private String ime;
    private LansirnaRampa lr;

    Raketa(String ime, LansirnaRampa lr){
        this.ime=ime;
        this.lr=lr;
    }

    public void run(){
        synchronized (lr){
            System.out.println("Ime rakete: "+ime);
            System.out.println("Krece lansiranje!");
            lr.lansiraj();
            System.out.println("'"+ime+"' polijece.");
        }
    }
}
