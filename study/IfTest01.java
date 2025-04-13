///////////////////////////////
// IfTest01 이라는 클래스를 선언
// public static void main(String[] args) -> 프로그램 시작
// 정수형 변수 number 를 선언하고 값을 10으로 저장한다.
// number == 5 -> 비교 연산으로 좌우 값이 같으면 true 아니면 false 이다.
// 만약 number와 5가 같을 경우 number의 값은 5와 같다. 가 출력된다.
// 만약의 조건에 이외의 경우에는 number의 값은 5와 같지 않다. 가 출력된다.
// number 의 값은 10으로 5와  같지 않으므로 number의 값은 5와 같지 않다. 가 출력된다.

///////////////////////////////
public class IfTest01 {
    public static void main(String[] args) {
        int number = 10;

        // If statement
        if (number == 5) {
            System.out.println("number의 값은 5와 같다.");
        } else {
            System.out.println("number의 값은 5와 같지 않다.");
        }
    }
}