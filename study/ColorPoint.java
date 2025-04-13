// Point를 상속받은 ColorPoint 선언
class ColorPoint extends Point {
    private String color; // 점의 색

    public void setColor(String color) { // 매개변수-- 메서드나 생성자에 값을 전달할 때 사용하는 변수,메서드를 호출할 때, 필요한 데이터를 전달해주는 역할
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}
