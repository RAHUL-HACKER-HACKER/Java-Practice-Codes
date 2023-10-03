package EclipseJavaCodes.AdvancedJava;
import java.lang.*;
class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Rahul");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B{
	public void display() {
		
	}
}
class ThreadClass1 {
	public static void main(String[] args) throws Exception {
		A t1=new A();
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Anand");
            Thread.sleep(1000);
		}
		


	}

}
