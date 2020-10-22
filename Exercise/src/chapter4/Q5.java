package chapter4;

public class Q5 {
	public static void main(String[] args) {
		int lineCount = 7;
		int i, j;

		for(i = 1; i <= lineCount / 2 + 1; i++) {
			for(j = 1; j <= lineCount / 2 - i + 1; j++)
				System.out.print("  ");
			for(j = 1; j <= 2 * i - 1; j++)
				System.out.print("* ");
			System.out.println();
		}
		for(i = 1; i <= lineCount / 2; i++) {
			for(j = 1; j <= i; j++)
				System.out.print("  ");
			for(j = 1; j <= i * (-2) + lineCount; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
