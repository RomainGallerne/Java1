package root;

import java.util.ArrayList;

public class Abonné extends Personne{
    private int numéro;
    private static int nbAbonnés = 0;
    private ArrayList<Exemplaire> emprunté;;

    public Abonné(){}

    public Abonné(int numéro){
        nbAbonnés++;
        this.numéro = nbAbonnés;
    }

    public int getNum(){
        return this.numéro;
    }

    public int getNb(){
        return nbAbonnés;
    }

    public void rendre(int indice, int ISBN, Etat état){
        emprunté.get(indice).Retour();
    }

    public void emprunter(NoticeBibliographique n){
        if (n.EstDisponible()) {
            Exemplaire nvEmprunt = n.getExemplaire();
            nvEmprunt.Emprunt();
            emprunté.add(nvEmprunt);
        }
        else {System.out.println("Avertissement : Le livre n'est pas disponible");}
    }
}
