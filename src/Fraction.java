package tp.dic;
public class Fraction{  
    private int num;
    private int denom;

    public Fraction(int num,int denom){
        this.denom = (denom == 0 ?  1 : denom);
        this.num = num;
    }
    public static Fraction addition(Fraction f1, Fraction f2){
        return new Fraction(f1.num * f2.denom + f1.denom *f2.num,f1.denom * f2.denom);
    }
    public static Fraction soustraction(Fraction f1, Fraction f2){
        return new Fraction(f1.num * f2.denom - f1.denom *f2.num,f1.denom * f2.denom);
    }
    public String toString(){
        return (this.num + "/" + this.denom);
    }
}