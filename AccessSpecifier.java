package EclipseJavaCodes.AdvancedJava;
class TempJ{
	protected static int temp=500;
	static void sayHi() {
		System.out.println("Base Class:Temp");
	}
}
 
//class TempH extends TempJ{
//	System.
//	TempJ.sayHi();
//	
//}

class AccessSpecifier {

	public static void main(String[] args) {
		System.out.println(TempJ.temp);
		TempJ.sayHi();
		
		

	}

}
