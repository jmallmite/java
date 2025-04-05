/////////////////////////
// import는 다른 클래스나 기능을 불러올때 사용하는 키워드이다. *키워드 = 예약어
// java.util 이라는 도구 모음집(패키지) 에서 Scanner 라는 사용자의 입력을 읽는 클래스를 가져오겠다.
// Scanner 는 라이브러리 클래스라고 할 수 있다., 라이브러리 함수 x
// public class ScannerTest01 -> class ScannerTest01을 이 클래스나 다른 클래스에 보이고 사용할 수 있도록 허락하는것이다.
// 여기서 부터 프로그램을 시작한다는 것을 의미
// Scanner의 scanner 에 새로운 Scanner 클래스를 만들어서 키보드 입력을 받을 수 있게 저장한다. *클래스에 데이터를 직접 넣을 수는 없으므로 객체를 만들어야만 거기에 데이터를 넣을 수 있다.
// System.out.print를 통해 Enter a string: 을 출력한다
// String: 글자들을 저장할 수 있는 자료형, input 이라는 변수
// scanner.nextline() -> 사용자 입력 한 줄 전체를 읽어오고 다음 줄에 입력
// You entered 출력하고 input 값도 출력
// 사용이 끝난 Scanner 객체를 닫아준다.


////////////////////////
import java.util.Scanner;

public class ScannerTest01 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		
		System.out.println("You entered: " + input);
		
		scanner.close();
	}
			}
