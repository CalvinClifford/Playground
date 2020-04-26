#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,even=0,odd=0;
  std::cin>>a;
  b=a%10;
  a=a/10;
  c=a%10;
  a=a/10;
  d=a%10;
  a=a/10;
  if(b%2!=0 && b!=7)
  {
    odd=odd+b;
  }
  if(b%2==0 && b!=7)
  {
    even=even+b;
  }
  if(c%2!=0)
  {
    odd=odd+b;
  }
  if(c%2==0)
  {
    even=even+b;
  }
  if(d%2!=0)
  {
    odd=odd+b;
  }
  if(d%2==0)
  {
    even=even+b;
  }
  if(e%2!=0)
  {
    odd=odd+b;
  }
  if(e%2==0)
  {
    even=even+b;
  }
  if(even==odd)
  {
    std::cout<<"Yes";
  }
  if(even!=odd)
  {
	std::cout<<"No";
  }
    
}