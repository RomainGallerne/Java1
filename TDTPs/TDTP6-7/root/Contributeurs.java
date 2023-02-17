package root;

import java.util.ArrayList;

public class Contributeurs {
    private ArrayList<NoticeBibliographique> ouvrages;

    public Contributeurs(){}

    public void addOuvrage(NoticeBibliographique ouvrage){
        this.ouvrages.add(ouvrage);
    }

    public NoticeBibliographique getOuvrage(int i){
        return this.ouvrages.get(i);
    }
}
