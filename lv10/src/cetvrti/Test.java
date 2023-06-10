package cetvrti;

import static cetvrti.UsporedbaPotrosnje.usporedi;

public class Test {
    public static void main(String[] args) {
        TestAutomobila a1 = new TestAutomobila("Golf 4",34,600);
        TestAutomobila a2 = new TestAutomobila("Golf 6",35,700);

        usporedi(a1, a2);
    }
}
