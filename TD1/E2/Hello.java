public class Hello {

    public static void main(String[] args) {

        if(args.length != 0){

            for (String nom : args) {
                System.out.println("Hello "+nom+" !"); 
            }
            
        }
            
    }
}