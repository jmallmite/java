class TV4 {
	private int size;

	public TV4(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

public class ColorTV4 extends TV4 {
	int colors;

	public ColorTV4(int size, int colors) {
		super(size);
		this.colors = colors;
	}

	public void property() {
		System.out.println("tv의 size를 출력 : " + getSize() + "tv의  colors를 출력 : " + colors);
	}

	public static void main(String args[]) {
		ColorTV4 mytv = new ColorTV4(55, 666666);
		mytv.property();
	}
}