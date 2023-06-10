import java.awt.event.*;
import javax.swing.*;

class Kalkulator extends JFrame implements ActionListener {
    static JFrame prozor;

    static JTextField l;

    String s0, s1, s2;

    Kalkulator()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        prozor = new JFrame("kalkulator");


        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Kalkulator k = new Kalkulator();

        l = new JTextField(14);

        l.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPlus, bMinus, bDijeljenje, bMnozenje, bTocka, bC, bJednako;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        bJednako = new JButton("=");

        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bDijeljenje = new JButton("/");
        bMnozenje = new JButton("*");
        bC = new JButton("C");

        bTocka = new JButton(".");

        JPanel p = new JPanel();

        bMnozenje.addActionListener(k);
        bDijeljenje.addActionListener(k);
        bMinus.addActionListener(k);
        bPlus.addActionListener(k);
        b0.addActionListener(k);
        b1.addActionListener(k);
        b2.addActionListener(k);
        b3.addActionListener(k);
        b4.addActionListener(k);
        b5.addActionListener(k);
        b6.addActionListener(k);
        b7.addActionListener(k);
        b8.addActionListener(k);
        b9.addActionListener(k);

        bTocka.addActionListener(k);
        bC.addActionListener(k);
        bJednako.addActionListener(k);

        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(bPlus);
        p.add(bMinus);
        p.add(bMnozenje);
        p.add(bDijeljenje);
        p.add(bTocka);
        p.add(bC);
        p.add(bJednako);

        prozor.add(p);
        prozor.setLocationRelativeTo(null);
        prozor.setSize(165, 260);
        prozor.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (s1.equals("")==false)
                s2 = s2 + s;
            else
                s0 = s0 + s;
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            l.setText("Cleared");
        }
        else if (s.charAt(0) == '=') {
            double rez;
            if (s1.equals("+"))
                rez = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                rez = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                rez = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                rez = (Double.parseDouble(s0) * Double.parseDouble(s2));

            l.setText(s0 + s1 + s2 + "=" + rez);

            s0 = Double.toString(rez);

            s1 = s2 = "";
        }
        else {
            if (s1.equals(""))
                s1 = s;
            else {
                double rez;

                if (s1.equals("+"))
                    rez = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    rez = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    rez = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    rez = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(rez);
                s1 = s;
                s2 = "";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}
