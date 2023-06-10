import java.io.*;
import java.net.Socket;

public class Korisnik {

    String host = "127.0.0.1";
    int port = 5000;

    public void korisnik(){
        try {
            Socket klijent = new Socket(host, port);
            System.out.println("Klijent: " + klijent);

            InputStream in = klijent.getInputStream();
            OutputStream out = klijent.getOutputStream();

            BufferedReader bis = new BufferedReader(new InputStreamReader(in));
            PrintWriter ps = new PrintWriter(new PrintStream(out), true);

            String[] poruke =  {"psovka1", "disi", "tu sam", "uvreda2", "Uvreda2", "PSOVKA2"};

            for (int i = 0; i < poruke.length; i++) {
                ps.println(poruke[i]);
            }

            String linija = null;

            while ((linija = bis.readLine()) != null) {
                System.out.println(linija);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}