package serveur;

import java.net.Socket;

public class Traitement extends Thread {
    private Socket s;

    public Traitement(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        new Lecture(s).start();

    }
}
