import javax.swing.JOptionPane;
public class Test5_3 {
    public static void main(String[] args) {
        String s1;
        int num;
        String output = "" ;
        do{
            s1 = JOptionPane.showInputDialog("Enter number :" );
            num = Integer.parseInt(s1);
            if(num >= 0 ){
                output+=s1 + " : " +  printChar(num) + "\n";
            }
        }while(num >= 0);
        //System.out.println(output);
        JOptionPane.showMessageDialog( null, output,"Histogram", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static String printChar(int n) {
        
        String star="";
        for(int i = 1; i<=n ;i++){
            star += "*";
        }
        return star;
    }
}
