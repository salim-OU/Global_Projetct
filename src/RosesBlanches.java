import java.util.Scanner;

class RosesBlanches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrée de données
        System.out.print("Combien avez-vous reçu d'argent (Euros): ");
        int budget = scanner.nextInt();

        // Calcul du budget livres & fournitures
        int budgetLivres = budget * 3 / 4;
        int resteBudget = budget - budgetLivres;

        // Calcul du budget pour les trois autres rubriques
        int autre = resteBudget / 3;

        // Calcul du nombre de cafés (prix d'un café : 3 euros)
        int nbcafes = autre / 3;

        // Calcul du nombre de numéros du Flash (prix d'un numéro du Flash: 5 euros)
        int nbFlash = autre / 5;

        // Calcul du nombre de billets de métro (prix d'un billet de métro: 2 euros)
        int nbBillets = autre / 2;

        // Calcul de l'argent restant
        int reste = autre % 3 + autre % 5 + autre % 2 + resteBudget % 3;

        // Affichage des résultats
        System.out.println("Livres et Fournitures: " + budgetLivres + " Euros.");
        System.out.println("Vous pouvez ensuite acheter:");
        System.out.println(" " + nbcafes + " cafés à 3 Euros");
        System.out.println(" " + nbFlash + " numéros du Flash à 5 Euros");
        System.out.println(" " + nbBillets + " billets de métro à 2 Euros");
        System.out.println("et il vous restera " + reste + " Euros pour les roses blanches.");
    }
}
