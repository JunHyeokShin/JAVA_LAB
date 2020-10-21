package chapter3;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;

		int totalScore = mathScore + engScore + korScore;		//총점 구하기
		System.out.println(totalScore);

		double avgScore = totalScore / 3.0;									//평균 구하기
		System.out.println(avgScore);
	}
}