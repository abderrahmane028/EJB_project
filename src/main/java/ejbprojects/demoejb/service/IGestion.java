package ejbprojects.demoejb.service;

import ejbprojects.demoejb.entities.Entreprise;
import jakarta.ejb.Remote;

public interface IGestion {
    void Ajouter(Entreprise e);
}
