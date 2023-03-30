package personalAssignments;

public class SelectionSorting {
	
static int arr[] = {45,12,6,23,-90,8,5,23},small;
static void swap(int[] arr,int i,int j)
{
	//System.out.println(arr[i] + " , " + arr[j]);
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static void main(String args[]) 
{
	System.out.println("Before swap ");

	for(int i : arr)
		System.out.print(i + " , ");
	System.out.println(" ");
	/* selection sort 
	 for(int i =0;i<arr.length-1;i++)
	{
		small = i;
		for(int j = i+1;j<arr.length;j++)
		{
			if(arr[small] > arr[j])
				small = j;
		}
		swap(arr,i,small);
		
	}	 */

	/* Insertion Sort
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j>0;j--)
			if (arr[j] < arr[j-1])
				swap(arr,j,j-1);
			
	}
	/*bubble sort
	
	for(int i=0;i<arr.length;i++)
		for(int j=0;j<arr.length-1;j++)
			if(arr[j] > arr[j+1])
					swap(arr,j,j+1);*/
	
	/*Merge sort*/
	int n = arr.length;
	while(n != 1)
	{
		int mid = arr.length/2;
		
	}
	
	System.out.println("After swap ");
	for(int i : arr)
		System.out.print(i + " , ");
	System.out.println(" ");
	
	
	
}

}
