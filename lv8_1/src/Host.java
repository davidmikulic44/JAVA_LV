import java.io.*;
import java.net.*;

public class Host {
    private ServerSocket server;

    public Host() throws IOException {
        try {
            server = new ServerSocket();
            server.bind(new InetSocketAddress("127.0.0.1", 5000));
            System.out.println("Posluzitelj: " + server.toString());
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    private Socket client;
    BufferedReader input;
    PrintWriter output;
    String poruka;

    public void kreirajKonekciju() {
        try {
            client = server.accept();
            System.out.println("Server, imamo klijenta: " + client.getInetAddress());

            input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);

            String[] psovke = { "psovka1", "psovka2", "psovka3", "uvreda1", "uvreda2", "uvreda3" };

            boolean isPsovka = false;

            while((poruka = input.readLine()) != null) {

                for (String psovka : psovke) {

                    if (poruka.trim().equalsIgnoreCase(psovka.toString())) {
                        isPsovka = true;
                    }
                }

                if (isPsovka) {
                    System.out.println("*".repeat(poruka.length()));
                } else {
                    System.out.println(poruka);
                }

                isPsovka = false;
            }


        } catch(IOException e) {
            System.out.println(e);
        }
    }

}