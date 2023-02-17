import java.util.ArrayList;

public class FileAttenteStatistiques extends FileAttente implements IFileAttenteStatistiques{
	public static int nbEntree = 0;
    public static int nbSortie = 0;

    public FileAttenteStatistiques(){
		super();
	}

    public void mettreEnFile(Personne p){
        nbEntree++;
        super.mettreEnFile(p);
	}

    public Personne defiler(){
		nbSortie++;
        return super.defiler();
	}
}
