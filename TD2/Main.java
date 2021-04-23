class Main{
    public static void main(String[] args) {
        Compte c=new Compte();
        c.setSolde(1000000);
        c.affiche();
        Compteclt t=new Compteclt();
        t.setFrais(100);
        t.affiche();
        Epargne e=new Epargne();
        e.setTaux(0.25);
        e.affiche();
    }
}