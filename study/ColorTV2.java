class TV2 {
	int size;

	public TV2(int size) {
		this.size = size;
	}

	public int getSize(){
		return size;}
}

public class ColorTV2 extends TV2 {
	int colors;

	public ColorTV2(int size, int colors) {
		super(size);
		this.colors = colors;		
	}

	public void printProperty() { 
    	System.out.println("colors변수의 값은 : " + colors + "size변수의 값은 : " + getSize() );
    }

	public static void main(String args[]) {
		ColorTV2 mytv = new ColorTV2(55, 100);
    	mytv.printProperty();
    }

	
}