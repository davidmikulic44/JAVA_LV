/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3_1;


public class Riba implements Zivotinja{
    private String vrsta;
    Riba(){
        vrsta="riba";
    }
    
    @Override
    public void kreciSe(){
        System.out.println("plivam");
    }
}
