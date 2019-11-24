import java.util.Random;

/**
 * Main
 */
public class Main {
    /**
     * Fonction principale
     * @param args
     */
    public static void main(String[] args) {
        int t[] = new int [5];
        int t2[] = new int[5];
        int t1[] = {4,5,6,5};
        int t3[]= {4,5,6,5,0,0,0};
        /**
         * Methode Saisir
         */
        saisir(t);
        /**
         * Afficher les elements du tableau t
         */
        affiche(t);
        /**
         * La somme du tableau
         */
        System.out.println("Somme: "+somme(t));
        /**
         * Le maximum du tableau
         */
        System.out.println("Maximum: "+maximum(t));
        /**
         * Le delta du tableau
         */
        System.out.println("Delta: "+maximum(t));
        /**
         * Tri du tableau
         */
        bubble(t);
        System.out.println("Apres tri: ");
        affiche(t);
        /**
         * Egalite entre deux tableau
         */
        saisir(t2);
        affiche(t2);
        System.out.println("Egalite entre t et t1:"+ egalite(t2, t));
        /**
         * Equivalence entre deux tableau
         */
        affiche(t1);
        affiche(t3);
        System.out.println(equivalence(t1, t3));
    }
    /**
     * Affiche les elements d'un tableau
     * @param t
     */
    static void affiche(int[] t){
        for(int x:t)
            System.out.print(x+" ");
        System.out.println();
    }
    /**
     * Cette fonction permet de remplir les éléments d’un tableau t.
     * @param t
     */
    static void saisir(int[] t){
        Random ran = new Random();
        for(int i = 0; i< t.length;i++)
            t[i] = ran.nextInt(10) + 1;
    }
    /**
     * Cette fonction renvoie la sommer les éléments du tableau t
     * @param t
     * @return la somme des entiers
     */
    static int somme(int[] t){
        int somme = 0;
        for (int x : t) 
            somme += x;
        return somme;
    }
    /**
     * Cette fonction renvoie le maximum des éléments du tableau t
     * @param t
     * @return
     */
    static int maximum(int[] t){
        int max = 0;
        for(int x :t)
            max = x > max ? x : max;
        return max; 
    }
    /**
     * Cette fonction renvoie le minimum des éléments du tableau t
     * @param t
     * @return
     */
    static int minimum(int[] t){
        int min = t[0];
        for(int x :t)
            min = x < min ? x : min;
        return min; 
    }
    /**
     * Cette fonction renvoie la différence entre le maximum et le minimum des éléments du tableau t
     * @param t
     * @return un entier
     */
    static int delta(int[] t){
        return (maximum(t) - minimum(t)) ;
    }
    /**
     * Cette fonction fait le tri des éléments du tableau t.
     * @param t
     */
    static void bubble(int[] t){
        int l = t.length - 1;
        for(int i = 0; i< l; i++ ){
            for(int j = 1; j<l-i;j++){
                if (t[j] < t[j+1]) {
                    t[j] = t[j] + t[j+1];
                    t[j+1] = t[j] - t[j+1];
                    t[j] = t[j] - t[j+1];
                }
            }
        }
    }
    /**
     * Cette fonction renvoie vrai si les deux tableaux contiennent exactement les mêmes éléments aux mêmes indices.
     * @param t1
     * @param t2
     * @return n booleen
     */
    static boolean egalite(int[] t1, int[] t2){
        Boolean isEqual = true;
        if(t1.length != t2.length)
            return !isEqual;
        else{
            int i = 0;
            while(i<t1.length && isEqual){
                if(t1[i] != t2[i])
                    isEqual =  false;
                i++;
            }
        }
        return isEqual;
    }
    static boolean equivalence(int[] t1, int[] t2){
        boolean isEqual = true;
        int taille = t1.length < t2.length ? t1.length : t2.length ;
        int i = 0;
            while(i<taille && isEqual){
                if(t1[i] != t2[i])
                    isEqual =  false;
                i++;
            }
        return isEqual;
    }

}