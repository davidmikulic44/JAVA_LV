package lv3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CreateSequentialFile {
    private ObjectOutputStream output;
    Scanner input = new Scanner(System.in);


    public void openFile() throws IOException {
        output = new ObjectOutputStream(new FileOutputStream("students.ser"));
    }
    public void dodajZapis() throws IOException {
        Student zapis;
        int maticniBroj;
        String ime,prezime,fakultet,smjer;
        int godina;
        double prosjecna_ocjena;

        System.out.print("unesi maticni broj: ");
        maticniBroj=input.nextInt();

        System.out.print("unesi ime: ");
        ime=input.next();

        System.out.print("unesi prezime: ");
        prezime=input.next();

        System.out.print("unesi fakultet: ");
        fakultet=input.next();

        System.out.print("unesi smjer: ");
        smjer=input.next();

        System.out.print("unesi godinu: ");
        godina=input.nextInt();

        System.out.print("unesi prosjecnu ocjenu: ");
        prosjecna_ocjena=input.nextDouble();

        if(maticniBroj>0){
            zapis = new Student(maticniBroj, ime, prezime, fakultet, smjer, godina, prosjecna_ocjena);
            output.writeObject(zapis);
        }
        else{
            System.out.println("Maticni broj mora biti veci od 0");
    }


}

    public void closeFile() throws IOException {
        if (output != null)
            output.close();
    }
}

