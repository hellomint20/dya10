package dto;

import java.util.Scanner;

/*	기본 출력 및 연산 담당	*/
public class TestClass02 {
	private TestDTO2 member;
	public TestClass02() {
		System.out.println("기본 생성자 실행");
		member = new TestDTO2();
	}
	
	public void display() {
		System.out.println(member);
		System.out.println("사용자로부터 모든 값을 입력 받았다");
		String n = "홍길동";
		int kor =100, eng =100, sum = kor+eng;
		
		member.setE(eng); member.setK(kor);
		member.setName(n); member.setSum(sum);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 모든 내용 출력");
			System.out.println("2. 이름만 수정");
			System.out.print(">>> : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("이름 : "+member.getName());
				System.out.println("합계 : "+member.getSum());
				break;
			case 2 : 
				System.out.print("이름 입력 : ");
				n = sc.next();
				System.out.println(member.getName()+"==>"+n+"변경 됨!!!");
				member.setName(n);
				break;
			}
		}
	}
}
