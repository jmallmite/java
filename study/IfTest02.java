////////////////////
// IfTest02 라는 이름의 클래스 선언
// public static void main(String[] args) -> 프로그램 시작
// 정수형 변수 number 를 선언하고 10을 저장한다.
// 만약 number 가 0보다 크면 The number is positive가 출력된다.
// *else 문은 조건을 붙일 수 없다. -> if 문을 사용하고 그외의 경우라는 의미이기 때문이다. / if else는 여러 번 실행이 가능하며 조건을 붙일 수 있다.
// number 가 0 보다 작을 경우 The number is negative가 출력된다.
// else -> 그외의 경우에는 The number is zero 가 출력된다.
// * if 문이나 else 문은 조건을 꼭 붙혀야 하며 조건을 true나 false 라고 광범위 하게 붙혀서 else 처럼 동작하게 하는 것은 가능하다.
////////////////////
public class IfTest02 {
	public static void main(String[] args)  {
		 int number = 10;
		 
		 if (number > 0) {
			 System.out.println("The number is positive.");
		 } else if (number < 0) {
			 System.out.println("The number is negative.");
		 } else {
			 System.out.println("The number is zero.");
		 }
	}
}
