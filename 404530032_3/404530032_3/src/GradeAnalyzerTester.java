/*
 * [A]102
 * [TA's Advise]
 * 1. �S����Ӥj�����D, �ܴ�!
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
			// �ϥΪ̿�Jq�N�פ�j��

			try {
				G.addGrade(Double.parseDouble(_Input));
			} catch (Exception e) {
				System.out.println("Do not enter the invalid grades"); // ��J�D�Ʀr�N�L�Xĵ�i�T��
			}
		}

		if (G.InputAm < 2)
			JOptionPane.showMessageDialog(null,
					"You did not enter enough grades to analyze. Please enter at least 2 valid grades");
		// �Y��J���Ƽƶq�֩�2�N�X�{���T��
		else {

			G.analyzeGrades();
			System.out
					.println("You entered " + G.InputAm + " valid grades from 0 to 110. Invalid grades are ignored! ");

			System.out.println("The average = " + G.Avg + " with a standard deviation = " + G.SD);

			System.out.println(G);

		}
	}

}
