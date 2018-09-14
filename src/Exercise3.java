import javax.swing.*;

public class Exercise3 {
    public static void main(String args[]){

        String name =  getName();
        float income = getIncome();
        float tax = (float) getTax(income);
        double netIncome = getNetIncome(tax, income);

        JOptionPane.showMessageDialog(null, "\nGross income: " +
               income + "\ntax rate: " + tax + "\nIncome after tax: " + netIncome, "Tax", JOptionPane.INFORMATION_MESSAGE);
    }

    private static double getNetIncome(float tax ,float income) {
        double netIncome;

        netIncome = income - tax;

        return netIncome;



    }

    private static float getTax(float income) {
        float tax;

        if(income <= 20000)
            tax = 0;

        else if(income >= 20000.01 && income <= 360000)
            tax = (income/100) * 20;

        else
            tax = (income/100) * 41;

        return tax;


    }

    private static float getIncome() {

        String incomeasString;
        float income;

        incomeasString = JOptionPane.showInputDialog("Please enter your income:");

        income = Float.parseFloat(incomeasString);

        return income;
    }

    private static String getName() {
        String name;

        name = JOptionPane.showInputDialog("Please enter your name:");

        return name;

    }
}
