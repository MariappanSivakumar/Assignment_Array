class SortBasedOnWeight
{
	public static boolean isSquare(int n)
	{
		double sqrt=Math.sqrt(n);    
		if((sqrt - Math.floor(sqrt)) == 0)
			return true;
		return false; 
	}
	public static boolean isDivisibleBySixAndFout(int n)
	{
		if(n%4==0&&n%6==0)
			return true;
		return false;
	}
	public static boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		return false;
	}
	public static void main(String ar[])
	{
		int numbers[]={ 49,36,8,10,12};
		int value[][]=new int[numbers.length][2];
		for(int i=0;i<numbers.length;i++)
		{
			value[i][0]=numbers[i];
			if(isSquare(numbers[i])==true)
				value[i][1]+=5;
			if(isDivisibleBySixAndFout(numbers[i])==true)
				value[i][1]+=4;
			if(isEven(numbers[i])==true)
				value[i][1]+=3;
		}
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(value[i][1]<value[j][1])
				{
					int temp=value[i][0];
					value[i][0]=value[j][0];
					value[j][0]=temp;
					temp=value[i][1];
					value[i][1]=value[j][1];
					value[j][1]=temp;
				}
			}
		}
		for(int i=0;i<value.length;i++)
		{
			System.out.print("<");
			for(int j=0;j<value[i].length;j++)
			{
				System.out.print(" "+value[i][j]+" ");
			}
			System.out.print("> ");
		}
	}
}
