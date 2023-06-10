package cetvrti;

public class UsporedbaPotrosnje {
    public static void usporedi(TestAutomobila ta1, TestAutomobila ta2){

        double potrosnja1 = ta1.getPotrosioGoriva() / ta1.getPrijedjenPut();
        double potrosnja2 = ta2.getPotrosioGoriva() / ta2.getPrijedjenPut();

        System.out.println(ta1.getNaziv()+" ima prosjecnu potrosnju "+potrosnja1+" (Potroseno gorivo: "+ta1.getPotrosioGoriva()+", Prijedjen put: "+ta1.getPrijedjenPut()+")");
        System.out.println(ta2.getNaziv()+" ima prosjecnu potrosnju "+potrosnja2+" (Potroseno gorivo: "+ta2.getPotrosioGoriva()+", Prijedjen put: "+ta2.getPrijedjenPut()+")");

        if(potrosnja1>potrosnja2)
            System.out.println(ta1.getNaziv()+" troši više od "+ta2.getNaziv());
        else if(potrosnja1<potrosnja2)
            System.out.println(ta2.getNaziv()+" troši više od "+ta1.getNaziv());
        else
            System.out.println("Automobili imaju istu potrošnju");

    }
}
