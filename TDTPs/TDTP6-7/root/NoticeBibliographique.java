package root;
import java.util.ArrayList;

public class NoticeBibliographique {
    private int ISBN;
    private String titre;
    private String sousTitre;
    private Public publicCible;
    private ArrayList<Exemplaire> exemplaires;

    public NoticeBibliographique(){}

    public NoticeBibliographique(int ISBN, String titre, Public publicCible){
        this.ISBN = ISBN;
        this.titre = titre;
        this.publicCible = publicCible;
        this.sousTitre = "";
    }

    public NoticeBibliographique(int ISBN, String titre, String sousTitre, Public publicCible){
        this.ISBN = ISBN;
        this.titre = titre;
        this.publicCible = publicCible;
        this.sousTitre = sousTitre;
    }

    public int getISBN(){
        return this.ISBN;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getSousTitre(){
        return this.sousTitre;
    }

    public Public getPublicCible(){
        return this.publicCible;
    }

    public void addExemplaire(Exemplaire livre){
        exemplaires.add(livre);
    }

    public void removeExemplaire(Exemplaire livre){
        exemplaires.remove(livre);
    }

    public Exemplaire getExemplaire(){
        for (int i=0;i<=exemplaires.size();i++){
            if (!(exemplaires.get(i).getEmprunté())){
                return exemplaires.get(i);
            }
        }
        throw new RuntimeException("Critique : Le livre n'est pas disponible");
    }

    public boolean EstDisponible(){
        for (int i=0;i<=exemplaires.size();i++){
            if (!(exemplaires.get(i).getEmprunté())){
                return true;
            }
        }
        return false;
    }
}
