package dto;

import java.util.Scanner;

public class LoginService03 {
	private LoginDTO03 login;
	public LoginService03() {	//기본생성자
		login = new LoginDTO03();
	}
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		String putid, putpwd;
		boolean b = true;
		
		while(b) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : 
				//if(login.getId() == null)
				if(idCheck() == 0) {
					System.out.println("회원가입 해주세요.");
					break;
				}
				System.out.print("아이디 입력 : ");
				putid = sc.next();
				if(putid.equals(login.getId())) {
					System.out.print("비밀번호 입력 : ");
					putpwd = sc.next();
					if(putpwd.equals(login.getPwd())) {
						System.out.println("인증 통과~~~");
						break;
					}else {
						System.out.println("비밀번호 틀림");
						break;
					}
				}else {
					System.out.println("존재하지 않는 id 입니다.");
				}
				break;
			case 2 : 
				//if(login.getId() == null)
				if(idCheck() == 0) {
					System.out.print("아이디 입력 : ");
					putid = sc.next();
					System.out.print("비밀번호 입력 : ");
					putpwd = sc.next();
					login.setId(putid);
					login.setPwd(putpwd);
					System.out.println("사용자가 등록되었습니다.");
					break;
				}else {
					System.out.println("사용자가 존재합니다.");
					break;
				}
			case 3 :
				//if(login.getId() == null)
				if(idCheck() == 0) {
					System.out.println("등록된 사용자가 없습니다.");
					break;
				}else {
					System.out.print("아이디 입력 : ");
					putid = sc.next();
					if(putid.equals(login.getId())) {
						System.out.print("비밀번호 입력 : ");
						putpwd = sc.next();
						if(putpwd.equals(login.getPwd())) {
							login.setId(null);
							login.setPwd(null);
							System.out.println("탈퇴 되었습니다.");
							break;
						}else {
							System.out.println("비밀번호 틀림");
							break;
						}
					}else {
						System.out.println("존재하지 않는 id 입니다.");
					}
					break;
				}
			case 4 :
				System.out.println("프로그램을 종료합니다~~");
				b = false;
				break;
			default : 
				System.out.println("다시 입력해주세요");
				break;
			}
		}
	}
	public int idCheck() {
		if(login.getId() == null) {
			return 0;
		}
		return 1;
	}
}
