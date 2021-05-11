package Example;
import javax.swing.JOptionPane;

public class first {
    public static void main(String args[]) {

        int n, score = 0;
        String n1;

        n1 = JOptionPane.showInputDialog("Enter number of score");
        n = Integer.parseInt(n1);
        score = getscore(n);
        average(n, score);
    }

    public static int getscore(int n) {
        String score;
        int S, score1 = 0;
        for (int i = 1; i <= n; i++) {
            score = JOptionPane.showInputDialog("Enter score " + i + ":");
            S = Integer.parseInt(score);
            score1 += S;
        }
        return (score1);
    }

    public static void average(int n, int score) {
        float a = score / n;
        String output = " Average is " + a;
        JOptionPane.showMessageDialog(null, output, "Sumation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
