package peti;

public class Nit extends Thread{
    private int[] red;
    private int redniBroj;

    public Nit(int[] redak, int redniBroj){
        this.red = redak;
        this.redniBroj = redniBroj;
    }


    public void run()
    {
        int max = red[0];
        for(int i = 0; i< red.length; i++){
            if(red[i]>max)
                max = red[i];
        }
        System.out.println("Nit "+redniBroj+" je zavrsila s radnom, najveci broj u retku je: "+max);
    }

}
