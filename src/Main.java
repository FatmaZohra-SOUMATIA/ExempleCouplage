import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Paiement> paiements = new ArrayList<Paiement>();

        // paiement en liquide
        Paiement p1=new PaiementEnLiquide();
        paiements.add(p1);
        Paiement p2=new PaiementEnLiquide();
        paiements.add(p2);
        // paiements par carte
        Paiement p3=new PaiementParCarte();
        paiements.add(p3);
        Paiement p4=new PaiementParCarte();
        paiements.add(p4);

        for (Paiement paiement: paiements) {
            paiement.enregistrerPaiement();
        }
    }
}
