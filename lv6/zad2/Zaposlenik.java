/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author student
 */
public abstract class Zaposlenik {
    private String id;
    private String ime;
    private String prezime;

    public String getID() {
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
    
    public void predstaviSe(){
        System.out.println("ID: "+id);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
    }
    
    
    public void predstaviSe(Vozac v){
        System.out.println(Vozac.class.getSimpleName());
    }
    
    public void predstaviSe(Direktor d){
        System.out.println(Direktor.class.getSimpleName());
    }
    
    public void predstaviSe(Tajnica t){
        System.out.println(Tajnica.class.getSimpleName());
    }
    
    public abstract void radi();
}
