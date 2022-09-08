class SortElementBasedOnPosition
{
	public static void main(String ar[])
	{
		int valueContainer[]={ 1,2,3,4,5,6,7,8,9,10};
		java.util.Arrays.sort( valueContainer );
		int leftPointer=valueContainer.length/2,rightPointer=valueContainer.length/2;
		System.out.print(valueContainer[valueContainer.length/2]+" ");
		while ( leftPointer != 0 && rightPointer != valueContainer.length)
		{
			leftPointer--;
			rightPointer++;
			if(rightPointer!=valueContainer.length)System.out.print(valueContainer[rightPointer]+" ");
			System.out.print(valueContainer[leftPointer]+" ");
		}
			
	}
}
