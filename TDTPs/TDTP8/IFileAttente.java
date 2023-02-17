public interface IFileAttente{
    public abstract void mettreEnFile(Personne p);
    public abstract Personne defiler();
    public abstract boolean estVide();
    public abstract int taille();
    public abstract String toString();
    public default void vider(){
        while (!estVide()){
            this.defiler();
        }
    }
}