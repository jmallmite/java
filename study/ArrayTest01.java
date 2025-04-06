/////////////////////////
// ArrayTest01 을 클래스로 선언한다.
// public static void main(String[] args) -> 프로그램 시작 
// * 인덱스: 배열이나 리스트 처럼 여러 데이터를 순서대로 저장한 구조에서, 각각의 데이터에 부여된 번호를 말한다. / * 인덱스는 0부터 시작하는데 맨 앞, 첫 번째 라는 느낌으로 쓰이기도 한다.
// 파이썬이나 자바에서 반복문의 경우 리스트나 배열을 다룬다면 인덱스와 관련이 있으므로 반복문 조건을 보통 0부터 시작하는것으로 짠다.
// number 라는 이름의 정수형 배열을 선언한다. / 안에는 1~5 까지의 값을 넣어서 배열 초기화를 했다.
// System.out.pritln 에서 + 연산자는 문자열과 정수를 연결(문자열로 변환) 한다.
// number.length 는 배열의 길이(요소의 개수)를 알려주는 속성으로 5 이다.
// for 문을 통해서 i 값 0에서 시작하여 i가 배열의 길이 보다 작을때 까지 1씩 증가하며 반복된다.
// System.out.println 안의 "Element at index " + i + ": " + numbers[i] 에서 i 는 0~4 까지의 값이 줄바꿈 되며 출력되고 number[i] 는 number 리스트의 0~4 까지 인덱스 위치의 값이 줄바꿈 되며 출력된다.



/////////////////////////
public class ArrayTest01 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("배열의 길이: " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}

}
