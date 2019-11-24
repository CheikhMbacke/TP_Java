/**
 * TestPersonne
 */ 
public class TestPersonne {
    /**
     * Programme qui une representation de la classe personne 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Construction par defaut
         */
        Personne p = new Personne();
        System.out.println(p.toString());
        /**
         * Construction avec comme parametre nom et prenom
         */
        Personne p1 = new Personne("Thiaw","Serigne Cheikh Mbacke");
        System.out.println(p1.toString());
        /**
         * Construction avec comme parametre nom, prenom et age
         */
        Personne p2 = new Personne("Thiaw","Serigne Cheikh Mbacke",22);
        System.out.println(p2.toString());
        /**
         * Construction tous les parametres
         */
        Personne p3= new Personne("Thiaw","Serigne Cheikh Mbacke",22,Sexe.Masculin);
        System.out.println(p3.toString());
    }
}