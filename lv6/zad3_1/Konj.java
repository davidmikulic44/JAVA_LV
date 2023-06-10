/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3_1;



public class Konj implements Zivotinja, Radni{
    private String vrsta;
    Konj(){
        vrsta="konj";
    }
    
    @Override
    public void kreciSe(){
        System.out.println("trcim");
    }
    
    @Override
    public void radi(){
        System.out.println("radim");
    }
}
