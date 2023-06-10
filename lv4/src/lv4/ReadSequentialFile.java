package lv3;

import java.io.*;

public class ReadSequentialFile {
    private ObjectInputStream input;


    public void openFile() throws IOException {
        input = new ObjectInputStream(new FileInputStream("students.ser"));
    }
    public void closeFile() throws IOException {
        if(input!=null)
            input.close();
        System.exit(0);
    }
    public void citajZapise() throws IOException, ClassNotFoundException, EOFException {
        Student zapis;

        while(true){
            try {
                zapis = (Student) input.readObject();
            }
            catch (EOFException e){
                e.printStackTrace();
                break;
            }

            System.out.printf("%-5d%-10s%-10s%-10s%-15s%2d%7.2f\n",zapis.getMaticniBroj(),
                    zapis.getIme(),zapis.getPrezime(),zapis.getFakultet(),
                    zapis.getSmjer(),zapis.getGodina(),(float)zapis.getProsjecna_ocjena());

        }
    }



}
