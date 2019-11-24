package tp.dic;
public class TestFraction{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(5, 3);
        System.out.println("Addition:" + Fraction.addition(f1, f2).toString());
        System.out.println("Addition:" + Fraction.soustraction(f1, f2).toString());
    }
}