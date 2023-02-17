package partie2;

public abstract class SuperCreneau implements iCreneauHoraire{
    public SuperCreneau(){};

    public String toString(){
        int dureeM = this.duree();
        int dureeH = 0;
        while(dureeM>=60){
            dureeM-=60;
            dureeH++;
        } 
        String minuteStr, heureStr;
        if (dureeH<10) {heureStr = "0"+Integer.toString(dureeH);}
        else {heureStr = Integer.toString(dureeH);}
        if (dureeM<10) {minuteStr = "0"+Integer.toString(dureeM);}
        else {minuteStr = Integer.toString(dureeM);}
        return "Heure de début : "+this.heureDebutFormate()+"\nDurée : "+heureStr+":"+minuteStr;
    }
}
