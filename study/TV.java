class TV { // TV 라는 클래스를 선언
	private int size; // 정수형 변수 size가 이 클래스 내부에서만 접근 가능하다.

	public TV(int size) { // TV는 클래스 이름과 똑같기 때문에 생성자 객체이다./ int size는 생성자에 값을 전달할 수 있게 해주는 매게변수
		this.size = size; // 생성자로 전달된 size 값을, 클래스 안의 size 안에 저장해라
	}

	protected int getSize() { // 같은 패키지 또는 자식 클래스에서 사용가능하다./ getSize
		return size;
	}
}