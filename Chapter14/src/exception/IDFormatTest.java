package exception;

public class IDFormatTest {
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {		//IDFormatException 예외를 setUserID() 메서드가 호출될 때 처리하도록 미룸
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");					//강제로 예외 발생시킴
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");	//강제로 예외 발생시킴
		}
		this.userID = userID;
	}		//아이디에 대한 제약 조건 구현

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();

		String userID = null;
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}

		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}