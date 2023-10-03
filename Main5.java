package EclipseJavaCodes.AdvancedJava;
import java.lang.*;
class Even implements Runnable{
	public void run() {
		for(int i=0;i<=100;i+=2) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Odd implements Runnable{
	public void run() {
		for(int i=1;i<=100;i+=2) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Main5 {
	public static void main(String[] args) throws Exception {
		Even r1=new Even();
		Odd r2=new Odd();
//		r1.run();
//		r2.run();
		Thread t1=new Thread(r1); 
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		


	}

}
