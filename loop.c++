#include<iostream>
using namespace std;
class friendfunc
{
     float a,b,c,d,e;
     friend void cal_avg(friendfunc &f);
     
          public:
          void get_data()
          {
               cout<<"Enter 5 values \n";
               cin>>a>>b>>c>>d>>e;

          }
};
void cal_avg(friendfunc &f)
{
     float a,b,c,d,e,avg;
     avg=(a+b+c+d+e) / 5;
     cout<<"average="<<avg;

     
}
int main()
{
     friendfunc ob;
     ob.get_data();
     cal_avg(ob);
   

}