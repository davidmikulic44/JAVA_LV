package lv3;

import java.io.IOException;
import java.io.EOFException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException {
        CreateSequentialFile app = new CreateSequentialFile();
        ReadSequentialFile app2 = new ReadSequentialFile();

        app.openFile();

        for(int i=0;i<10;i++){
            app.dodajZapis();
        }

        app.closeFile();

        app2.openFile();

        app2.citajZapise();

        app2.closeFile();
    }

}
