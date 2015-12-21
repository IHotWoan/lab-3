/**
 * Created by Felix on 12/16/2015.
 */
import java.util.Scanner;
import java.lang.StringBuilder;

public class Pnr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pn;
        System.out.print("Skriv in ett personnummer i formen (ÅÅMMDD)-(NNNN): ");
        pn = input.nextLine();
        input.close();
        if (pn.length() != 11) {
            System.err.println("felaktigt personnummer!");
            System.exit(0);
        } else {
            System.out.println(pn);
        }

        String pnr1 ="930118-1716";
        String pnr2 ="920416-1842";
        System.out.println(getFirstPart(pn));
        System.out.println(getSecondPart(pn));
    }


    private static String getFirstPart(String pn) {
        return pn.substring(0, 6);
    }

    private static String getSecondPart(String pn) {
        return pn.substring(7, 11);
    }


    private static boolean isFemaleNumber(String pn) {
        if (pn.charAt(10) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMaleNumber(String pn) {
        if (pn.charAt(10) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEqualTo(String pnr1, String pnr2){                         //compare coordinates p1/p2 etc
        return pnr1.equals(pnr2);
    }

}










