package serveur;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServeur {
    public static void main(String[] args) {
        System.out.println("Lancement du serveur...");

        try (ServerSocket server = new ServerSocket(9000)) {
            int nbclient = 0;

            while (nbclient < 10) {
                Socket s = server.accept();
                System.out.println("Un client est connecté.");
                ClientsData.ListSocket.add(s);

                nbclient++;

                new Traitement(s).start();





            }

        } catch (Exception e) {
            System.out.println("Erreur Serveur : " + e.getMessage());
        }
    }
}
