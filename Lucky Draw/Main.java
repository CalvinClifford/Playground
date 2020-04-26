#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  int sum=0;
  for(int i=2;i<=a;i++)
  {
    if(a%i==0)
    {
    sum=sum+i;
    }
  }
  if(sum==a)
  {
    std::cout<<"Eligible";
  }
  else
  {
    std::cout<<"Not eligible";
  }
}