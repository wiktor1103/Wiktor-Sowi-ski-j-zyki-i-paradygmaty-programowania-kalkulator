import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Czesć, ten program umożliwia dodawanie, odejmowanie, mnożenie i dzielenie. Wpisz pierwszą liczbę, wybierz rodzaj działania, a następnie drugą liczbę");

            System.out.println("Pierwsza liczba:");
            double x = Double.parseDouble(scanner.nextLine());

            System.out.println("Wybierz rodzaj działania (+, -, *, /):");
            String choice = scanner.nextLine();

            // Sprawdzenie czy użytkownik wybrał poprawny rodzaj działania
            if (!choice.equals("+") && !choice.equals("-") && !choice.equals("*") && !choice.equals("/")) {
                throw new IllegalArgumentException("Błąd: Niepoprawne działanie. Proszę wybrać jeden ze znaków: +, -, *, /.");
            }

            System.out.println("Druga liczba:");
            double y = Double.parseDouble(scanner.nextLine());

            switch (choice) {
                case "+":
                    System.out.println("Wynik: " + (x + y));
                    break;
                case "-":
                    System.out.println("Wynik: " + (x - y));
                    break;
                case "*":
                    System.out.println("Wynik: " + (x * y));
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Błąd: dzielenie przez 0 nie jest możliwe");
                    } else {
                        System.out.println("Wynik: " + (x / y));
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Wprowadzono złą wartość. Proszę wpisywać liczby.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Wcisnij Enter, aby zakończyć.");
            scanner.nextLine();
        }
    }
}

