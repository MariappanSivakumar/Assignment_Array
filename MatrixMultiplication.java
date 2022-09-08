class MatrixMultiplication
{
	public static void main(String ar[])
	{
		int firstarray[][]={{1,2,3},{1,2,3}};
		int secondarray[][]={{1,4},{2,5},{3,6}};
		int F_ROW=firstarray.length;
		int F_COL=firstarray[0].length;
		int S_ROW=secondarray.length;
		int S_COL=secondarray[0].length;
		int mulStore[][]=new int[F_ROW][S_COL];
		if(F_COL!=S_ROW)
		{
			System.out.println("Please Enter the Valid Matrix");
		}
		else 
		{
			for(int i=0;i<F_ROW;i++)
			{
				for(int j=0;j<S_COL;j++)
				{
					for(int k=0;k<F_COL;k++)
					{
						mulStore[i][j]+=firstarray[i][k]*secondarray[k][j];
					}
				}
			}
		}
		for(int i=0;i<mulStore.length;i++)
		{
			for(int j=0;j<mulStore[i].length;j++)
			{
				System.out.print(mulStore[i][j]+" ");
			}
			System.out.println();
		}
	}
}
