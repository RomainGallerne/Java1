public class Main {
    public static void main(String[] args){
        Personne GeorgeD = new Personne("Dupont","George");
        Personne MaryB = new Personne("Barry","Mary");

        FileAttenteStatistiques F1 = new FileAttenteStatistiques();

        System.out.println("Entrées: "+F1.nbEntree+", Sortie: "+F1.nbSortie);

        F1.mettreEnFile(GeorgeD);
        F1.mettreEnFile(MaryB);
        System.out.println(F1.toString());
        System.out.println("Entrées: "+F1.nbEntree+", Sortie: "+F1.nbSortie);

        F1.defiler();
        System.out.println(F1.toString());
        System.out.println("Entrées: "+F1.nbEntree+", Sortie: "+F1.nbSortie);

        F1.defiler();
        System.out.println(F1.toString());
        System.out.println("Entrées: "+F1.nbEntree+", Sortie: "+F1.nbSortie);
    }
}
