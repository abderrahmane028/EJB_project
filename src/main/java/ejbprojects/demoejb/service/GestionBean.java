package ejbprojects.demoejb.service;

import ejbprojects.demoejb.entities.Entreprise;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionBean implements IGestion {

    @PersistenceContext
    EntityManager em;

    public void Ajouter(Entreprise e) {
        System.out.println("à l'insertion ...");
        em.persist(e);
    }


    public Entreprise Rechercher(int code) {
        return em.find(Entreprise.class, code);
    }
}