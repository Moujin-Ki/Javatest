package ex09_FunctionInterface;

public class ImplSampleInterface implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("이 메소드는 무조건 구현");
	}

	public void sample2() {
		System.out.println("구현하든 말든 알아서");
	}

}
