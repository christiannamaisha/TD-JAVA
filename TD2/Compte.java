public class Compte{
    private int solde;
    protected int depot;

    public Compte (){
    }
    public Compte(int depot){
        setDepot(depot);
    }
    public int getSolde(){
        return solde;
    }
    public int getDepot(){
        return depot;
    }
    public void setDepot(int depot){
        this.depot=depot
    }
    public void setSolde(int solde){
        this.solde=solde
    }
    @override
    public void affiche(){
        Systeme.out.printIn("Solde :"+solde"\Depot : "+depot);
    }
}