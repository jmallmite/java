class TV3 {
	private int size;

	public TV3(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

public class ColorTv3 extends TV3 {
	int colors;

	public ColorTv3(int size, int colors) {
		super(size);
		this.colors = colors;
	}

	public void property() {
		System.out.println("tv의 size를 출력 : " + getSize() + "tv의  colors를 출력 : " + colors);
	}

	public static void main(String args[]) {
		ColorTv3 mytv = new ColorTv3(55, 666666);
		mytv.property();
	}
}