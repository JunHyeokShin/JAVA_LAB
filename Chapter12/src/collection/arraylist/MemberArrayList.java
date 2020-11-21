package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);		//get() 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if(tempId == memberId) {						//회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);							//해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}