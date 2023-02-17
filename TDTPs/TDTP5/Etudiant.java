public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
    private int moyenne;

    public Etudiant(){}

    public Etudiant(String nom, String prenom, int age, int moyenne){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
        this.moyenne = moyenne;
	}

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public int getMoyenne(){
        return this.moyenne;
    }

}