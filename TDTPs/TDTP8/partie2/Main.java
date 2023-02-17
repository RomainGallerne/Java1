package partie2;

public class Main {
    public static void main(String[] args){
        Creneau RDV1 = new Creneau(9,15,75);
        Creneau RDV2 = new Creneau(10,30,60);
        Creneau RDV3 = new Creneau(11,00,156);

        System.out.println(RDV1.toString());
        System.out.println(RDV2.toString());
        System.out.println(RDV3.toString());
        System.out.println("\nLe rendez-vous n°1 chevauche-t-il le rendez-vous n°2 ?");
        System.out.println(RDV1.chevauche(RDV2));
        System.out.println("\nLe rendez-vous n°2 chevauche-t-il le rendez-vous n°3 ?");
        System.out.println(RDV2.chevauche(RDV3));

        CreneauFDS Java = new CreneauFDS(1, 2);
        CreneauFDS Logique = new CreneauFDS(5, 1);
        System.out.println("\nCours de Java -> "+Java.toString());
        System.out.println("Cours de Logique -> "+Logique.toString());
    }
}
