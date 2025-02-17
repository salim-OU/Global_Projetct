import java.util.Scanner;
import java.time.LocalDate;

public class CalculAge  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande la date de naissance de l'utilisateur
        System.out.print("Entrez votre année de naissance : ");
        int anneeDeNaissance = scanner.nextInt();

        // Année courante
        final int ANNEE_COURANTE = LocalDate.now().getYear();

        // Calculer l'âge
        int age = ANNEE_COURANTE - anneeDeNaissance;

        // Affichage de l'âge et de l'année de naissance
        System.out.println("Âge : " + age);
        System.out.println("Année de naissance : " + anneeDeNaissance);
        System.out.println("Année courante : " + ANNEE_COURANTE);
    }
}
