import java.util.*;
public class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int low=0;
		int high=a.length;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==t)
			{
				System.out.println(mid);
				break;
			}
			else if(mid<t)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			
		}
		
	}
}