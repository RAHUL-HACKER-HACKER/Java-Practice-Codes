package EclipseJavaCodes.AdvancedJava;
class A3 extends Thread{
	public void run() {
		String n=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {
			System.out.println(n);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ThreadScheduler {

	public static void main(String[] args) {
		A3 t1=new A3();
		A3 t2=new A3();
		A3 t3=new A3();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();



	}

}
