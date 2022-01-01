import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("drücke + für addieren");
        System.out.println("drücke - für subtrahieren");
        System.out.println("drücke * für multiplizieren");
        System.out.println("drücke / für dividieren");
        Scanner scoperator = new Scanner(System.in);
        char operator = scoperator.next().trim().charAt(0);
        Scanner sczahl = new Scanner(System.in).useLocale(Locale.US);
        double zahl1;
        double zahl2;
        double ergebnis;

        if (operator == '+'){
            zahl1 = sczahl.nextDouble();
            zahl2 = sczahl.nextDouble();
            ergebnis = zahl1 + zahl2;
            if ( (ergebnis - (int)ergebnis) == 0){
                System.out.println("Das Ergebnis ist" + " " + (int)ergebnis);
            }
            else {
                System.out.println("Das Ergebnis ist" + " " +ergebnis);
            }
        }
        else if (operator == '-'){
            zahl1 = sczahl.nextDouble();
            zahl2 = sczahl.nextDouble();
            ergebnis = zahl1 - zahl2;
            if ( (ergebnis - (int)ergebnis) == 0){
                System.out.println("Das Ergebnis ist" + " " + (int)ergebnis);
            }
            else {
                System.out.println("Das Ergebnis ist" + " " + Math.round(ergebnis * 100) / 100.0);
            }
        }
        else if (operator == '*'){
            zahl1 = sczahl.nextDouble();
            zahl2 = sczahl.nextDouble();
            ergebnis = zahl1 * zahl2;
            if ( (ergebnis - (int)ergebnis) == 0){
                System.out.println("Das Ergebnis ist" + " " + (int)ergebnis);
            }
            else {
                System.out.println("Das Ergebnis ist" + " ca. " + Math.round(ergebnis * 1000) / 1000.0);
            }
        }
        else if (operator == '/'){
            zahl1 = sczahl.nextDouble();
            zahl2 = sczahl.nextDouble();
            ergebnis = zahl1 / zahl2;
            if ( (ergebnis - (int)ergebnis) == 0){
                System.out.println("Das Ergebnis ist" + " " + (int)ergebnis);
            }
            else {
                System.out.println("Das Ergebnis ist" + " ca. " + Math.round(ergebnis * 1000) / 1000.0);
            }
        }
    }
}
