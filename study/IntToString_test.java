public class IntToString_test {
    public static void main(String[] args) {
        int num = 456;
        
        // 형변환 (숫자를 문자열로)        
        String str1 = String.valueOf(num);
        // 정수를 문자열로 //정수, 실수, 불린 등의 값을 문자열로 변환하는 메서드
        //String이라는 내장 클래스 안에 자바가 미리 정의해 둔 메서드에 접근해서
        //그 내장 기능 중 하나를 사용하는 것이라고 보면 맞습니다
        String str2 = num + "";
        //num에 빈 문자열 ""을 더하면 자동으로 문자열로 변환돼요.

        System.out.println(str1 + "입니다"); // 출력: 456입니다
    }
}
