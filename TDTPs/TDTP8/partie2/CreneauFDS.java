package partie2;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class CreneauFDS extends SuperCreneau {
    private int numHoraireDebut;
    private int nbSeances;
    private static final int dureeSeance=90;
    private static final HashMap<Integer, List<Integer>> mappingNumCreneauVersHoraire;

    static {
        mappingNumCreneauVersHoraire =new HashMap<>();
        mappingNumCreneauVersHoraire.put(1, Arrays.asList(8,0));
        mappingNumCreneauVersHoraire.put(2, Arrays.asList(9,45));
        mappingNumCreneauVersHoraire.put(3, Arrays.asList(11,30));
        mappingNumCreneauVersHoraire.put(4, Arrays.asList(13,15));
        mappingNumCreneauVersHoraire.put(5, Arrays.asList(15,0));
        mappingNumCreneauVersHoraire.put(6, Arrays.asList(16,45));
        mappingNumCreneauVersHoraire.put(7, Arrays.asList(18,30));
    }
    
    public CreneauFDS(int numHoraireDebut, int nbSeances){
        this.numHoraireDebut = numHoraireDebut;
        this.nbSeances = nbSeances;
    }

    public int heure(){
        return mappingNumCreneauVersHoraire.get(numHoraireDebut).get(0);
    } 

    public int minutes(){
        return mappingNumCreneauVersHoraire.get(numHoraireDebut).get(1);
    } 

    public int duree(){
        int pauses=(nbSeances==1)?0:(nbSeances-1)*15;
        return nbSeances*dureeSeance+pauses;
    }
}
