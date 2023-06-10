import java.util.Scanner;

public class Main {

    private static final int BROJ = 4;

    public static void main(String[] args) {
        int brojac=0;
        Scanner input = new Scanner( System.in );
        int pokusaj=0;
        while(pokusaj!= BROJ) {
            pokusaj = input.nextInt();
            brojac++;
            if(pokusaj!= BROJ){
                if(BROJ > pokusaj){
                    System.out.println("Veci");
                }
                else{
                    System.out.println("Manji");
                }
            }

        }

        System.out.println("Bravo! Pogodili ste nakon "+brojac+" pokusaja.");


    }

}
