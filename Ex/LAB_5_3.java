package Ex;
import javax.swing.JOptionPane;

public class LAB_5_3 {
    public static void main(String[] args) {
        num();
        System.exit( 0 );
    }

    public static void num() {
        String s1,s2,output = "" ;
        int value,num1,num2;

        s1 = JOptionPane.showInputDialog("Enter first number : ");
        s2 = JOptionPane.showInputDialog("Enter second number : ");
        num1 = Integer.parseInt( s1 );
        num2 = Integer.parseInt( s2 );
        
        for (int counter = 1; counter <= num2; counter++) {
            value = (int) (Math.random() * (num2-num1+1)+num1);
            output += value + " "; 

            if (counter % 5 == 0)
                output += "\n";
        }
        JOptionPane.showMessageDialog(null, output, " Random Numbers ", JOptionPane.INFORMATION_MESSAGE);
    }
}