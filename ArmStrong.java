package EclipseJavaCodes;

class ArmStrong
{
	private int n=0;
	private int l=0;

	ArmStrong(int x)
	{
		n=x;
		for(int i=x; i>0; i=i/10)
		{
			l++;
		}
		//System.out.println(n+" "+l);
	}

	public int sum_pow(int i)
	{
//		int sum = 0;
//		for(int x=i; x>0; x=x/10)
//		{
//			sum += Math.pow(x%10, l);
//		}
//		//System.out.println(sum);
//		return sum;
		if(i<=0) {
			
			return 0;
			
		}
	  
		return (int)Math.pow(i%10, l)+sum_pow(i/10);
	} 

	void isArmStrong()
	{
		if(n==this.sum_pow(n))
		{
			System.out.println("The number is ArmStrong");
		}
		else
		{
			System.out.println("The number is not ArmStrong");
		}
	}

	public static void main(String[] args)
	{
		ArmStrong as = new ArmStrong(370);
		as.isArmStrong();
	}
}