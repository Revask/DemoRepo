package personalAssignments;

public class MergeSortingRecursive {
	
	static  int[] arr = {12,-9,7,34,90,12,44,65};
	
	public static void merge(int arr[],int left[],int right[])
	{
		int lLen = left.length;
		int rLen = right.length;
		int i=0,j=0,k=0;
		while(i<lLen && j < rLen)
		{
			if(left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while(i<lLen)
			arr[k++] = left[i++];
		while(j<rLen)
			arr[k++] = right[j++];
		
	}
	public static void mergeSort(int[] inarr)
	{
		int arrlen = inarr.length;
		if(arrlen < 2)
			return;
		int leftLength = arrlen/2;
		int rightLength = arrlen - leftLength;
		int[] leftArr = new int[leftLength];
		int[] rightArr = new int[rightLength];
				
		for(int i=0;i<leftLength;i++)
				leftArr[i] = inarr[i];
		int k =0;
		for(int i=leftLength;i<arrlen;i++)
				rightArr[k++] = inarr[i];
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(inarr,leftArr,rightArr);
	}
	
	public static void main(String args[])
	{
		System.out.println("Before swap ");

		for(int i : arr)
			System.out.print(i + " , ");
		System.out.println(" ");
		mergeSort(arr);
		System.out.println("After swap ");

		for(int i : arr)
			System.out.print(i + " , ");
		System.out.println(" ");
	}

}
