
public class MethodSampleEx {
	public static void main(String args[]) {
		MethodSample a = new MethodSample();

		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);

		System.out.println("i값 출력:" + i);
		System.out.println("j값 출력:" + j);
		System.out.println("k값 출력:" + k);

	}
}