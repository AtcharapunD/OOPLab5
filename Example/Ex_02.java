package Example;
import javax.swing.JOptionPane;

public class Ex_02 {
    public static void main(String[] args) 
    {
        String strLong;
        long value;

        strLong = JOptionPane.showInputDialog(null, "Enter number : ");
        value = Long.parseLong(strLong);

        JOptionPane.showMessageDialog(null, "Number digit of " + strLong + " is " + countDigit(value) + " digits.", "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static int countDigit(long value)
    {
        String strLong;
        int digit = 0;

        strLong = Long.toString(value);

        digit = strLong.length();

        return digit;
    }
}
