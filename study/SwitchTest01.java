///////////////////////
// SwitchTest01 이라는 클래스를 선언한다.
// public static void main(String[] args) -> 프로그램 시작
// day 라는 정수형 변수에 3을 저장한다.
// String 을 통해 문자 dayName 을 변수로 선언한다.
// *switch 조건문은 내가 찾는 조건을 찾는 조건문, 변수 값이 어떤 경우(case) 에 해당하는지 선택해서 실행하는 조건문, 어떤 값이 들어왔는지 보고 그 값에 해당하는 case로 전환해서 해당되는 코드만 실행 -> switch
// case, break, default 는 예약어 이다.
// switch (day) -> switch 문은 day 가 어떤 값인지에 따라 실행할 코드를 선택한다.
// day 는 3 이라는 값을 지녔으므로 case: 3 에 해당하는 Tuesday 가 저장되고 break
// System.out.println 을 통해 The day is Tuesday 가 출력된다. 
// default 는 case 1~7 중에 찾는 값이 없으면 사용되는 예약어로 이 경우 The day is Invalid day 가 출력되게 된다.

///////////////////////
public class SwitchTest01 {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // Switch statement
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
    }
}
