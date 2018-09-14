import javax.swing.*;
import java.awt.*;

public class Exercise4 {

    public static void main(String args[]) {

        int number = getNumber();
        int i=0;
        int total = getTotal(number);

     JOptionPane.showMessageDialog(null,"Total: " + total +
             "\nNo. of entries: " + i);



    }


    private static int getTotal(int number) {

        int total = number += number;
        return total;

    }

    private static int getNumber() {
        String numberAsString = null;
        int number = 0, i=0;
        Boolean result = true;

        while (numberAsString != "q") {
            numberAsString = JOptionPane.showInputDialog("Please enter a number:");
            number = Integer.parseInt(numberAsString);
            i++;
            result = true;

            if(number)



        }


    return number;
    }

}

