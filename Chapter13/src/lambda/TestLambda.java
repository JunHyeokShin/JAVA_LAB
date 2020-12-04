package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);		//람다식을 인터페이스형 변수에 대입하고
		lambdaStr.showString("hello lambda_1");								//그 변수를 사용해 람다식 구현부 호출
		showMyString(lambdaStr);	//메서드의 매개변수로 람다식을 대입한 변수 전달
		PrintString reStr = returnString();		//변수로 반환받기
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {	//매개변수를 인터페이스형으로 받음
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {	//람다식을 반환하는 메서드
		return s -> System.out.println(s + "world");
	}
}