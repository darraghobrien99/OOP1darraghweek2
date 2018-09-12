import javax.swing.JOptionPane;

public class Exercise2 {

    public static void main(String[] args) {

        String fName = getFName();
        String lastname = getLName();
        String initial = getInitial();
        int distance = getDistance();
        float money = getMoney(distance);

        JOptionPane.showMessageDialog(null,"\nFirst name: " + fName +
        "\nInitial: " + initial + "\nLast name: " + lastname +
                "\nDistance cycled: " + distance + "\nMoney Due: £ " + money , "Distance", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getFName() {

        String name = JOptionPane.showInputDialog("Please enter your FIRST name:");
        return name;
    }

    private static String getLName() {

        String lastname = JOptionPane.showInputDialog("Please enter your LAST name:");
        return lastname;
    }

    private static float getMoney(int distance) {

        if(distance <= 10){
            return (float) (distance * 0.07);
        }


        else
            return (float) ((distance - 10) * 0.10f) + (10 * 0.07f);


    }

    private static int getDistance() {

        String distance = JOptionPane.showInputDialog("Please enter the distance travelled:");

        return Integer.parseInt(distance);

    }

    private static String getInitial() {
        String initial = JOptionPane.showInputDialog("Please enter your middle initial");
        return initial;
    }



}
