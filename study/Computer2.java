public class Computer2 {
	private int cpu;
	private int memory;
	private String country;
	private String company;	
	
	// 생성자
    public Computer2() {
    	System.out.println("이것은 computer2 생성자 메소드 입니다.");
    	this.company = "삼성";
    }

	// 생성자
    public Computer2(String company) {
    	System.out.println("이것은 computer2 생성자 메소드 입니다.");
    	this.company = company;
    }

    public void setCpu(int cpu) {
		this.cpu = cpu;
	}
    
    public int getCpu() {
		return cpu;
	}
    
	public void setMemory(int memory) {
		this.memory = memory;
	}
    
    public int getMemory() {
		return memory;
	}
    
    public void setcountry(String country) {
    	this.country = country;
    }
    
    public String getcountry() {
    	return country;
    }

    public String getCompany() {
    	return company;
    }
    
    
}
