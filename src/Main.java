import java.util.Scanner;

public class Main {

    static void welcomeAndChoose () {
        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Wybierz rodzaj działania poprzez wybranie numeru operacji:");
        String [] typeOfFigure = {"dodawanie", "odejmowanie", "mnożenie", "dzielenie"};
        for (int i = 1; i <= typeOfFigure.length; i++) {
            System.out.println(i + " - " +  typeOfFigure[i-1]);
        }
        }

        static void input () {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Podaj pierwszą liczbę");
            double a = sc.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double b = sc.nextDouble();

            System.out.println("Wynik operacji: " + (a + b));

        } else if (n == 2) {
            System.out.println("Podaj pierwszą liczbę");
            double c = sc.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double d = sc.nextDouble();

            System.out.println("Wynik operacji: " + (c - d));

        } else if (n == 3) {
            System.out.println("Podaj pierwszą liczbę");
            double e = sc.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double f = sc.nextDouble();

            System.out.println("Wynik operacji: " + (e * f));
        }  else if (n == 4) {
            System.out.println("Podaj pierwszą liczbę");
            double g = sc.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double h = sc.nextDouble();

            System.out.println("Wynik operacji: " + (g / h));
        }
        }

    public static void main(String[] args) {
        welcomeAndChoose();
input();
    }
}