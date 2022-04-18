package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	Member(){	
	}
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
public class ListEx4 {
	public static void main(String[] args) {		
		List<Member> l1 = new ArrayList<>();
		Member m1 = new Member();
		m1.setUid("ID1");
		m1.setPw("1234");
		m1.setEmail("ID1@naver.com");
		m1.setTel("010-0000-1111");
		l1.add(m1);
		Member m2 = new Member();
		m2.setUid("ID2");
		m2.setPw("2345");
		m2.setEmail("ID2@naver.com");
		m2.setTel("010-1111-1111");
		l1.add(m2);
		Member m3 = new Member();
		m3.setUid("ID3");
		m3.setPw("9870");
		m3.setEmail("ID3@naver.com");
		m3.setTel("010-2222-1111");
		l1.add(m3);
		Member m4 = new Member();
		m4.setUid("ID4");
		m4.setPw("4567");
		m4.setEmail("ID4@naver.com");
		m4.setTel("010-3333-1111");
		l1.add(m4);
		Member m5 = new Member();
		m5.setUid("ID5");
		m5.setPw("5678");
		m5.setEmail("ID5@naver.com");
		m5.setTel("010-5555-1111");
		l1.add(m5);
		System.out.println("아이디\t비밀번호\t전화번호\t\t이메일");
		for(Member mem : l1) {
			System.out.print(mem.getUid()+"\t");
			System.out.print(mem.getPw()+"\t");
			System.out.print(mem.getTel()+"\t");
			System.out.print(mem.getEmail()+"\n");
		}
	}
}
