import java.util.Scanner;
class Linear_Search_in_Array
{
	public static void main(String args[])
	{
		int n,i,j,target;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of elements in the array: ");
		n=in.nextInt();
		int[] a=new int[n];
		for(i=0;i<=a.length-1;i++)
		{
			System.out.print("Enter a["+i+"] ");
			a[i]=in.nextInt();
		}
		System.out.print("\nEnter the element to be searched: ");
		target=in.nextInt();
		for(i=0;i<=a.length-1;i++)
		{
			if(a[i]==target)
			{
				System.out.print("\n"+target+" is found");
				System.exit(0);
			}
		}
		System.out.print("\n"+target+" is not found");
	}
}