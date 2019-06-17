#include<stdio.h>
#include<stdlib.h>
int Binary_Search(int a[],int n,int l,int target,int r);
int main()
{
    int n,i,target;
    printf("Enter no. of elements in the array: ");
    scanf("%d",&n);
    int *a=(int*)malloc(n*sizeof(int));
    if(a==NULL)
    {
        printf("\nMemory can't be allocated\n");
        exit(1);
    }
    for(i=0;i<=n-1;i++)
    {
        printf("Enter a[%d] ",i);
        scanf("%d",a+i);
    }
    printf("\nEnter the element to be searched: ");
    scanf("%d",&target);
    int check=Binary_Search(a,n,0,target,n-1);
    if(check==1)
        printf("\n%d is found\n",target);
    else
        printf("\n%d is not found\n",target);
    return 0;
}
int Binary_Search(int a[],int n,int l,int target,int r)
{
    int mid,i,j,temp;
    //Bubble Sorting
    for(i=0;i<=n-2;i++)
    {
        for(j=0;j<=n-2-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    //End of sorting
    while(l<=r)
    {
        mid=(l+r)/2;
        if(a[mid]==target)
            return 1;
        else if(a[mid]<target)
            l=mid+1;
        else
            r=mid-1;
    }
    return 0;
}
