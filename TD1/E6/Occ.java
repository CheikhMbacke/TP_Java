/**
 * Occ
 */
public class Occ {
    /**
     * Programme qui permet de trouver s'il existe une occurence du premier argument 
     * @param args
     */
    public static void main(String[] args) {
    
        if(args.length != 0 && args.length != 1 ){
            Boolean isFound = false;
            int i = 1;
            while (isFound == false && i < args.length ) {
                if(args[0].equals(args[i]))
                    isFound = true;
                i++;    
            }
            if(isFound)
                System.out.println("Trouve");
            else
                System.out.println("Non trouve");
            
        }else
            System.out.println("Veuiller renseigner des arguments");
    

    }
}