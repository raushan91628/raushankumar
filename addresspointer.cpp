#include<iostream>
using namespace std;
int main()
{
    int n;
    int *ip;
    ip=&n;
    cout<<"Enter the value:";
    cin>>n;
    cout<<n<<endl;
    cout<<" Enter the address:";
    cout<<ip<<endl;
    cout<<" Enter the value of number:";
    cout<<*ip<<endl;
    return 0;
}