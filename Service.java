public class Service implements IAffiche{
    //Attribut d'instance qui peut produire des objets
    private int id;
    private String libelle;

    //Attribut Statique
    private static int nbreServ;
    //Attribut de naviguation
    //OneToMany: un client plusieurs compte
    private Employe[] tabEmploye = new Employe[5];
    private int nbreEmploye;

    //Méthodes 
        //Construsteurs par défaut
        public Service(){
            nbreServ++;
        //nbre de personne++ pour dynamiser
            id=nbreServ;
        //Pour générer un id
        }

        //Constructeurs surchagés
        public Service(String libelle){
            nbreServ++;
            id=nbreServ;
        setLibelle(libelle);
        }

        //Getters(Récupérer l'état d'un attribut)
        public int getId(){
            return id;
        }
        public String getLibelle(){
            return libelle;
        }
        public static int getNbreServ(){
            return nbreServ;
        }
        public Employe[] getTabEmploye(){
            return tabEmploye;
        }
        //Setters(Pour modifier)
        public void setId(int id){
            this.id=id;
        }
        public void setLibelle(String libelle){
            this.libelle=libelle;
        }
        public static void setNbreServ(int nbreServ){
            Service.nbreServ=nbreServ;
        }

        /*Le setter d'une relation OneToMany
        permet d'ajouter un élément dans le Tableau*/
        public boolean setTabEmploye(Employe employe){
            tabEmploye[nbreEmploye] = employe;
            nbreEmploye++;
            //Affectation du Emplye a un Service
            return true;
        }

        /*Méthodes métiers(est une méthode qui se trouve dans la classe 
        et elle offre un servive autre que les setters, les getters, et les constructeurs)*/
        @Override
        public String affiche(){
            return "Id: "+id+"\nLibelle: "+libelle+ "\n";

        }
        public void compare(){
            
        }
}