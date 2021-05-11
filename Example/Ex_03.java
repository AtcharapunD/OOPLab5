package Example;
import javax.swing.JOptionPane;
import javax.swing.*;


public class Ex_03 {
    public static void main(String[] args) 
    {
        JTextArea output = new JTextArea();

        String strNumber;
        String star = "";
        int number;
        
        do
        {
            strNumber = JOptionPane.showInputDialog(null, "Enter number : ");
            number = Integer.parseInt(strNumber);

            if (number != -1)
            {
                for (int n = 0; n < number; n++)
                {
                    if (n == 0)
                    {
                        star = number + " : ";
                    }

                    star += "*";
                }

                output.append(star + "\n");

                star = "";
            }
        } while (number != -1);

        JOptionPane.showMessageDialog(null, output, "Histogram", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
