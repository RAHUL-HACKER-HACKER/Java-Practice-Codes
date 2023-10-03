package EclipseJavaCodes.AdvancedJava;
//Abstract class and Interface
interface Animal1{
	public static String tname="Animals";
	void speed();
	void name(String name);
}
interface FastAnimal{
	
	void run(int a);
	
	//interface allow only default and static methods with initialization;
	default void show() {
		System.out.println("I am a Dfault method of FastAnimal");
	};
	static void roar() {
		System.out.println("I am a roar method of FastAnimal");
	};
}
class Tiger implements Animal1,FastAnimal{

	@Override
	public void run(int a) {
		
		System.out.println("run:"+a);
	}

	@Override
	public void speed() {
		
		System.out.println("speed:fast");
	}

	@Override
	public void name(String name) {
		System.out.println("name:"+name);
		
	}
	
}

class Abstract {
	public static void main(String[] args) {
		Tiger animal=new Tiger();
		animal.name("tiger");
		animal.speed();
		animal.run(200);
		animal.show();
		FastAnimal.roar();
	}

}
