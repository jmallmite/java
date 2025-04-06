///////////////////////////////
// ArrayTerst02 라는 클래스가 선언된다.
// public static void main(String[] args) -> 프로그램 시작
// int[] numbers = new int[5] -> 정수형 배열 numbers를 선언하고 그곳에 5칸짜리 배열을 새로 만든다는 뜻이다.
// 배열 0번째에는 10, 배열 1번째 위치에는 20을 저장한다. / 배열 4번째 위치에는 50을 저장한다.
// for 문을 통해서 i = 0 부터 시작하여 i<5 까지 1 씩 증가하며 반복한다.
// System.out.println("Element at index " + i + ": " + numbers[i]); -> 에서 i가 0이 출력되면  number[0] 은 0번째 위치에서의 값인 10이 출력된다./ Element at index 4: 50


///////////////////////////////
public class ArrayTest02 {
    public static void main(String[] args) {
        // 고정 크기 배열 선언 및 초기화
        int[] numbers = new int[5];

        // 배열 요소 설정
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

    }
}
