package week04;

class Mycar extends Car {
		public Mycar() {
			
		}
		
		public Mycar(int width, int height, String color) {
			// super키워드는 부모 클래스의 생성자 호출
			super(width, height, color);
		}
	}
