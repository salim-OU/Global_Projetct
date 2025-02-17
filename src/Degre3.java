import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des valeurs de a, b, c et x
        System.out.print("Entrez a (int) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez b (int) : ");
        int b = scanner.nextInt();

        System.out.print("Entrez c (int) : ");
        int c = scanner.nextInt();

        System.out.print("Entrez x (double) : ");
        double x = scanner.nextDouble();

        // Calcul des termes intermédiaires
        double ab = a + b;
        double terme1 = ((a + b) / 2.0) * x * x * x; // (a+b)/2 * x^3
        double terme2 = ab * ab * x * x;             // (a+b)^2 * x^2
        double terme3 = a + b + c;                   // a + b + c

        // Calcul du résultat final du polynôme
        double resultat = terme1 + terme2 + terme3;

        // Affichage du résultat
        System.out.println("La valeur du polynôme est : " + resultat);

    }
}
