package root;

import java.util.ArrayList;

public class SacPostal {
    private ArrayList<ObjetPostal> objetsPostaux;
    private double capacité = 0.5;

    public SacPostal(){
        objetsPostaux = new ArrayList<ObjetPostal>();
    }

    public SacPostal(double capacité){
        objetsPostaux = new ArrayList<ObjetPostal>();
        this.capacité = capacité;
    }

    public double getCapacité(){
        return this.capacité;
    }

    public int addObjetPostal(ObjetPostal newObjet){
        if (this.totalVolume()+newObjet.getVolume() <= this.capacité){
            this.objetsPostaux.add(newObjet);
            return 0;
        }
        else {throw new RuntimeException("Erreur : Volume trop élevé");}
    }

    public ObjetPostal getObjetPostal(int i){
        return this.objetsPostaux.get(i);
    }

    public double totalVolume(){
        double volumeTotal = 0;
        for (int i=0;i<this.objetsPostaux.size(); i++){
            volumeTotal += this.getObjetPostal(i).getVolume();
        }
        if (volumeTotal <= capacité){
            return volumeTotal;
        }
        else {throw new RuntimeException("Erreur : Volume trop élevé");}
    }
}
