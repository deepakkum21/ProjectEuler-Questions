//Multiples of 3 and 5
class Multiples1
{
	public static void main(String arr[])
	{
		int i=0,j=1,s=0;
		while(i<1000)
		{
			if(i%3==0 || i%5==0)
				s = s+i;
			i++;
		}
		System.out.println("Sum = "+s);
	}
}