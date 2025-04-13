///////////////////////
// ForTest03 이라는 이름의 클래스를 만듬
// public static void main(String[] args) -> 프로그램 시작
// i 라는 변수를 1부터 시작해서 3까지 1씩 증가하며 반복한다.
// ============를 출력한다.
// ***  i 변수의 값이 출력되고 i 값이 출력되게 된다.
// for 문 안에 j 변수에 대한 for 문이 하나 더 있는데 이걸 중첩 반복문이라고 한다.
// 중첩 반복문은 i 가 한번 반복할 때 마다 j는 다시 1부터 3까지 반복하기 때문에 1부터 3까지를 3번 실행하게 된다.
// 실행 결과는 ===================
//          i 변수의 값은: 1이 출력되면
//          j는 1부터 3까지 출력된다 *println 으로 줄바꿈을 하며 j 변수의 값은: 이라는 문자와 1 2 3 이 출력된다.
///////////////////////
public class ForTest03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("=======================");
        	System.out.println("*** i변수의 값은: " + i);
            
            for (int j = 1; j <= 3; j++) {
                System.out.println("j변수의 값은: " + j);
            }
        }
    }
}

