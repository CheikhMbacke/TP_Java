/**
 * TestComplexe
 */
public class TestComplexe {

    public static void main(String[] args) {
        Complexe c = new Complexe(2, 3);
        /**
         * La methode toString()
         */
        System.out.println(c.toString()); 
        /**
         * Somme de deux complexes
         */
        System.out.println(c.ajouter(new Complexe(5,2)).toString()); 
        /**
         * Difference de deux complexex
         */
        System.out.println(c.soustraire(new Complexe(5,2)).toString()); 
    }
}