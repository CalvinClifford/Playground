#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,small=0,gcd;
  std::cin>>a>>b>>c>>d;
  if(a>b)
  {
    small=b;
  }
  else
  {
    small=a;
  }
  if(small>c)
  {
    small=c;
  }
  else
  {
    small=small;
  }
  while(small>0)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  
  if(d==gcd)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
}
    