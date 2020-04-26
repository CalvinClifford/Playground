#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  if(a<=200)
  {
    b=0.5*a;
    std::cout<<"Rs."<<b;
  }
  else if(a<=400)
  {
    b=0.65*a+100;
    std::cout<<"Rs."<<b;
  }
  else if(a<=600)
  {
    b=0.80*a+200;
    std::cout<<"Rs."<<b;
  }
  else
  {
    b=1.25*a+425;
    std::cout<<"Rs."<<b;
  }
}
