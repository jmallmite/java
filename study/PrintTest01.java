/////////////////
// printTest01 이라는 이름의 클래스를 선언
// 프로그램의 시작정
// Hello를 출력하고 줄바꿈 하고 World
// Hello를 출력하고 바로 붙어서  World가 출력된다.
// println과 print의 차이는 ln 이 붙으면 줄바꿈이 되고 ln 이 붙지 않으면 바로 옆에 붙어서 출력된다.



/////////////////
public class PrintTest01 {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("World");
	
		System.out.print("Hello");
		System.out.print("World");
	}

}
