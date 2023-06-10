package cetvrti;

public class TestAutomobila {
    private String naziv;
    private double potrosioGoriva;
    private int prijedjenPut;

    TestAutomobila(String naziv, double potrosioGoriva, int prijedjenPut){
        this.naziv = naziv;
        this.potrosioGoriva = potrosioGoriva;
        this.prijedjenPut = prijedjenPut;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPotrosioGoriva() {
        return potrosioGoriva;
    }

    public void setPotrosioGoriva(double potrosioGoriva) {
        this.potrosioGoriva = potrosioGoriva;
    }

    public int getPrijedjenPut() {
        return prijedjenPut;
    }

    public void setPrijedjenPut(int prijedjenPut) {
        this.prijedjenPut = prijedjenPut;
    }
}
