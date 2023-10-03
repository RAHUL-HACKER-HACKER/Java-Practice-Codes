package EclipseJavaCodes.AdvancedJava;
import java.lang.*;
class A2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("First");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RunnableInterface {
	public static void main(String[] args) throws Exception {
		A2 r=new A2();
		Thread t1=new Thread(r); 
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Second");
            Thread.sleep(1000);
		}
		


	}

}
