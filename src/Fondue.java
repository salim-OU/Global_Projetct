import java.util.Scanner;

public class Fondue {
    // Déclare une constante BASE, initialisée à 4
    static final int BASE = 4;

    public static void main(String[] args) {
        // Quantité de base pour les ingrédients
        double fromage = 800.0;  // Quantité de fromage en grammes
        double eau = 2.0;        // Quantité d'eau en décilitres
        double ail = 2.0;        // Nombre de gousses d'ail
        double pain = 400.0;     // Quantité de pain en grammes

        // Demande le nombre de convives
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de personne(s) conviées à la fondue : ");
        int nbConvives = scanner.nextInt();

        // Adapte les quantités pour le nombre de convives
        double ratio = (double) nbConvives / BASE;
        fromage *= ratio;
        eau *= ratio;
        ail *= ratio;
        pain *= ratio;

        // Affiche la recette adaptée
        System.out.println("Pour faire une fondue bourguignonne pour " + nbConvives + " personnes, il vous faut :");
        System.out.println("- " + fromage + " gr de Vacherin bourgeois");
        System.out.println("- " + eau + " dl d'eau");
        System.out.println("- " + ail + " gousse(s) d'ail");
        System.out.println("- " + pain + " gr de pain");
        System.out.println("- du poivre à volonté");

    }
}
