package constructor;
/*
생성자
- 하나의 메소드이다.
- 특정 변수를 초기화 목적으로 사용한다.
- 객체를 만들면 자동으로 호출되는 메소드다
 */
class TestClass01{
	//생성자는 반환타입이 없으면 클래스 이름과 동일하게 만들어진다.
	//객체 만들면 자동 호출
	public TestClass01() {
		System.out.println("기본 생성자 실행");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
	}
}
