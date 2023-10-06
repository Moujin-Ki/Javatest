package ex09_Inher02;

public class ParentCat {
	public String breed;
	
	public ParentCat(String breed) {
		this.breed = breed;
	}
	public ParentCat() {}
	
	void eat() {
		System.out.println("먹다");
	}
}
