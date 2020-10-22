package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101;

		System.out.println(num << 2);		//왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num >> 2);		//오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num >>> 2);	//오른쪽으로 2비트 이동 00000001 (1)

		System.out.println(num);

		num = num << 2;
		System.out.println(num);
	}
}