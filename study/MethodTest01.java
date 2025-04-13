///////////////////////////
// MethodTest01 이라는 클래스를 선언한다.
// main 안에 있는 메소드들은 순서대로 실행된다. / 그 밖에 것은 순서대로 실행되지 않음





////////////////////////////
public class MethodTest01 {

	//public static int i = 20;   // 모든 메소드에 포함되지 않게 밖에서 선언된 전역변수 (모든 메소드에서 사용가능함)

	
	public static int minus(int n, int m) {
		return n - m;
	}
	
    public static int sum(int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) {
		int i = 20;  
		int s;
		char a;
		
        		
		s = minus(i, 10);   // minus 메소드 호출
		System.out.println("n - m  : " + s);
		
		s = sum(i, 10);  // sum메소드 호출
		System.out.println("n + m  : " + s);
		
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}