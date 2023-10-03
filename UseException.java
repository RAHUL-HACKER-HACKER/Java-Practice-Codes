package EclipseJavaCodes;

class WrongGPAException extends Throwable
{
	WrongGPAException(String s)
	{
		super(s);
	}
}

class WrongAgeException extends Throwable
{
	WrongAgeException(String s)
	{
		super(s);
	}
}


class Person
{
	String name;
	int age;
	char gender;
	float height;
	float weight;

	Person(String n, int a, char g, float h, float w) throws WrongAgeException 
	{
		if(a>30 || a<16)
			throw new WrongAgeException("You have entered a wrong age"); 
		name = n;
		age = a;
		gender = g;
		height = h;
		weight = w;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
	}
}

class Student extends Person
{
	byte Year;
	float GPA;
	boolean pf;
	int rank;

	Student(String n, int a, char g, float h, float w, byte y, float gp, boolean p, int r) throws WrongAgeException, WrongGPAException
	{
		super(n, a, g, h, w);
		if(gp>10 || gp<0)
			throw new WrongGPAException("You have entered a wrong GPA");
		Year = y;
		GPA = gp;
		pf = p;
		rank = r;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Year: "+Year);
		System.out.println("GPA: "+GPA);
		System.out.println("Pass/Fail: "+pf);
		System.out.println("Rank: "+rank);
		
	}
}

class Use
{
	public static void main(String[] args) throws WrongAgeException, WrongGPAException
	{
		Student s[] = {
			new Student("Raam", 17, 'M', 5.8f, 65, (byte)2, 1.83f, true, 9),
			new Student("Sita", 17, 'F', 5.6f, 57, (byte)2, 8.83f, true, 2),
			new Student("Mohan", 12, 'M', 5.11f, 72, (byte)3, 8.73f, true, 1),
		};

		for(int i=0; i<3; i++)
		{
			s[i].display();
			System.out.println();
			System.out.println();
		}
	}
}