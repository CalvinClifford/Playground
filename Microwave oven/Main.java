#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  std::cin>>a>>b;
  if(a>3)
  {
	std::cout<<"Number of items is more";
  }
  else if(a==1)
  {
    std::cout<<b;
  }
  else if(a==2)
  {
    c=b*50/100;
    std::cout<<b+c;
  }
  else if(a==3)
  {
    c=b*2;
    std::cout<<c;
  }
}