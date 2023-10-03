package javaPrograms;



class Mobile<T>{
	T s;
	T i;
	
	Mobile(T s,T i){
		
		this.s=s;
		this.i=i;
		
		
	}
	<T>void disp() {
		
		System.out.println("mobile name :"+s);
		System.out.println("imei info number :"+i);
		
		
	}
	
}

class DataTypeFree{
	
	public static void main(String[] args) {
		
		System.out.println("main()");
		Mobile m=new Mobile("redmi",12347);
		m.disp();
		
		
		
	}
	
}
