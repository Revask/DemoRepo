package personalAssignments;
import java.util.Arrays;
import java.util.Collections;

class Triplets implements Comparable<Triplets>
{
	int x,y,z;
	public Triplets(int a,int b,int c)
	{
			x=a;
			y=b;
			z=c;
	}
	
	@Override
	public int compareTo(Triplets t)
	{
		//System.out.println(this.z);
		return this.z - t.z;
	}
	
}

public class SortArrayOfTriplets 
{
	
	public static void main(String args[])
	{
		Triplets arr[] = new Triplets[4];
		arr[0] = new Triplets(3,2,8);
		arr[1] = new Triplets(13,7,5);
		arr[2] = new Triplets(0,12,18);
		arr[3] = new Triplets(45,5,-8);	
		
		Arrays.sort(arr);
		for(Triplets t : arr)
		{
			System.out.println("X : " + t.x + " Y : " + t.y + " Z : " + t.z);
		}
		
	}	

}
