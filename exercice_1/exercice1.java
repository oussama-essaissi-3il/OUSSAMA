public class FactureManager {

    /**
     * Calcule le total d'une facture
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     * @return
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        /**
         * Appliquer la réduction selon la catégorie de produit
         */
        total -= total * getReductionCategorie(typeProduit);
        //Réduction si total > 1000
        if (total > 1000) {
            total *= 0.95; // Réduction de 5%
        }

        return total;
    }
    /**
     * Retourne le pourcentage de réduction pour une catégorie
     * @param typeProduit
     * @return
     */
    private double getReductionCategorie(String typeProduit) {
        switch (typeProduit) {
            case: "Alimentaire";
            return 0.05; // Réduction de 5%
            case:"Electronique";
            return 0.10; // Réduction de 10%
            case:"Luxe";
            return 0.15; // Réduction de 15%
            default:
            return 0.0; // Pas de réduction pour les autres catégories
        }
    }
}


