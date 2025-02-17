import java.util.Scanner;
public class IMC {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double poids ;
        double taille;
        System.out.println("Enter poids (en kg) : ");
        poids = sc.nextDouble();
        System.out.println("Enter taille (in m) : ");
        taille = sc.nextDouble();
        double imc = poids / (taille * taille) ;
        System.out.println("Pour " + poids
                + "Kg et  " + taille
                + "m, L'IMC " + imc);
    }
}
