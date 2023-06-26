package time;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			1. 시작시간 설정 - 확인(년월일시분초)
			2. 종료시간 설정 - 확인(년월일시분초)
			3. 사용시간 가져오기 - ?시간 ?분 ?초 사용
		 */
		TimeService time = new TimeService();
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1. 시작시간 설정");
			System.out.println("2. 시작시간 확인");
			System.out.println("3. 종료시간 설정");
			System.out.println("4. 종료시간 확인");
			System.out.println("5. 사용시간 가져오기");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 :
				time.setStartTime();
				break;
			case 2 : 
				System.out.println(time.getStartTime());
				break;
			case 3 :
				time.setEndTime();
				break;
			case 4 : 
				System.out.println(time.getEndTime());
				break;
			case 5 :
				System.out.println(time.getResultTime());
				break;
			default:
				System.out.println("다시 입력하세요");
				break;	
			}
			
		}
		
	}
}
