/**
 * Calcul
 */
public class Calcul {
    /**
     * Fonction principale
     * @param args
     */
    public static void main(String[] args) {
        int[] tab = {1, 23, 12, -4, 6, 89, 2};
        /**
         * Somme
         */
        System.out.println("Somme: " + somme(tab));
        /**
         * Produit
         */
        System.out.println("Produit: " + produit(tab));
        /**
         * Moyenne
         */
        System.out.println("Moyene: " + moyenne(tab));
    }
    /**
     * Fonction qui fait la somme des entiers d'un tableau donne en parametre
     * @param tab
     * @return la somme
     */
    public static int somme(int tab[]){
        int somme = 0;
        for(int i = 0;i< tab.length;i++)
            somme += tab[i];
        return somme;
    }
    /**
     * Fonction qui fait le produit des entiers d'un tableau donne en parametre
     * @param tab
     * @return le produit
     */
    public static int produit(int tab[]){
        int produit = 1;
        for(int i = 0;i< tab.length;i++)
            produit *= tab[i];
        return produit;
    }
    /**
     * Fonction qui fait la moyenne des entiers d'un tableau donne en parametre
     * @param tab
     * @return la moyenne
     */
    public static double moyenne(int tab[]){
        return Calcul.somme(tab) / tab.length;
    }
}