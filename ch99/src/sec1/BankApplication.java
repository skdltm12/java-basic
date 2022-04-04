package sec1;

import java.util.Scanner;

public class BankApplication {
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo ==4) {
				withdraw();
			}else if(selectNo ==5) {
				run = false;			
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌 생성하기
	private static void createAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		
		Account account = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {	//비어있는 기억장소를 찾아서 계좌생성
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
		}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("-----------------------");
		System.out.println("계좌목록");
		System.out.println("-----------------------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());				
			}else{break;}
		}		
		
	}
	//예금하기
	private static void deposit( ) {
		System.out.println("-----------------------");
		System.out.println("예금하기");
		System.out.println("-----------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account ==null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		
		account.setBalance(account.getBalance()+balance);
	}
	//출금하기
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		
		
		Account account = findAccount(ano);
		
		if(account ==null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
