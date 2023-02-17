import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Etudiant margot = new Etudiant("Dupond","Margot",19,17);
        Etudiant eric = new Etudiant("Zanzag","Eric",30,20);
        Etudiant robert = new Etudiant("Mathieu","Robert",22,8);

        Promotion grA = new Promotion("L3grC",2022);
        Promotion grB = new Promotion("M2grA",2022);

        System.out.println("Information de Margot :");
        System.out.println(margot.getNom()+margot.getPrenom()+margot.getAge());

        grA.addEtu(margot);
        grA.addEtu(robert);
        grB.addEtu(eric);

        System.out.println("Information de la promo L3 grC");
        for(int i=0; i<grA.getNbEtu(); i++){
            System.out.println((grA.getPrecisEtu(i)).getPrenom());
        }
        System.out.println("Moyenne de la Promo : "+String.valueOf(grA.moyenneGénérale())+"/20");
        grA.afficheResultat();
        System.out.println("On cherche l'étudiant 'Dupond' dans la promo grA : "+(grA.recherche("Dupond").getNom()+grA.recherche("Dupond").getPrenom()+grA.recherche("Dupond").getAge()));

        System.out.println("Information de la promo M2 grA");
        for(int i=0; i<grB.getNbEtu(); i++){
            System.out.println((grB.getPrecisEtu(i)).getPrenom());
        }
        System.out.println("Moyenne de la Promo : "+String.valueOf(grB.moyenneGénérale())+"/20");
        grB.afficheResultat();
    }
}
