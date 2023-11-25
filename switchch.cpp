#include<iostream>
using namespace std;
int main()
{
    int a,b,ch;
    cout<<"enter the  two number:";
    cin>>a>>b;
    cout<<"enter the choice:";
    cin>>ch;
    switch(ch)
    {
        case 1:cout<<a<<"+"<<b<<"=";
        cout<<a+b;break;
        case 2:cout<<a<<"-"<<b<<"=";
        cout<<a-b;break;
        case 3:cout<<a<<"*"<<b<<"=";
        cout<<a*b;break;
        case 4:cout<<a<<"/"<<b<<"=";
        cout<<a/b;break;
        default:
        cout<<"wrong";
    }
    return 0;
}