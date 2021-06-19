import java.time.LocalDate;

public class Employe implements IAffiche{
    //Attribut d'instance qui peut produire des objets
    private int id;
    private int id_service;//Pour savoir service du clien
 //get & set
    public int getId_service() {
        return this.id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }
///////////////////////////////
    private String nomComplet;
    private LocalDate dateEmbauche;
    private LocalDate dateActuel;

    //Attribut Statique
    private static int nbreEmpl;
    //Propriétés de navigation
        //ManyToOne: Plusieurs comptes associés à un client
        private Service service = new Service();
    
        public Service getService() {
            return service;
        }
    
        public void setService(Service service) {
            this.service = service;
            service.setTabEmploye(this);
        }

    //Méthodes 
        //Construsteurs par défaut
        public Employe(){
            nbreEmpl++;
        //nbre de personne++ pour dynamiser
            id=nbreEmpl;
        //Pour générer un id
        }

        //Constructeurs surchagés
        public Employe(String nomComplet, LocalDate dateEmbauche, LocalDate dateActuel){
            nbreEmpl++;
            id=nbreEmpl;
        setNomComplet(nomComplet);
        setDateEmbauche(dateEmbauche);
        setDateActuel(dateActuel);
        }
        
        //Getters(Récupérer l'état d'un attribut)
        public int getId(){
            return id;
        }
        public String getNomComplet(){
            return nomComplet;
        }
        public LocalDate getDateEmbauche(){
            return dateEmbauche;
        }
        public LocalDate getDateActuel(){
            return dateActuel;
        }
        public static int getNbreEmpl(){
            return nbreEmpl;
        }

        //Setters(Pour modifier)
        public void setId(int id){
            this.id=id;
        }
        public void setNomComplet(String nomComplet){
            this.nomComplet=nomComplet;
        }
        public void setDateEmbauche(LocalDate dateEmbauche){
            this.dateEmbauche=dateEmbauche;
        }
        public void setDateActuel(LocalDate dateActuel){
            this.dateActuel=dateActuel;
        }
        public static void setNbreEmpl(int nbreEmpl){
            Employe.nbreEmpl=nbreEmpl;
        }
        /*Méthodes métiers(est une méthode qui se trouve dans la classe 
        et elle offre un servive autre que les setters, les getters, et les constructeurs)*/
        @Override
        public String affiche(){
            return "Id: "+id+"\nNom Complet: "+nomComplet+"\nDate d'embauche : "+dateEmbauche+"\n";

        }
        public void compare(){

        }
}