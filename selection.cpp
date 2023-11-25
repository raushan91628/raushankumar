#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int arr[20],i,j,size,min,loc,temp;
    cout<<"Enter the size of array:";
    cin>>size;
    cout<<"\nEnter the element:";
    for(i=0;i<size;i++)
    {

  cin>>arr[i];
    }
    for(i=0;i<(size-1);i++)
    {
        min=arr[i];
        loc=i;
        for( j=i+1;j<size;j++)
        {
            if(arr[j]>min)
            {
                min=arr[j];
                loc=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[loc];
        arr[loc]=temp;
    }
    cout<<"\n Enter the sorted element:";
    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;

}