package peti;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=0;
        do{
            m = input.nextInt();
        }while((m<2) || (m>10));

        int matrica[][] = new int[m][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("Unesite element ["+i+"]["+j+"]");
                matrica[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            Nit nit = new Nit(matrica[i],i);
            nit.start();
        }
    }
}
