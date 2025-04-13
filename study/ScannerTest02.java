//////////////////////////
// import 를 통해서 java.util 이라는 라이브러리 패키지에 있는 Scanner를 불러온다.
// ScannerTest02 class 를 공유하고 사용할 수 있다.
// public static void main(String[] args) -> 프로그램을 시작한다.
// Scanner에 scanner 변수를 만들어서 새로운 Scanner를 입력 받을 수 있도록 한다.
// Enter a Int : 를 출력한다.
// input에 변수 scanner가 키보드로 입력한 정수 한 개를 읽어오는 메소드 이다.
// you entered: 가 출력되고 input 값이 함께 출력된다.






import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        // Scanner 객체 생성.....
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("Enter a Int : ");
        int input = scanner.nextInt();
        
        // 입력받은 정수 출력
        System.out.println("You entered: " + input);

        // Scanner 객체 닫기
        scanner.close();
    }
}
