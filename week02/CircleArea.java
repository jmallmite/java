public class CircleArea{
 public static void main(String[] args) {
   final double PI = 3.14; // 원주율을상수로선언
   double radius = 10.0; // 원의반지름
   double circleArea= radius*radius*PI; // 원의면적계산
   // 원의면적을화면에출력한다.
   System.out.println("원의면적= " + circleArea);
 }
}