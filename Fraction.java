/**
 * Created by Felix on 12/16/2015.
 */
import java.lang.StringBuilder;
public class Fraction {

    private int numerator;                                              //fields
    private int denominator;

    public Fraction (int n , int d){                                    //constructor
        numerator = n;
        denominator = d;
        if (denominator <= 0){
            System.err.println("Error! denominator value not allowed.");
            System.exit(0);
        }

    }
    public int getN(){return numerator;}                                //get numerator value
    public int getD(){return denominator;}                              //get denominator value

    public void setN(int n){numerator = n;}                             //give new numerator value
    public void setD(int d){denominator = d;}                           //give new denominator value


    public boolean isNegative(){                                //returns true if rational number is negative
        return ((getN() / getD()) < 0);
    }       //if rational number is negative state true

    public void add(Fraction f2) {                                       // adding together two rational numbers
        if (getD() != 0 && f2.getD() != 0) {
            if (getD() == f2.getD()) {
                setN(getN() + f2.getN());
                setD(getD() + f2.getD());
            }
            else {
                setN((getN() * f2.getD()) + (f2.getN() * getD()));
                setD(getD() * f2.getD());
            }
        }
        else{
            System.err.println("Denominator value not acceptable!");
        }
        System.out.println("value after add is: " +getN()+ "/" +getD());
    }

    public void subtract(Fraction f2){                       //subtracting rational number "a" with rational number "b"
        if (getD() != 0 && f2.getD() != 0) {
            if (getD() == f2.getD()) {
                setN(getN() - f2.getN());
                setD(getD() - f2.getD());
            }
            else{
                setN((getN() * f2.getD()) - (f2.getN() * getD()));
                setD(getD() * f2.getD());
            }
        }
        else {
            System.err.println("Denominator value not acceptable!");
        }
        System.out.println("value after subtract is: " +getN()+ "/" +getD());
    }

    public void multiply (Fraction f2){                     //multiply two rational numbers
        if (getD() != 0 && f2.getD() != 0) {
            setN(getN() * f2.getN());
            setD(getD() * f2.getD());
        } else {
            System.err.println("Denominator value not acceptable!");
        }
        System.out.println("value after multiply is: " +getN()+ "/" +getD());
    }

    public void devide (Fraction f2){                       //divides two rational numbers
        if (getD() != 0 && f2.getD() != 0) {
            setN(getN() * f2.getD());
            setD(getD() * f2.getN());
        } else {
            System.err.println("Denominator value not acceptable!");
        }
        System.out.println("value after devide is: " +getN()+ "/" +getD());
    }

    public String toString(){                               // gives rational number as a string
      StringBuilder str = new StringBuilder();
        str.append(getN());
        str.append("/");
        str.append(getD());
        return str.toString();
    }

    public boolean isEqualsTo(Fraction f2){                 // checks if two rational numbers are equal
        if (getN() == f2.getN()){
            if(getD() == f2.getD()){
                return true;
            }
        }
        return false;
    }





}
