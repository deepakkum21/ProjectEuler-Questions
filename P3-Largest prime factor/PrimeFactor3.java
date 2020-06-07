//Prime Factor //Make it in c#
class PrimeFactor3
{
	public static void main(String arr[])
	{
		long i=2L,j,r;
		long n=600851475143L; boolean flag=true;
		while(i<=n/2)
		{
			if(n%i==0){
			r = i;
			j=2;
			while(j<=r/2)
			{
				if(r%j==0)
				{
					flag=false;
					break;
				}
				j++;
			}
			if(flag)
				System.out.print(r+" ");
			i++;
			}
			else{
			i++;continue;}
		}
	}
}