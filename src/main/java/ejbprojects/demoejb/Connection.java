package ejbprojects.demoejb;

import ejbprojects.demoejb.entities.Entreprise;
import ejbprojects.demoejb.service.IGestion;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

@Singleton
@Startup
public class Connection {
    @Inject
    IGestion gestion;

    @PostConstruct
    public void initConnectionJSP() {
        Thread serveurThread = new Thread(this::serveurSocket, "serveur-connection-jsp");
        serveurThread.setDaemon(true);
        serveurThread.start();
    }

    private void serveurSocket() {
        int i = 1;
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Serveur connexion EJB à démarer ...");
            while (true) {
                try (Socket conn = serverSocket.accept(); ObjectInputStream in = new ObjectInputStream(conn.getInputStream()))
                {
                     String name = (String) in.readObject();
                     System.out.println("L'ajout avec Serveur Socket");
                     gestion.Ajouter(new Entreprise( "adress", name));
                } catch (Exception e) {
                    System.out.println("Erreur lors de la connexion : " + e.getMessage());
                }
            }
        } catch (IOException e) {
                    System.out.println("Erreur lors de l'initialisation du serveur : " + e.getMessage());
        }
    }

}
