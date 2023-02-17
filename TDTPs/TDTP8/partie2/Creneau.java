package partie2;
import java.time.LocalTime;

public class Creneau extends SuperCreneau {
    private LocalTime hDebut;
    private int duree;

    public Creneau(int hDebut, int mDebut, int duree){
        this.hDebut = LocalTime.of(hDebut, mDebut);
        this.duree = duree;
    }
    
    public int duree(){return this.duree;}
    public int heure(){return this.hDebut.getHour();}
    public int minutes(){return this.hDebut.getMinute();}

    public LocalTime heureFin(){
        int minutes = this.minutes()+this.duree();
        int heure = this.heure();
        while(minutes >= 60){
            minutes -= 60;
            heure++;
        }
        return LocalTime.of(heure,minutes);
    }
}
