/**
 * Calcul
 */
public class Calcul {
    /**
     * Programme Calcul qui effectue des opérations arithmétiques simples (+,-,x,/) sur deux entiers
     * @param args
     */
    public static void main(String[] args) {
        if(args.length == 3){
            switch (args[1]) {
                case "+":
                    System.out.println(args[0]+"+"+args[2]+" = "+(Integer.parseInt(args[0])+Integer.parseInt(args[2])));
                    break;
                case "-":
                    System.out.println(args[0]+"-"+args[2]+" = "+(Integer.parseInt(args[0])-Integer.parseInt(args[2])));
                break;
                case "x":
                    System.out.println(args[0]+"x"+args[2]+" = "+(Integer.parseInt(args[0])*Integer.parseInt(args[2])));
                break;
                case "/":
                    if(Integer.parseInt(args[2]) != 0)
                        System.out.println(args[0]+"/"+args[2]+" = "+(Integer.parseInt(args[0])/(double)Integer.parseInt(args[2])));
                    else
                        System.out.println("Division par 0 impossible");
                break;
                default:
                    System.out.println("Operation non prise en compte");
                    break;
            }
        }else
            System.out.println("Veuiller renseigner les arguments comme suit: op1 operation op2");
    }
}