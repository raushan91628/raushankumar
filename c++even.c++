#include<iostream>
using namespace std;
int main()
{
   int marks;
   cout<<"enter the marks :";
   cin>>marks;
   cout<<"enter the choice :";
   switch(marks/10)
   {
                        case 10:cout<<"a";
       break;
          case 9:cout<<"b";
         break;
                            case 8:cout<<"c";
       break;
            case 7:cout<<"d";
      break;
            case 6:cout<<"e";
                     break;
                      case 5:cout<<"f";
         break;
                   case 4:cout<<"g";
             break;
                  case 3:cout<<"h";
       break;
               case 2:cout<<"i";
          break;
                     case 1:cout<<"j";
                         break;
    default:
    cout<<"wrong";
   }
   return 0;
}