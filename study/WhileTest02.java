///////////////////
// WhileTest02 라는 클래스를 선언한다.
// public static void main(String[] args) -> 프로그램 시작
// 정수형 변수 count 에 0을 저장한다.
// 조건이 true인 while 반복문으로 Count is: 0, Count is: 1 이런 식으로 줄바꿈을 하며 4까지 실행된다.
// 그러다가 count 가 1씩 증가하여 5가 되었을때 if문이 실행된다. 하지만 break 를 통해 반복문이 즉시 종료된다.
// 반복이 멈춘 뒤 System.out.println을 통해 Loop exited 가 출력이 된다.


///////////////////
public class WhileTest02 {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("Count is: " + count);
            count++;

            // Break the loop when count reaches 5
            if (count == 5) {
                break;
            }
        }

        System.out.println("Loop exited.");
    }
}