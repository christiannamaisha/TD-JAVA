public class Compteclt extends Compte{
    private int frais;
    protected int retrait;
    protected int virement;

    public Compteclt(int solde){
        super(solde);
    }
    public Compteclt(int solde, int frais){
        super(solde);
        this.frais=frais
    }
    public Compteclt(int solde, int retrait){
        super(solde);
        this.retrait=retrait
    }
    public Compteclt(int solde, int virement){
        super(solde);
        this.virement=virement
    }
    public int getFrais(){
        return frais
    }
    public int getRetrait(){
        return retrait
    }
    public int getVirement(){
        return virement
    }
    public void setFrais(int frais){
        this.frais=frais
    }
    public void setRetrait(int retrait){
        this.retrait=retrait
    }
    public void setVirement(int virement){
        this.virement=virement
    }
}