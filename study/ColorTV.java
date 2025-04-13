
public class ColorTV extends TV {
	private int colors;
	private String company;
	private String country;
	/*
	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;
	}
	*/

	/*
	public ColorTV() {
		
	}
	*/
	
	// 생성자 메쏘드
	public ColorTV(int size, int colors, String company, String country) {
		super(size);
		this.colors = colors;
		this.company = company;
		this.country = country;
	}
	
	
	public void printProperty() {
		System.out.println("사이즈:" + getSize() );
		System.out.println("색상 : " + colors);
		System.out.println("제조사 :" + company);
		System.out.println("나라 :" + country);
	}
	

}