import java.util.ArrayList;

public class Promotion {
    private String nom;
    private int année;
    private ArrayList<Etudiant> etudiants;

    public Promotion(){}

    public Promotion(String nom, int année){
        this.nom = nom;
        this.année = année;
        etudiants = new ArrayList<Etudiant>();
    }

    public String getNom(){
        return this.nom;
    }

    public int getAnnee(){
        return this.année;
    }

    public int getNbEtu(){
        return (this.etudiants).size();
    }

    public Etudiant getPrecisEtu(int i){
        return (this.etudiants).get(i);
    }

    public int addEtu(Etudiant newEtu){
        this.etudiants.add(newEtu);
        return 0;
    }

    public int moyenneGénérale(){
        int moyenne = 0;
        int i = 0;
        for (i=0;i<this.etudiants.size(); i++){
            moyenne += ((this.etudiants).get(i)).getMoyenne();
        }
        return moyenne/i;
    }

    public Etudiant recherche(String nom){
        for (int i=0;i<this.etudiants.size(); i++){
            if ( ((this.etudiants.get(i)).getNom()) == nom){
                return this.etudiants.get(i);
            }
        }
        throw new RuntimeException("Erreur : Etudiant non trouvé");
    }

    public void afficheResultat(){
        for (int i=0;i<this.etudiants.size(); i++){
            System.out.println((((this.etudiants).get(i)).getPrenom())+" : "+(String.valueOf(((this.etudiants).get(i)).getMoyenne()))+"/20");
        }
    }

    public void removeEtu(Etudiant retireEtu){
        if (this.etudiants.contains(retireEtu)){
            this.etudiants.remove(retireEtu);
        } 
        else {
            throw new RuntimeException("Erreur : cette étudiant n'appartient pas à cette promotion");
        }
    }
}
