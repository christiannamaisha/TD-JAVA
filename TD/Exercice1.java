import java.util.Scanner;
class Exercice1{
    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        System.out.print("Entrer le nombre : ");
        int nbre=clavier.nextInt();
        if (nbre==0) {
            System.out.println("Ce nombre est nul !");
        }else if (nbre>0){
            System.out.println("Ce nombre est positif !");
        }else{
            System.out.println("Ce nombre est negatif !");
        }
    }
}
