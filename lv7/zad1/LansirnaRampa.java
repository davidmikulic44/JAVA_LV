package zad1;

public class LansirnaRampa {
    public void lansiraj(){
        for(int i=10;i>0;i--){
            System.out.println("zad1.Raketa ce biti lansirana za " + i + " sekundi" );
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
