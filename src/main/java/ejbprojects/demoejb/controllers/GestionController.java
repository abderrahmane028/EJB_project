package ejbprojects.demoejb.controllers;

import ejbprojects.demoejb.entities.Entreprise;
import ejbprojects.demoejb.service.IGestion;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/entreprise")
public class GestionController {
    @Inject
    IGestion gestion;

    @POST
    @Path("/ajouter-entreprise")
    @Consumes("text/plain")
    public void ajouterEntreprise(String name){
        System.out.println("L'ajout avec REST, JS");
        gestion.Ajouter(new Entreprise("adresse", name));
    }
}
