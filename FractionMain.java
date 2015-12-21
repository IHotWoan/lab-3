/**
 * Created by Felix on 12/16/2015.
 */
public class FractionMain {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(4,3);

        if (f1.isNegative()){
            System.out.print("true");
        }
          else{
            System.out.print("inte negativt!");
        }

        if (f1.equals(f2)){
            System.out.print("talen är lika!");
        }
        else{
            System.out.print("talen är inte lika.");
        }

        System.out.println(f1.toString());

        f1.subtract(f2);
        f1.add(f2);
        f1.multiply(f2);
        f1.devide(f2);

    }
}
