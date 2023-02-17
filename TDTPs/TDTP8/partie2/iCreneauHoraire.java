package partie2;

public interface iCreneauHoraire {
    public abstract int heure();
    public abstract int minutes();

    public default String heureDebutFormate(){
        int h = this.heure();
        int m = this.minutes();
        String heureStr,minuteStr;
        if (h<10){heureStr = "0"+Integer.toString(h);}
        else {heureStr = Integer.toString(h);}
        if (m<10){minuteStr = "0"+Integer.toString(m);}
        else {minuteStr = Integer.toString(m);}
        return heureStr+":"+minuteStr;
    }
    
    public abstract int duree();

    public default boolean chevauche(iCreneauHoraire c){
        int hDebut = this.heure()*60 + this.minutes();
        int hFin = hDebut + duree();
        int cDebut = c.heure()*60 + c.minutes();
        int cFin = cDebut + c.duree();
        return (hDebut < cFin) && (cDebut < hFin); 
    }
}