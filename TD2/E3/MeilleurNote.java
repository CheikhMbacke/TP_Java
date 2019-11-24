/**
 * MeilleurNote
 */
import java.util.Scanner;
public class MeilleurNote {
    /**
     * Un programme qui renvoie la meilleur note sur un ensemble de notes donnees
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, note[],noteMax = 0;
        do {
            System.out.println("Entrer le nombre de note");
            n = sc.nextInt();
        } while (n < 0);
        note = new int[n];
        for(int i=0;i<n;i++){
            do {
                System.out.println("Entrer une note comprise entre 0 et 20");
                note[i] = sc.nextInt();
                noteMax = note[i] > noteMax ? note[i] : noteMax;
            } while (note[i] < 0 || note[i] > 20);         
        }
        System.out.println("La meilleure note est: "+ noteMax);

    }
}