package root;

public class Personne {
    private String nom;
    private String prenom;
    private int anneeNaissance;

    public Personne(){}

    public Personne(String nom, String prenom, int anneeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAnneeNaissance(){
        return this.anneeNaissance;
    }
}
