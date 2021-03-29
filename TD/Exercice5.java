import java.util.Scanner;
class Exercice5a{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Entrer le mois en chiffre : ");
        int mois=myObj.nextInt(); 
        System.out.print("Entrer l'annee en chiffre : ");
        int annee=myObj.nextInt(); 
        switch (mois){
            case 2:
                if(annee%4==0 && annee%100!=0 || annee%400==0 ){
                    System.out.println("Le nbre de Jours du mois " +mois+" dans l'anne "+annee+" est de : 29jours");
                }else{
                    System.out.println("Le nbre de Jours du mois " +mois+" dans l'anne "+annee+" est de : 28jours");
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Le nbre de Jours du mois " +mois+" dans l'anne "+annee+" est de : 30jours");
                 break;
            default:
                System.out.println("Le nbre de Jours du mois " +mois+" dans l'anne "+annee+" est de : 31jours");
                break;
        } 
    }
}       