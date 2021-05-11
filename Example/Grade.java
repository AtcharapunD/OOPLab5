package Example;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.text.DecimalFormat;

public class Grade {
    private final int AMOUNT = 40;
    private int[] attendance;
    private int[] homework;
    private int[] exam;
    private int[] mid_exam;
    private int[] final_exam;
    private int[] total;
    private String[] grade;

    public Grade() {
        Initialize();
        GradeCalculate(attendance, homework, exam, mid_exam, final_exam, total, grade);
        ShowResult(attendance, homework, exam, mid_exam, final_exam, total, grade);
    }

    public void Initialize() {
        // Allocate
        attendance  = new int[AMOUNT];
        homework    = new int[AMOUNT];
        exam        = new int[AMOUNT];
        mid_exam    = new int[AMOUNT];
        final_exam  = new int[AMOUNT];
        total       = new int[AMOUNT];
        grade       = new String[AMOUNT];

        // Init.
        for(int n = 0; n < AMOUNT; n++) {
            attendance[n]   = RandomPoint(0,  5);
            homework[n]     = RandomPoint(0, 15);
            exam[n]         = RandomPoint(0, 10);
            mid_exam[n]     = RandomPoint(0, 35);
            final_exam[n]   = RandomPoint(0, 35);
            total[n]        = 0;
            grade[n]        = "N";
        }
    }

    public void GradeCalculate(int[] attendance, int[] homework, int[] exam, int[] mid_exam,
                            int[] final_exam, int[] total, String[] grade) {
        // Get total
        for(int n = 0; n < AMOUNT; n++) {
            total[n] += attendance[n];
            total[n] += homework[n];
            total[n] += exam[n];
            total[n] += mid_exam[n];
            total[n] += final_exam[n];

            // Conditions
            if(total[n] >= 80) grade[n] = "A";
            else if(total[n] >= 75) grade[n] = "B+";
            else if(total[n] >= 70) grade[n] = "B";
            else if(total[n] >= 65) grade[n] = "C+";
            else if(total[n] >= 60) grade[n] = "C";
            else if(total[n] >= 55) grade[n] = "D+";
            else if(total[n] >= 50) grade[n] = "D";
            else grade[n] = "F";
        }
    }

    public void ShowResult(int[] attendance, int[] homework, int[] exam, int[] mid_exam,
                        int[] final_exam, int[] total, String[] grade) {
        DecimalFormat threeDigits = new DecimalFormat("###.00");
        String result = "";
        
        result += "============================" + "\n";
        result += "=       Grade Report       =" + "\n";
        
        // Show Result
        for(int n = 0; n < AMOUNT; n++) {
            result += "============================" + "\n";
            result += "Student " + (n + 1) + "\n";
            result += "============================" + "\n";
            result += "Class Attendance : " + attendance[n] + "\n";
            result += "Homework : " + homework[n] + "\n";
            result += "Exam : " + exam[n] + "\n";
            result += "Mid Exam : " + mid_exam[n] + "\n";
            result += "Final Exam : " + final_exam[n] + "\n";
            result += "Total : " + total[n] + "\n";
            result += "Grade : " + grade[n] + "\n";
        }

        JTextArea textArea = new JTextArea(result);
        JScrollPane scrollPane = new JScrollPane(textArea);  
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true); 
        scrollPane.setPreferredSize( new Dimension( 500, 500 ) );

        JOptionPane.showMessageDialog(null, scrollPane, "Result", JOptionPane.PLAIN_MESSAGE);
        //System.out.println(result);
    }

    public int RandomPoint(int start, int end) {
        // Random
        return (int)((Math.random() * ((end - start) + 1)) + start);
    }
    
    public static void main(String[] args) {
        new Grade();
    }
}