#include<iostream>
using namespace std;
int main()
{
  int c,b;
  std::cin>>c;
  int sum=0;
  for(int a=c;a>0;a=a/10)
  {
    b=a%10;
    sum=sum+b;
  }
  if(c%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
    
}