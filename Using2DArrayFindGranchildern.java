class Using2DArrayFindGranchildern
{

	public static void main(String ar[])throws java.io.IOException
	{
		int count=0;
		String[][] childernandfather={{"Luke","Shaw"},
					{"Wayne","Rooney"},
					{"Rooney","Ronaldo"},
					{"Shaw","Rooney"},
					{"Neha","Rooney"},
					{"Siva","Rooney"}};
		System.out.println("Enter the character name...:");
		String characterName=((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		for( int firstloop=0 ; firstloop<childernandfather.length ; firstloop++ )
		{
			if ( childernandfather[firstloop][1].equals( characterName ) )
			{
				for( int secondloop=0 ; secondloop < childernandfather.length ; secondloop++ )
				{
					if ( childernandfather[secondloop][1].equals( childernandfather[firstloop][0] ) )
					{
						count++;
					}	
				}
			}
		}
		System.out.println(characterName+" "+count+"Grand Children");
	}
}
