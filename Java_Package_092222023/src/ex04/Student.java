package ex04;

public class Student {
	private String name;
	private int age, kor, eng, math, total;
	private double avg;
	private int sum;
	
	public int sum() {
		return kor+eng+math;
					
	}
	
	public double average() {
		return (int)(sum()/3.0*100_0.5)/100.0;
	}
	
	public Student(String name, int age, int kor, int eng, int math) {
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum();
		this.avg = average();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", avg=" + avg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
