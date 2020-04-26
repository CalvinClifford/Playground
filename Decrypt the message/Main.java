#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b;
  c=a+b;
  int n;
  int sum=0;
  int i=1;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    {
      sum=sum+i;
      
    }
  }
 
  if(sum==c)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}