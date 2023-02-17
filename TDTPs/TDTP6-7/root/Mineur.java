package root;

public class Mineur extends Abonné {
    
    public Mineur(int numéro){
        super(numéro);
    }

    public void emprunter(NoticeBibliographique n){
        if (n.getPublicCible()!=Public.Adulte) {
            super.emprunter(n);
        }
    }
}
