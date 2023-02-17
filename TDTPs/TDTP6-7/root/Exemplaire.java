package root;

public class Exemplaire {
    private int ISBN;
    private Etat état;
    private boolean emprunté;
    private NoticeBibliographique notice;

    public Exemplaire(){}

    public Exemplaire(int ISBN, Etat état, NoticeBibliographique notice){
        this.ISBN = ISBN;
        this.état = état;
        this.notice = notice;
        this.emprunté = false;
        notice.addExemplaire(this);
    }

    public Etat getEtat(){
        return this.état;
    }

    public NoticeBibliographique getNotice(){
        return this.notice;
    }

    public int getISBN(){
        return this.ISBN;
    }

    public boolean getEmprunté(){
        return this.emprunté;
    }

    public void Emprunt(){
        if (this.emprunté == false){
            this.emprunté = true;
        }
        else {
            throw new RuntimeException("Critique : Le livre est déjà emprunté");
        }
    }

    public void Retour(){
        if (this.emprunté == true){
            this.emprunté = false;
        }
        else {
            throw new RuntimeException("Critique : Le livre a déjà été rendu");
        }
    }
}
