public class Epargne extends Compte{
    private int taux;

    public Epargne(int solde){
        super(solde);
    }
    public Compteclt(int solde, int taux){
        super(solde);
        this.taux=taux
    }
    public int getTaux(){
        return taux
    }
    public void setTaux(int taux){
        super(solde);
        this.taux=taux
    }
}