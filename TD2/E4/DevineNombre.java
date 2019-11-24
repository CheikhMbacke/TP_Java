/**
 * DevineNombre
 */
import java.util.Scanner;
import java.util.Random;
public class DevineNombre {
    /**
     *  un programme qui devine un nombre entre 1 et 100 choisi par l’utilisateur et donne au hasard 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int nombreHasard = ran.nextInt(100) + 1, input = 0,n = 0 ;
        do {
            System.out.println("Deviner le nombre entre 0 et 100");
            n = sc.nextInt();
            if(n < 0 || n > 100) continue ;
            System.out.print("Est-ce "+ n +" ?: ");
            if(n > nombreHasard)
                System.out.println("moins");
            if(n < nombreHasard)
                System.out.println("plus");
            if(n == nombreHasard)
                System.out.println("oui");
        } while ( n != nombreHasard);
    }

}