class XPatternPrinting
{
	public static void main(String ar[])throws java.io.IOException
	{
		System.out.println("Etner the Name...:");
		String givenName=((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		if(givenName.length()%2!=0)
		for ( int firstloop=0 ; firstloop < givenName.length() ; firstloop++ )
		{
			for( int secondloop=0 ; secondloop < givenName.length() ; secondloop++ )
			{
				if(firstloop==secondloop||(firstloop+secondloop)==givenName.length()-1)
				{
					System.out.print(givenName.charAt(firstloop));
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		else System.out.println("O");
	}
}
