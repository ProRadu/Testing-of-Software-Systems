import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numar1 = citesteNumar(scanner, "Introduceti primul numar:");
        int numar2 = citesteNumar(scanner, "Introduceti al doilea numar:");


        System.out.println("Cel mai mare divizor comun al celor doua numere este: " + CMMDivizorC(numar1, numar2));
        System.out.println("Cel mai mic multiplu comun al celor doua numere este: " + CMMMultipluC(numar1, numar2));
        System.out.println("Suma tuturor numerelor dintre cele doua numere este: " + sumaTuturorNumerelorDintreCele2Numere(numar1, numar2));
        System.out.println("Produsul celor doua numere este: " + produsNumere(numar1, numar2));
        System.out.println("Raportul celor doua numere este: " + impartireNumere(numar1, numar2));
    }

    private static int citesteNumar(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Numarul introdus nu este un intreg. Introduceti din nou numarul.");
                scanner.next();
            }
        }
    }

    public static int CMMDivizorC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return CMMDivizorC(b, a % b);
        }
    }

    public static int CMMMultipluC(int a, int b) {
        return a * (b / CMMDivizorC(a, b));
    }

    public static int sumaTuturorNumerelorDintreCele2Numere(int start, int end) {
        int sum = 0;
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static int produsNumere(int a, int b) {
        return a * b;
    }

    public static String impartireNumere(int numarator, int numitor) {
        if (numitor == 0) {
            return "Nu putem imparti la 0!";
        } else {
            return String.format("%d / %d = %f", numarator, numitor, (double) numarator / numitor);
        }
    }
}
