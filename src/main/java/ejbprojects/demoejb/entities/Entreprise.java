package ejbprojects.demoejb.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Entreprise_G2_HPC")
public class Entreprise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int code;
    @Column(name="nom_hpc")
    String nom;
    String adresse;

    public Entreprise() {}
    public Entreprise( String b, String c)
    {nom=b; adresse=c;}

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return "Entreprise [code=" + code + ", nom=" + nom + ", adresse=" + adresse + "]";
    }


}