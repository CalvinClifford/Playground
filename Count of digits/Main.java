#include<iostream>
int main()
{
  int a,b,sum=0;
  std::cin>>a;
  if(a==0)
  {
    sum=1;
  }
  while(a>0)
  {
    sum=sum+1;
    a=a/10;
  }
  std::cout<<sum;
    
}