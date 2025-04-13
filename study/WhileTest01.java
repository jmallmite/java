////////////////////////
// WhileTest01 이라는 class 를 선언한다.
// public static void main (String[] args) -> 프로그램 시작
// count 라는 정수형 변수에 1을 저장한다.
// while 문은 조건이 참인 동안 계속 반복하는 반복문이다.
// count 가 5보다 작거나 같을때 System.out.println 안에 있는 값이 count++을 통해 1씩 증가하며 계속 출력하게 된다.
// 그러므로 1~5까지 count is: 가 실행되게 된다.


////////////////////////
public class WhileTest01 {
	public static void main (String[] args) {
		int count = 1;
		
		while(count <= 5) {
			System.out.println("Count is: " + count);
			count ++;
		}
	}

}
