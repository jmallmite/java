
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2);           // Point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint(); // ColorPoint 객체 생성
        cp.set(3, 4);                     // Point의 set() 호출 (상속받았기 때문)
        cp.setColor("red");              // ColorPoint의 setColor() 호출
        cp.showColorPoint();             // 컬러와 좌표 출력
    }
}
