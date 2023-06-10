package lv2;

public class Zaposlenik {
    private int staz;
    private int starost;
    private double placa;

    public Zaposlenik(int staz, int starost, double placa){
        this.staz=staz;
        this.starost=starost;
        this.placa=placa;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public double dosadasnjaZarada(){
        return (staz*12*placa);
    }

    public static double dosadasnjaZarada(Zaposlenik zaposlenik){
        return (zaposlenik.staz*12*zaposlenik.placa);
    }


}
