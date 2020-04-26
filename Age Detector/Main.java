#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b;
  if(a==0)
  {
    a=1900;
    b=1900+b;
    c=b-a;
    std::cout<<c;
  }
  else if(b==0)
  {
    a=1900+a;
    b=2000;
	c=b-a;
    std::cout<<c;
  }
  else if((a<b)&&(a!=0))
  {
    c=b-a;
    std::cout<<c;
  }
  else if((a>b)&&(b!=0))
  {
    a=1900+a;
    b=2000+b;
    c=b-a;
    std::cout<<c;
  }
 
  
}