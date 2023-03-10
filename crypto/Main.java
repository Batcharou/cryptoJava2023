package crypto;

import javax.crypto.SecretKey;

public class Main {

    public static void main(String[] args) {

        // Créer une instance de la classe IcryptoImpl
        IcryptoImpl crypto = new IcryptoImpl();

        // Générer une clé secrète pour l'algorithme AES et l'enregistrer dans le fichier "secret.key"
        SecretKey key = crypto.genKey("AES", "secret.key");

        // Vérifier si la clé a été générée avec succès
        if (key != null) {
            System.out.println("Clé générée avec succès!");
        } else {
            System.out.println("Erreur lors de la génération de la clé.");
        }
    }

}