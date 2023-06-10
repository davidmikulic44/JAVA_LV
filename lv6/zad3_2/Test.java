/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3_2;

import zad2.*;

/**
 *
 * @author student
 */
public class Test {
    public static void main(String[] args){
        Direktor d = new Direktor();
        Tajnica t = new Tajnica();
        Vozac v = new Vozac();

        d.setId("0");
        d.setIme("Zvonimir");
        d.setPrezime("Levacic");
        
        t.setId("1");
        t.setIme("Perica");
        t.setPrezime("Peric");
        v.setId("2");
        v.setIme("Petar");
        v.setPrezime("Peric");
        
        d.predstaviSe();
        System.out.println("");
        t.predstaviSe();
        System.out.println("");
        v.predstaviSe();
        System.out.println("");
        d.radi();
        t.radi();
        v.radi();
        System.out.println("");
        
        
    }
}
