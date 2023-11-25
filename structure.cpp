#include <iostream>
using namespace std;
struct employee
{
  string Designation;
  int id;
  char name[25];
  int age;
  long salary;
};
int main()
{
  int n;
  cout << "\n enter the nmber of employee:";
  cin >> n;
  employee e;
  for (int i = 0; i < n; i++)
  {
    
    cout<<"enter the designation of employee:";
    cin>>e.Designation;
    cout << "enter the employee id:";
    cin >> e.id;
    cout << "enter the employee name:";
    cin >> e.name;
    cout << "enter the employee age:";
    cin >> e.age;
    cout << "enter the employee salary:";
    cin >> e.salary;
  }
  cout << "\n ----details of employee:";
  for (int i = 0; i < n; i++)
  {
    cout << "\nid  :" << e.id;
    cout << "\nname  :" << e.name;

    cout << "\nage  :" << e.age;
    cout << "\nsalary  :" << e.salary;
    cout << endl;
  }

  return 0;
}





