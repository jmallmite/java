class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    //setWeight에 int weight 값을 저장하고 this를 통해 변수 weight에 매개변수 weight를 저장한다.
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // setweight의 99가 weight에 들어가서 getWeight는 weight=99를 반환한다.
    public int getWeight() {
        return weight;
    }
}

class Student extends Person {
    public void set() {
        age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
        name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
        height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
        // weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
        setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
    	
    	// Student 클래스를 s라는 이름으로 객체정의
    	// new Stduent() 생성자를 호출함으로서 s객체는 생성됨.
        Student s = new Student();
        s.set();
        System.out.println("나이는 :" + s.age);
        System.out.println("이름은 :" + s.name);
        System.out.println("키는 :" + s.height);
        System.out.println("키는 :" + s.getWeight());
    }
    
    
}

