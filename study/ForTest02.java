///////////////
// int에 변수 sum을 저장하고 sum에 0 값을 넣는다.
// for 문을 통해 시작 위치 i가 1 부터 irk 10보다 작거나 같을때 까지 1씩 증가한다.
// sum += i; -> 매 반복마다 sum에 i를 누적한다.
// System.out.print(i); -> i 를 출력
// 만약 i가 9보다 작거나 같을때 +가 출력된다.
// if 이외의 조건일 경우 = 하고 sum 의 값이 출력된다. *sum 은 1부터 10까지의 값이 누적되었으므로 55이다.



///////////////
public class ForTest02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // 1~10까지반복
			sum += i;              // sum = sum + i
			System.out.print(i); // 더하는수출력
			if (i <= 9) // 1~9까지는'+' 출력
				System.out.print("+");
			else { // i가10인경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈결과출력
			}
		}
	}
}
