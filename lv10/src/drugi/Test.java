package drugi;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Ptica p = new Ptica();
        Lastavica l = new Lastavica();
        p.setIme("Fran");
        l.setIme("Tvrtko");

        l.glasajSe();
        p.glasajSe();


        List<Zivotinja> array = new ArrayList<>();

        Ptica p1 =new Ptica();
        p1.setIme("ime");
        array.add(p1);
        /*array[1]=new Lastavica();
        array[2]=new Ptica();
        array[3]=new Lastavica();
        array[4]=new Ptica();

        array[0].setIme();*/

        for(Zivotinja broj : array){
           broj.getIme();
            broj.glasajSe();
        }

    }


}
