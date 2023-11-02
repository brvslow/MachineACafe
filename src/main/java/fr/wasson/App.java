package fr.wasson;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       
        System.out.println("Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :\n");
        
        // Combien de pièces de 1 centime ?
        System.out.print("Pièces de 1 cent ? ");
        Scanner scan = new Scanner(System.in);
        int nbPieces1Cent = scan.nextInt();

        // Combien de pièces de 5 centimes ?
        System.out.print("Pièces de 5 cents ? ");
        int nbPieces5Cents = scan.nextInt();

        // Combien de pièces de 10 centimes ?
        System.out.print("Pièces de 10 cents ? ");
        int nbPieces10Cents = scan.nextInt();

        // Combien de pièces de 20 centimes ?
        System.out.print("Pièces de 20 cents ? ");
        int nbPieces20Cents = scan.nextInt();

        // Combien de pièces de 50 centimes ?
        System.out.print("Pièces de 50 cents ? ");
        int nbPieces50Cents = scan.nextInt();
        scan.close();

        // Prix d'un café
        int prixCafe = 1;

        // Calcul du total de centimes
        float total = (float) (nbPieces1Cent * 0.01 + nbPieces5Cents * 0.05 + nbPieces10Cents * 0.1 + nbPieces20Cents * 0.2 + nbPieces50Cents * 0.5);

        // Affichage des messages en fonction du total de centimes
        if (total < prixCafe) {
            float ecart = prixCafe - total;
            System.out.println("Il vous manque " + ecart + " cent(s) pour prendre un café.");
        } else if (total > prixCafe) {
            float ecart = total - prixCafe;
            System.out.println("Il vous restera " + ecart + " cent(s) après avoir pris votre café !");
        } else {
            System.out.println("Vous avez exactement de quoi vous payer le café !`");
        }
    }   
}

