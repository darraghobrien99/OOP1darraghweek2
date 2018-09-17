import javax.swing.*;

public class Exercise5 {

    public static void main(String args[]){

        String choiceAsString;
        char choice;
        String number1AsString = null, number2AsString = null;
        float number1, number2, sum=0;
        String message = "A(Addition) \nS(Subtraction) \nM(Multiplication) \n D(Division)\n\n";

        choiceAsString = JOptionPane.showInputDialog( message + "\n" +
                "Please choose your choice:");

        choice = choiceAsString.charAt(0);
        
        number1AsString = JOptionPane.showInputDialog("Please enter your first number:");
        
        number1 = Float.parseFloat(number1AsString);

        number2AsString = JOptionPane.showInputDialog("Please enter your second number:");

        number2 = Float.parseFloat(number2AsString);

        JOptionPane.showMessageDialog(null,sum, "Calculator" , JOptionPane.INFORMATION_MESSAGE);

        switch(choice) {

            case 'A':

               sum = number1 + number2;
               break;

            case 'S':

                sum = number1 - number2;
                break;

            case 'M':

                sum = number1 * number2;
                break;

            case 'D':

                sum = number1 / number2;
                break;

            default:
                    JOptionPane.showMessageDialog(null,"Error", "Calculator",JOptionPane.INFORMATION_MESSAGE);

                
        }


    }
}
