package ex03;

class Printer{
	private boolean isHelloTurn = true;
	
	synchronized public void printHello() {
		while(!isHelloTurn) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hello");
		isHelloTurn = false;
		notify();
		
	}
	
	synchronized public void printWorld() {
		while(!isHelloTurn) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("World");
		isHelloTurn = true;
		notify();
		
	}
	
}


public class CurrentThreadName7 {
	
	Printer printer = new Printer();
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i =0; i<5 ; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		Runnable task2 = () -> {
			for(int i =0; i<5 ; i++) {
				System.out.println("World");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		};
			
			
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
	}

}
