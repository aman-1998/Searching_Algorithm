import java.util.Scanner;
class Binary_Search_in_Array
{
	public static void main(String args[])
	{
		int n,l,r,mid,target,temp;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of elements in the array: ");
		n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("Enter a["+i+"] ");
			a[i]=in.nextInt();
		}
		System.out.print("\nArray:-\n");
		for(int i=0;i<=a.length-1;i++)
			System.out.print(a[i]+" ");
		System.out.print("\nEnter the element to be searched: ");
		target=in.nextInt();
		//Bubble sort
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		// end of sorting
		//Binary search
		l=0;
		r=n-1;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(a[mid]==target)
			{
				System.out.print("\n"+target+" is found in the array\n");
				System.exit(0);
			}
			else if(a[mid]<target)
				l=mid+1;
			else
				r=mid-1;
		}
		System.out.print("\n"+target+" is not found in the array\n");
	}
}