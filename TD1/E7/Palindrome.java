/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        int[] tab = {1,1,1,0};
        /**
         * Teste palindrome du tableau d'entier
         */
        System.out.println(isPalindTab(tab));  
        /**
         * Teste palindrome d'une chaine */ 
        String mot="cheikh" ;
        System.out.println(isPalind(mot)); 
        
    }
    /**
     * Fonction qui verifie si un tableau d'entiers est un palindrome
     * @param tab
     * @return un booleen
     */
    public static boolean isPalindTab(int[] tab){
        Boolean isP = true;
        int i = 0;
        int n = tab.length -1;
        while (isP == true && i<n) {
            if(tab[i] != tab[n])
                isP = false;
            else{
                i++;
                n--;
            }
        }
        return isP;
    }
    /**
     * Fonction qui verifie si une chaine de ccaractere donee en argument est un palindrome
     * @param mot
     * @return un booleen
     */
    public static boolean isPalind(String mot){
        Boolean isP = true;
        int i = 0;
        int n = mot.length() - 1;
        while (isP == true && i<n) {
            if(mot.charAt(i) != mot.charAt(n))
                isP = false;
            else{
                i++;
                n--;
            }
        }
        return isP;
    }
    
}