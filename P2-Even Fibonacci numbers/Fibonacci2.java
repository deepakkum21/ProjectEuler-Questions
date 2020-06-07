//Even Fibonacci Numbers
class Fibonacci2
{
	public static void main(String arr[])
	{
		long n,s,i=1,j;
		
		
		while(i<=n/2)
		{
			int r = n/i;
			j=2;
			while(j<=r/2)
			{
				if(r%j==0)
				{
					break;
				}
				j++;
			}
			System.out.print(r+" ");
			i++;
		}
		System.out.print(sum);
	}
}