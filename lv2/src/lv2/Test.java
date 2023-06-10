package lv2;
import lv2.Zaposlenik;
import lv2.Zarulja;

public class Test {
    public static void main(String[] args) {

        Zarulja osram = new Zarulja();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();

        System.out.println("-------------------------------------------------------");

        Zaposlenik zaposlenik = new Zaposlenik(12,40,10000.12);
        System.out.println(zaposlenik.getPlaca());
        zaposlenik.setPlaca(10100);
        System.out.println(zaposlenik.getPlaca());
        System.out.println(zaposlenik.dosadasnjaZarada());
        System.out.println(zaposlenik.dosadasnjaZarada(zaposlenik));

    }
}
