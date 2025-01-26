//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    int x = 4;
    int y = 2;

        System.out.println("Zbroj broja " + x + " i " + y + " je: " + (x + y));

        System.out.print("\t\nAnte Ravnjak\t\n\nOsijek\t\n");  // dodano prije imena da odvojimo Ime i Prezime od zbroja

        // Postavljamo vrijednost kateta a i b
        double a = 20;
        double b = 14;

        double c = Math.sqrt(a * a + b * b); // Izracunavamo duljinu hipotenuze

        c = Math.round(c * 100.0) / 100.0; //zaokruzimo na 2 decimale

        System.out.println("\t\nDuljina hipotenuze je: " + c);
        }
    }

