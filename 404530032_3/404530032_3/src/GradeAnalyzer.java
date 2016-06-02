import java.util.ArrayList;

class Count {
	int GCn;
	String name;

	Count() {
	}

	Count(String _name, int _GCn) {
		this.GCn = _GCn;
		this.name = _name;
	}

	public String toString() {
		return this.name + "=" + this.GCn;
	}
}

public class GradeAnalyzer implements GAInterface {
	int InputAm; // 块だ计羆计ぇ把计
	double Avg, SD, SDSq, Total;

	Count[] GD = new Count[11];
	ArrayList<Double> ScoreV = new ArrayList<Double>();

	boolean FirstTime = true;

	public boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0) {
			return true;
		} // ざ0110Τ肚
		else
			return false;
	}

	public void addGrade(double aGrade) {
		// Good, +2.
		if (FirstTime) {
			GD[0] = new Count("A+", 0);
			GD[1] = new Count("A", 0);
			GD[2] = new Count("A-", 0);
			GD[3] = new Count("B+", 0);
			GD[4] = new Count("B", 0);
			GD[5] = new Count("B-", 0);
			GD[6] = new Count("C+", 0);
			GD[7] = new Count("C", 0);
			GD[8] = new Count("C-", 0);
			GD[9] = new Count("D", 0);
			GD[10] = new Count("F", 0);
			FirstTime = false;

		}
		if (!isValidGrade(aGrade)) {
			return;
		}

		ScoreV.add(aGrade);
		Total += aGrade;
		InputAm++;

		if (aGrade >= 98) {
			GD[0].GCn++;
		}
		if (aGrade < 98 && aGrade >= 92) {
			GD[1].GCn++;
		}
		if (aGrade < 92 && aGrade >= 90) {
			GD[2].GCn++;
		}
		if (aGrade < 90 && aGrade >= 88) {
			GD[3].GCn++;
		}
		if (aGrade < 88 && aGrade >= 82) {
			GD[4].GCn++;
		}
		if (aGrade < 82 && aGrade >= 80) {
			GD[5].GCn++;
		}
		if (aGrade < 80 && aGrade >= 78) {
			GD[6].GCn++;
		}
		if (aGrade < 78 && aGrade >= 72) {
			GD[7].GCn++;
		}
		if (aGrade < 72 && aGrade >= 70) {
			GD[8].GCn++;
		}
		if (aGrade < 70 && aGrade >= 60) {
			GD[9].GCn++;
		}
		if (aGrade < 60) {
			GD[10].GCn++;
		}
	}

	public void analyzeGrades() {
		Avg = Total / InputAm; // 璸衡キАだ计
		int i;
		for (i = 0; i < ScoreV.size(); i++) {
			SDSq += (ScoreV.get(i) - Avg) * (ScoreV.get(i) - Avg);
		}
		SD = Math.round(Math.sqrt(SDSq / InputAm)); // 璸衡夹非畉(そΑ)
	}

	public String toString() {
		String Ans = "";
		int i;
		for (i = 0; i < GD.length; i++) {
			Ans += GD[i] + "\n";
		}
		return "The grade distribution is:\n" + Ans;
	}

}
