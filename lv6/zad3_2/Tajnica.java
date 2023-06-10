/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3_2;

import zad2.*;

public class Tajnica implements Zaposlenik{
    private String id,ime,prezime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    @Override
    public void predstaviSe(){
        System.out.println("ID: "+id);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
    }
    
    @Override
    public void radi(){
        System.out.println("Dogovaram");
    }
}
