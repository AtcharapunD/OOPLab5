import javax.swing.JOptionPane;
public class Test5_1 {
    public static void main(String[] args) {
        double num;
        String s1;

        s1 = JOptionPane.showInputDialog("Enter number of score :" );
        num = Double.parseDouble(s1);
        double score = getScore(num);
        double average = average(num,score);

        String output = "Average scoer is " + average ;
        JOptionPane.showMessageDialog( null, output,"Result", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static double getScore(double n) {
        double sum = 0;
        String s2;
        for(double i = 1;i<=n;i++){
            s2 = JOptionPane.showInputDialog("Enter score "+ i +":" );
            sum +=  Integer.parseInt(s2);       
        }
        return(sum); 
    }
    public static double average(double n,double s) {
        double total;
        total = s/n;
        return(total);
    }
}
