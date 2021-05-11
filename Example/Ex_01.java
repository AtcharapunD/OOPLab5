package Example;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex_01
{
    public static void main(String[] args) 
    {
        DecimalFormat threeDigits = new DecimalFormat("###,###.00");

        Ex_01
    obj = new Ex_01
    ();

        String strItems;
        int items, total;
        double avg;
        
        do
        {
            strItems = JOptionPane.showInputDialog(null, "Enter number of score : ");
            items = Integer.parseInt(strItems);

            if (items > 0)
            {
                total = obj.getScore(items);
                avg = obj.average(total, items);

                JOptionPane.showMessageDialog(null, "Average value is " + threeDigits.format(avg), "Result", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data invalid, not process.");
            }
        } while (items <= 0);
    }

    public int getScore(int items)
    {
        String strValue;
        int value;
        int total = 0;

        for (int n = 1; n <= items; n++)
        {
            strValue = JOptionPane.showInputDialog(null, "Enter score " + n + " : ");
            value = Integer.parseInt(strValue);

            total += value;
        }

        return total;
    }

    public double average(int total, int items)
    {
        double avg = 0;

        avg = total / items;

        return avg;
    }
}