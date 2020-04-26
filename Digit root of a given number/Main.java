#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0,sum=0;
  std::cin>>a;
  while(a>0)
  {
    b=a%10;
    sum=sum+b;
    a=a/10;
  }
  
  while(sum>0)
  {
    b=sum%10;
    c=c+b;
    
    sum=sum/10;
  }
  std::cout<<c;
  
}
    