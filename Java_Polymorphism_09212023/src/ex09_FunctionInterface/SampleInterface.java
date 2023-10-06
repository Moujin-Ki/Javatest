package ex09_FunctionInterface;

@FunctionalInterface //추상메소드가 1개만 존재
public interface SampleInterface {
	void sample();
	//void sample2() {}; 인스턴트 메소드
	
	default void sample2() {}; // 디폴트메소드는 작성 가능
}
