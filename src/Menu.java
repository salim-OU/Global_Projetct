import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int choix;

        // Menu d'options
        do {
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Calculer IMC");
            System.out.println("2. Obtenir l'âge");
            System.out.println("3. Préparer la fondue");
            System.out.println("4. Calculer un polynôme de degré 3");
            System.out.println("5. Swap3");
            System.out.println("6. Permutation");
            System.out.println("7. RosesBlanches");
            System.out.println("8. Quitter");

            // Lecture du choix de l'utilisateur
            choix = clavier.nextInt();

            // Exécution de l'option choisie
            switch (choix) {
                case 1:
                    IMC.main(null);
                    break;
                case 2:
                    CalculAge.main(null);
                    break;
                case 3:
                    Fondue.main(null);
                    break;
                case 4:
                    Degre3.main(null);
                    break;
                case 5:
                    Swap3.main(null);
                    break;
                case 6:
                    Permutation.main(null);
                    break;
                case 7:
                    RosesBlanches.main(null);
                    break;
                case 8:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 8); // La boucle continue jusqu'à ce que l'utilisateur choisisse de quitter

        clavier.close();
    }
}
