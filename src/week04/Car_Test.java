package week04;

public class Car_Test {
	public static void main(String[] args) {
		Car car = new Car(100, 200, "white");
		
		System.out.println("width의 값 " + car.getWidth());
		System.out.println("height의 값 " + car.getHeight());
		System.out.println("color의 값 " + car.getColor());
	}

}
