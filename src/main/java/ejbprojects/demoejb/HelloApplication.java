package ejbprojects.demoejb;

import ejbprojects.demoejb.entities.Entreprise;
import ejbprojects.demoejb.service.GestionBean;
import ejbprojects.demoejb.service.IGestion;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.core.Application;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    public HelloApplication() {
        super();
        System.out.println("HelloApplication constructor called");
    }
}