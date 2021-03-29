 import java.util.Calendar;
class Exercice5b {
    public static void main(String[] argv) throws Exception{
        Calendar cal = Calendar.getInstance();
        int nbrJour = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(nbrJour); // 30
  }
}