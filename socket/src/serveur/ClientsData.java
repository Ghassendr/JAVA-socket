package serveur;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientsData {
    public static ArrayList<Socket> ListSocket = new ArrayList<>();

    public static void diffuserMessage(String msj) {
        for (int i = 0; i < ListSocket.size(); i++) {
            try {
                Socket s = ListSocket.get(i);
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                pw.println(msj);
            } catch (Exception e) {
                System.out.println("Erreur lors de l'envoi au client " + i + " : " + e.getMessage());
            }
        }
    }
}
