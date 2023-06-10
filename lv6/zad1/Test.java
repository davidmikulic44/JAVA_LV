/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Zivotinja z = new Zivotinja();
        Konj k = new Konj();
        Ptica p = new Ptica();
        Riba r = new Riba();
        
        z.kreciSe();
        k.kreciSe();
        p.kreciSe();
        r.kreciSe();
        
        
        List<Zivotinja> niz =new ArrayList<>();
                
        niz.add(z);
        niz.add(p);
        niz.add(k);
        niz.add(r);
        
        for(int i=0;i<4;i++){
            niz.get(i).kreciSe();
        }
        
        
        
    }
}
