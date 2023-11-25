#include<iostream>
using namespace std;
int main()
{
    int votercount;
    cout<<"Enter the total number of voter:";
    cin>>votercount;

    int ballot[10]={0};
    while(votercount > 0)
    {
        int voter;
        cout<<"\ncast of voter:";
        cin>>voter;
        switch( voter>=1 && voter<=9)
        {
            case 1:ballot[voter]++;
            break;
            case 0:ballot[0]++;
        }
        votercount--;
    }
    for( int i=1;i<10;i++)
    {
        cout<<"\n candidate of voter:"<<i<<":->"<<ballot[i];
    }
    cout<<"\n individual vote:"<<ballot[0];
    return 0;
}