

package Client;

        import java.net.Socket;

public class MainClient {

    public static void main(String[] args) {
        System.out.println("Lancement du client...");

        try {
            Socket s = new Socket("127.0.0.1", 9000);
            System.out.println("Connecté au serveur");

            new Lecture(s).start();
            new Ecriture(s).start();

        } catch (Exception e) {
            System.out.println("Erreur Client : " + e.getMessage());
        }
    }
}
