public class NotebookEx2 {

	public static void main(String args[]) {
		Notebook2 nb2 = new Notebook2();
		
		nb2.makeNotebook();
		System.out.println("CPU 는 ? " + nb2.getCpu());
		System.out.println("메모리 값은? :" + nb2.getMemory());
		System.out.println("국가는? :" + nb2.getcountry());
		System.out.println("회사는? :" + nb2.getCompany());		
	}
}
