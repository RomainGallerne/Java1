import java.util.ArrayList;

public class FileAttente implements IFileAttente {
	protected String nomFile;
	protected static String reglementationFile = "sans priorité";
	protected ArrayList<Personne> contenu;

	public FileAttente(){
		contenu=new ArrayList<Personne>();
	}
	public void mettreEnFile(Personne p){
		contenu.add(p);
	}
	public Personne defiler(){
		Personne p=null;
		if (!contenu.isEmpty())
		{p=contenu.get(0);
		contenu.remove(0);}
		return p;
	}

	public boolean estVide(){
		return contenu.isEmpty();
	}
	public int taille(){
		return contenu.size();
	}

	public String toString(){
		return ""+descriptionContenu();
	}
	private String descriptionContenu(){
		String resultat = "";
		for (Personne p:this.contenu)
			resultat += p + "\n";
		return resultat + " ";
	}
}