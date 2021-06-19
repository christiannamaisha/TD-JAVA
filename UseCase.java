public class UseCase{
    private final int TAILLE=5;
    private int nbreService;
    private Service[] tabService=new Service[TAILLE];
    private int nbreEmploye;
    private Employe[] tabEmploye=new Employe[TAILLE];
    //Methode creer Service
    
    public void ajouterService(Service sr){
        if(nbreService<TAILLE){
            tabService[nbreService]=sr;
            nbreService++;
        }else{
            System.out.println("Tableau rempli");
        }
    }

    public void listerService(){
        for(Service sr:tabService){
            if(sr!=null){
                System.out.println(sr.affiche());
            }
        } 
    }

    public void listerEmploye(){
        for(Employe em:tabEmploye){
            if(em!=null){
                System.out.println(em.affiche());
            }
        } 
    }

    public void ajouterEmploye(Employe em){
        if(nbreEmploye<TAILLE){
            tabEmploye[nbreEmploye]=em;
            nbreEmploye++;
        }else{
            System.out.println("Tableau rempli");
        }
    }

    public void afficherClientByService(int idService){
        for(Employe em:tabEmploye){
            if(em!=null){
                if(idService==em.getId_service()){
                    System.out.println(em.affiche());
                }

            }else{
                break;
            }
            
        } 
    }

    public Service rechercheServiceById(int idService){
        for(Service sr:tabService){
            if(sr.getId()==idService){
                return sr;
            }
        }
        return null; 
    }

    public Employe rechercheEmployeById(int idEmploye){
        for(Employe em:tabEmploye){
            if(em.getId() == idEmploye){
                return em;
            }
        }
        return null; 
    }
}