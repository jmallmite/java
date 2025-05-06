package week04;

public class Car {
	// 멤버 필드
	int width;
	int height;
	String color;

	// 생성자
	public Car() {

	}

	public Car(int width, int height, String color) {
		this.width=width;
		this.height=height;		
		this.color=color;
	}

	// 멤버 메쏘드
	public int getWidth() {
		return this.width;
	}

	// 멤버 메쏘드
	public int getHeight() {
		return this.height;
	}
	
	public String getColor() {
		return this.color;
	}
}
