package serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Lecture extends Thread {
    private Socket s;

    public Lecture(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while (true) {
                String msj = br.readLine();
                if (msj != null) {
                    System.out.println("Message reçu : " + msj);
                    ClientsData.diffuserMessage(msj);


                }
            }

        } catch (Exception e) {
            System.out.println("Erreur dans Lecture (serveur) : " + e.getMessage());
        }
    }
}
