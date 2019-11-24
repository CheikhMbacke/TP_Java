/**
 * Tri
 */
public class Tri {

    public static void main(String[] args) {
        int [] tab = {9,5,7,1,2,3};
        bubble(tab);
    }
    public static void bubble(int[] t){
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
        /**
         * Affichage
         */
        for (int x : t) {
            System.out.println(x);
        }
    }
}