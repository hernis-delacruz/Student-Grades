import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Scores {
	private static int i;
	private static int grade;
	private static double average;
	private static int TotalGrade;
	private static int n;
	private static List<Integer> listOfGrades;
	private static Random randomNumbers = new Random();

	public static void main (String[] args ) {
		String numberOfStudents = 
				JOptionPane.showInputDialog("How many students do you have? ");
		 n = Integer.parseInt(numberOfStudents);
		
		listOfGrades = new ArrayList<Integer>();
		for (i = 1; i <= n; i++) {
			String GradesofStudents =
			JOptionPane.showInputDialog("Enter score for student # " + i);
			grade = Integer.parseInt(GradesofStudents);
			listOfGrades.add(grade);
			TotalGrade += grade;
			average = TotalGrade / n;
		}
		background();
	}
	
	public static void background () {
		Date date = new Date();
       JFrame application = new JFrame();
       JPanel panel = new JPanel();
       Color color = new Color (randomNumbers.nextInt(256), (randomNumbers.nextInt(256)), 
    		   (randomNumbers.nextInt(256)));
       panel.setBackground(color);
       JLabel jlabel = new JLabel("The number of students is " + n + "\n");
       JLabel jlabel1 = new JLabel("The individual grades of the class are " + listOfGrades + "\n");
       JLabel jlabel3 = new JLabel("The total grade of the class is " + TotalGrade + "\n");
       JLabel jlabel4 = new JLabel("The average grade of the class is " + average + "\n");
       JLabel jlabel5 = new JLabel(date.toString());
       panel.add(jlabel); 
       panel.add(jlabel1);       
       panel.add(jlabel3);       
       panel.add(jlabel4);       
       panel.add(jlabel5);       
       application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       application.setSize (350, 350);
       application.add(panel);
       application.setVisible(true);
	}
}