package constructor;

class TestClass02{
	private String officeName;

	//매개변수 받는게 가능함
	public TestClass02(String office) {
		System.out.println("기본 생성자 실행");
		officeName = office;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		String msg = "나의 회사";
		TestClass02 t = new TestClass02(msg);
		//t.setOfficeName(msg); 적을 필요 없이 바로 get으로 가져옴
		System.out.println("회사 이름 : "+t.getOfficeName());
	}
}
