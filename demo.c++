#include<iostream>
using namespace std;
class room
{
    public:
    double length,breath,height;
    char Area;
    double calculate Area()
    {
        return 1*b;
    }
    double colculate volumn()
    {
        return 1*b*h;

    }
   
};
int main()
{
    room R;
    cout<<"Enter the length:";
    cin>>R.length;
    cout<<"Enter the breath:";
    cin>>R.breath;
    cout<<"Enter the height:";
    cin>>R.height;
    cout<<" Area of room"<< Area()<<endl;
    cout<<" Area of volumn"<< volumn()<<endl;
    return 0;

}