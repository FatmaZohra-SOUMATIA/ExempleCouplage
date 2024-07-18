import java.util.ArrayList;
import java.util.List;

public class Contexte {

    public void run(){

        List<Paiement> paiements = new ArrayList<Paiement>();

        // paiement en liquide
        Paiement p1=new PaiementEnLiquide();
        paiements.add(p1);

        // paiements par carte
        Paiement p3=new PaiementParCarte();
        paiements.add(p3);


        for (Paiement paiement: paiements) {
            paiement.enregistrerPaiement();
        }
    }
}
