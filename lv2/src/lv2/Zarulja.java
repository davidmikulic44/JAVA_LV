package lv2;

public class Zarulja {
    private boolean stanje;
    public Zarulja(){
        this.stanje =false;
    }

    public void pritisniPrekidac(){
        this.stanje = !this.stanje;
    }

    public void provjeri() {
        if (this.stanje == false)
            System.out.println("Mrak");
        else
            System.out.println("Svijetli");
    }
}
