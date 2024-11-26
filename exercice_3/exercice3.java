/**
 * Classe StockManager pour gérer les opérations sur le stock d'un produit.
 */
public class StockManager {

    /**
     * Gère une opération de gestion de stock (ajout ou retrait) pour un produit donné.
     * 
     * @param typeOperation 
     * @param produit       
     * @param quantite      
     * @param stock         
     * 
     * @return le nouveau stock après l'opération
     */
    public int gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch (typeOperation.toLowerCase()) {
            case "ajout":
                return ajouterStock(produit, quantite, stock);
            case "retrait":
                return retirerStock(produit, quantite, stock);
            default:
                System.out.println("Opération inconnue pour le produit : " + produit);
                return stock; 
        }
    }

    /**
     * Ajoute une quantité au stock d'un produit.
     * 
     * @param produit  
     * @param quantite 
     * @param stock    
     * 
     * @return 
     */
    private int ajouterStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    /**
     * Retire une quantité du stock d'un produit si possible.
     * 
     * @param produit  
     * @param quantite 
     * @param stock    
     * 
     * @return 
     */
    private int retirerStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit + ". Stock actuel : " + stock);
        }
        return stock;
    }
}