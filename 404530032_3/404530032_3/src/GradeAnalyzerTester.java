/*
 * [A]102
 * [TA's Advise]
 * 1. 沒什麼太大的問題, 很棒!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String _Input = "";

		GradeAnalyzer G = new GradeAnalyzer();

		while (true) {
			_Input = JOptionPane.showInputDialog(null,
					"Please enter the grades you want to analyze.\nEnter q to end the analyzer.");

			if (_Input.equalsIgnoreCase("q"))
				break;
			// 使用者輸入q將終止迴圈

			try {
				G.addGrade(Double.parseDouble(_Input));
			} catch (Exception e) {
				System.out.println("Do not enter the invalid grades"); // 輸入非數字將印出警告訊息
			}
		}

		if (G.InputAm < 2)
			JOptionPane.showMessageDialog(null,
					"You did not enter enough grades to analyze. Please enter at least 2 valid grades");
		// 若輸入分數數量少於2將出現此訊息
		else {

			G.analyzeGrades();
			System.out
					.println("You entered " + G.InputAm + " valid grades from 0 to 110. Invalid grades are ignored! ");

			System.out.println("The average = " + G.Avg + " with a standard deviation = " + G.SD);

			System.out.println(G);

		}
	}

}
