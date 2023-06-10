package drugi;

public class Ptica implements Zivotinja{
    private String ime;

    @Override
    public String getIme() {
        return ime;
    }

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void glasajSe(){
        System.out.println("Ptica "+getIme()+" se glasa");
    }
}
