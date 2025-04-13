
public class Notebook2 extends Computer2 {

	// 생성자
	public Notebook2() {
		// super키워드는 자식 생성자에서 부모 생성자를 호출한다.
		super("엘지");
    	System.out.println("이것은 Notebook2 생성자 메소드 입니다.");
	}
	
	public void makeNotebook() {
		setCpu(777);
		setMemory(32);
		setcountry("Korea");
	}

}
