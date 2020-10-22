package chapter4;

public class Q4 {
	public static void main(String[] args) {
		int lineCount = 4;
		int i, j;

		for(i = 1; i <= lineCount; i++) {
			for(j = 1; j <= lineCount - i; j++)
				System.out.print("  ");
			for(j = 1; j <= 2 * i - 1; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}