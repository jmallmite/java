//////////////////////////////
// import 를 통해서 java.util 패키지에 있는 scanner 클래스를 가져와서 사용할 수 있도록 한다.
// SwitchTest02 라는 클래스를 선언한다.
// public static void main(String[] args) -> 프로그램 시작
// scanner 객체를 생성하고 거기에 새로운 Scanner로 키보드 입력 받을 준비를 한다.
// 무슨 커피를 드릴까요? 를 출력한다.
// *scanner 라는 이름의 입력 도구를 이용하여 next() 라는 기능을 수행한다. / next()는 공백 전까지 하나의 단어를 입력받는 매서드 이다./ line 을 사용했다면 에스프레소가 좋아요라고 입력하면 메뉴에없습니다! 가 실행될 수도 있다.
// 사용자가 입력한 한 단어를 문자열로 읽어와서 order 변수에 저장한다.
// price 변수에 0 값을 저장한다.
// order 값이 어떤 값인지 확인하여 처리한다.
// order 가 case 3가지 중 하나 일 경우 가격은 3500원 / break를 써서 이 블록만 실행하고 switch 문을 빠져나간다.
// case 가 아메리카노 일 경우 값은 2000원 이다. 
// 위에 어떤 case 에도 해당되지 않으면 default를 통해서 메뉴에없습니다! 가 실행된다.
// !=은 같지 않다를 의미하는 비교 연산자이다. 즉 만약에 가격이 0 이 아니라면 order + "는" + price + "원입니다" 가 출력된다.
// *** String order = scanner.next(); -> 사용자에게 입력을 받아, 그 입력값을 변수 order에 저장합니다.
// 더 이상 입력이 필요 없으므로 자원 정리 (Scanner 닫기)

/////////////////////////////
import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("무슨커피드릴까요? ");
		String order = scanner.next();
		int price = 0;
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에없습니다!");
		}
		if (price != 0)
			System.out.print(order + "는" + price + "원입니다");
		scanner.close();
	}
}
