#include<iostream>
int main()
{
  int a,b,small=0,gcd=0;
  std::cin>>a>>b;
  if(a>b)
  {
    small=b;
  }
  else
  {
    small=a;
  }
  
  while(small>0)
  {
    if(a%small==0 && b%small==0)
    {
      gcd=small;
      std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
      break;
    }
    small--;
  }
  
}