import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        int choix;
        UseCase us=new UseCase();
        do{
            choix=menu();
            switch (choix){
                case 1:
                    System.out.print("Entrez le libelle: ");
                    String libelle=scanner.nextLine();
                    Service sr=new Service();
                    sr.setLibelle(libelle);
                    us.ajouterService(sr);
                    break;
                case 2:
                    us.listerService();
                    break;
                case 3:
                    System.out.print("Entrez le nom Complet: ");
                    String nomComplet=scanner.nextLine();
                    System.out.print("Entrer la date d'embauche (aaaa-mm-jj): ");
                    String dateEmbauche=scanner.nextLine();
                    Employe em=new Employe();
                    em.setNomComplet(nomComplet);
                    em.setDateEmbauche(LocalDate.parse(dateEmbauche, DateTimeFormatter.ISO_DATE));
                    
                    us.ajouterEmploye(em);//ajouter a liste employer dans useCase
                    
                    break;
                case 4:
                    System.out.println("Liste des services");
                    us.listerService();
                    System.out.print("Entrer l'id du service: ");
                    String idService = scanner.nextLine();
                    System.out.print("Serait-ce un nouveau employe (o/n) : ");
                    String rep = scanner.nextLine();
                    if (rep.equals("o")){
                        System.out.print("Entrez le nom Complet: ");
                        nomComplet=scanner.nextLine();
                        System.out.print("Entrer la date d'embauche (aaaa-mm-jj): ");
                        dateEmbauche=scanner.nextLine();
                        Employe em1=new Employe();
                        em1.setNomComplet(nomComplet);
                        em1.setDateEmbauche(LocalDate.parse(dateEmbauche, DateTimeFormatter.ISO_DATE));
                        us.ajouterEmploye(em1);
                        Service ser=us.rechercheServiceById(Integer.parseInt(idService));
                       // if (ser.setTabEmploye(em1)){
                            em1.setId_service(Integer.parseInt(idService));//affecter le id du service a l'employer
                            System.out.println("L\'employe "+ em1.getNomComplet()+ " a ete ajoute au service "+ser.getLibelle() );
                       // };
                    }else{
                        us.listerEmploye();
                        System.out.print("Entrer l'id de l'employe: ");
                        String idEmploye = scanner.nextLine();
                        Employe em2=us.rechercheEmployeById(Integer.parseInt(idEmploye));
                        Service ser1=us.rechercheServiceById(Integer.parseInt(idService));
                        //if (true/*ser1.setTabEmploye(em2*/)){
                            //us.ajouterService(ser1);
    
                            em2.setId_service(Integer.parseInt(idService));//affecter le id du service a l'employer
                            System.out.println("L\'employe "+ em2.getNomComplet()+ " a ete ajoute au service "+ser1.getLibelle() );
                       // };
                    }

                    break;
                case 5:
                    System.out.println("Liste des services");
                    us.listerService();
                    System.out.print("Entrer l'id du service: ");
                    idService = scanner.nextLine();
                    us.afficherClientByService(Integer.parseInt(idService));
                    break;
                case 6:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Veuillez faire un bon choix");
                    break;
            }
        }
        while(choix!=6);
    }
    public static int menu(){
        System.out.print("1-Ajouter un Service"
                            +"\n 2-Lister Service"
                            +"\n 3-Ajouter un Employe "
                            +"\n 4-Affecter un Employe a un Service"
                            +"\n 5-Afficher les employes d'un service"
                            +"\n 6-Quitter"
                            +"\n Faites votre choix!: ");
        String choix;
        choix=scanner.nextLine();
        return Integer.parseInt(choix);
    }
}