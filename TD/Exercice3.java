import java.util.Scanner;
class Exercice3{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Entrer le premier nombre : ");
        int nbre1=myObj.nextInt();
        System.out.print("Entrer le deuxieme nombre : ");
        int nbre2=myObj.nextInt();
        System.out.print("Entrer le troisieme nombre : ");
        int nbre3=myObj.nextInt();
        if (nbre1>nbre2 && nbre1>nbre3 && nbre2>nbre3) {
            System.out.println(nbre1+ "," +nbre2 +"," + nbre3);
        }else if (nbre2>nbre1 && nbre2>nbre3 && nbre1>nbre3) {
            System.out.println(nbre2 + "," + nbre1 + "," +nbre3);
        }else{
            System.out.println(nbre2 + "," + nbre3 + "," + nbre1);

        }

    }
}