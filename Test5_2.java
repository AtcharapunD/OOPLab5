import javax.swing.JOptionPane;
public class Test5_2 {
    public static void main(String[] args) {
        long number;
        String  s1;
        s1 = JOptionPane.showInputDialog("Enter number :" );
            number = Long.parseLong(s1);
        long digit = countDigit(number);
        String output = "Number digit of "+ s1 +" is " + digit + " digits." ;
        JOptionPane.showMessageDialog( null, output,"Result", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static long countDigit(long n) {
        int c= (int)n /10;
        if(c ==0 ){
            return 1;
        }
        else{
            return countDigit((long)c)+1;
        }
    }
}
