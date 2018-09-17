import javax.swing.*;


public class Lab2Exercise1 {

    public static void main(String[] args) {

        String gbAsString = null;
        float euro = 1.12f, gb = 0, exchange = 0;
        String list ="";


        while (gbAsString != "0")

        {

            gbAsString = JOptionPane.showInputDialog("Please enter the GB you want to convert:");

            gb = Float.parseFloat(gbAsString);

            exchange = gb * euro;

            list += exchange + "\n";

            JOptionPane.showMessageDialog(null, "The gb£ to euro is " + String.format("%.2f", exchange));


            if(gb == 0) {
                break;
            }

        }

        JOptionPane.showMessageDialog(null,"Conversions(£): \n" + list +"\n", "Exchange rates" , JOptionPane.INFORMATION_MESSAGE);



    }

}

