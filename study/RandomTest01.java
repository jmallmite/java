//////////////////////
// RandomTest01 이라는 클래스를 선언한다.
// public static void main(String[] args) -> 프로그램 시작
// double: 실수(소수점 있는 숫자) 를 저장하는 자료형
// randomValue: 저장한 변수 이름
// math: 수학 관련 기능을 모아 놓은 클래스
// random(): 0.0이상 1.0 미만의 랜덤한 실수를 만들어주는 기능을 가진 메서드
// "Generated random value: 에서 randomValue의 랜덤한 값이 출력된다.
// randomInt 라는 정수형 변수를 생성한다.
// (int)를 통해 형 변환. 실수를 정수로 바꾼다.
// math.random() 에서 0.0이상 1.0 미만의 실수를 랜덤해서 생성하는데 *100을 하므로 0.0이상 100.0 미만을 실수로 바꾼다
// Geneerated random integer between 0 and 99 에서 randomInt의 0~100의 값 중 하나가 출력된다.



///////////////////////
public class RandomTest01 {
	public static void main(String[] args) {
		
		double randomValue = Math.random();
		System.out.println("Generated random value: " + randomValue);
		
		int randomInt = (int) (Math.random() * 100);
		System.out.println("Generated random integer between 0 and 99: " + randomInt);
	}
}
