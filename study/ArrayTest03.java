//////////////////////////////
// ArrayTest03 클래스를 선언한다.
// public static void main(String[] args) -> 프로그램을 시작한다.
// int[][] -> 2차원 배열 선언, matrix 라는 배열을 생성, { } 안에 있는 배열의 값을 통해 배열 초기화
//  	0	1	2
// 0	1	2	3  
// 1	4	5	6
// 2	7	8	9          // 가로 행, 세로 열 // matrix[행][열] -> matrix[0][0] = 1, matrix[1][2] = 6, matrix[2][1] =8
//
// i = 0일 때                                                                   
// matrix[0] = {1, 2, 3} → 0번째 행                               
//
// j = 0 → matrix[0][0] = 1
//
// j = 1 → matrix[0][1] = 2
//
// j = 2 → matrix[0][2] = 3
//
// 출력: 1 2 3
//
// 📌 i = 1일 때
// matrix[1] = {4, 5, 6}
//
// j = 0 → matrix[1][0] = 4
//
// j = 1 → matrix[1][1] = 5
//
// j = 2 → matrix[1][2] = 6
//
// 출력: 4 5 6
//
// 📌 i = 2일 때
// matrix[2] = {7, 8, 9}
//
// j = 0 → matrix[2][0] = 7
//
// j = 1 → matrix[2][1] = 8
//
// j = 2 → matrix[2][2] = 9
//
// 출력: 7 8 9
//
//2차원 배열: matrix.lenth -> 3 (3개의 행 즉 3개의 배열), matrix[0].length -> 3 (첫 번째 행의 열 개수)
//***  matrix[행][열]
// int[][] 에서 먼저 지정한 순서대로 첫번째 []를 i, 두번째 []를 j 라고 생각하면 된다.
//* + 연산이 나오면 문자열이 먼저 나오든 숫자가 먼저 나오든 모두 문자열로 출력된다.
// 0~3 0, 1, 2 바깥 반복문
// 0~0 0, 1, 2 안쪽 반목문
// 1~1 0, 1, 2 안쪽 반복문
// 2~2 0, 1, 2 안쪽 반복문

///////////////////////////////
public class ArrayTest03 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2차원 배열 요소 출력
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}