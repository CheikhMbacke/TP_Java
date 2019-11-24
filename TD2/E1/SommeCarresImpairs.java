/**
 * SommeCarresImpairs
 */
public class SommeCarresImpairs {
    /**
     * un programme qui calcule la somme des carrés des n premiers entiers impairs.
     * @param args
     */
    public static void main(String[] args) {
        if(args.length !=0){
            int sommeCarresImpairs = 0,i = 0,j = 1;
            while (j <= Integer.parseInt(args[0])) {
            System.out.println(j);
            sommeCarresImpairs += j*j;
            i++;
            j = 2*i + 1;
            }
            System.out.println("Somme Carre: "+sommeCarresImpairs);
        }else
            System.out.println("Pas d'argument renseigne");
        
    }
}