public class PaiementEnLiquide implements Paiement{
    @Override
    public void enregistrerPaiement() {
        System.out.println("Paiement effectuer en liquide");
    }
}
