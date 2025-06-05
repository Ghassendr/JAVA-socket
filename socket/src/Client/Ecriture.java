
package Client;

import java.io.PrintWriter;
  import java.net.Socket;
        import java.util.Scanner;

public class Ecriture extends Thread {
    private Socket s;

    public Ecriture(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

            while (true) {
                System.out.print("votre id: ");
                String msj = sc.nextLine();
                pw.println(msj);
            }

        } catch (Exception e) {
            System.out.println("Erreur dans Ecriture (client) : " + e.getMessage());
        }
    }
}
