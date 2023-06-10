package lv3;

import java.io.Serializable;

public class Student implements Serializable {
    private int maticniBroj;
    private String ime;
    private String prezime;
    private String fakultet;
    private String smjer;
    private int godina;
    private double prosjecna_ocjena;

    public Student(){
        this(0,"","","","",0,0.0);
    }

    public Student(int maticniBroj, String ime, String prezime, String fakultet, String smjer, int godina, double prosjecna_ocjena){
        setMaticniBroj(maticniBroj);
        setIme(ime);
        setPrezime(prezime);
        setFakultet(fakultet);
        setSmjer(smjer);
        setGodina(godina);
        setProsjecna_ocjena(prosjecna_ocjena);
    }


    public int getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(int maticniBroj) {
        this.maticniBroj = maticniBroj;
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

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public double getProsjecna_ocjena() {
        return prosjecna_ocjena;
    }

    public void setProsjecna_ocjena(double prosjecna_ocjena) {
        this.prosjecna_ocjena = prosjecna_ocjena;
    }



}
