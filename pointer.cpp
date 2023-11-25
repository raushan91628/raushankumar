#include<iostream>
using namespace std;
int main()
{
    char ptr[20];
char *s;
int i,vowel=0;
cout<<"Enter the name:";
cin>>ptr;
s=ptr;
while(*s !='\0')
{
    if(*s=='a'||*s=='e'||*s=='i'||*s=='o'||*s=='u'||
    *s=='A'||*s=='E'||*s=='I'||*s=='O'||*s=='U')
    {
 vowel++;

    }
    s++;
}
cout<<" count of vowel:"<<vowel;
return 0;

}