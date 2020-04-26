#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(i==j)
      {
        std::cout<<i;
      }
      else
      {
        std::cout<<i<<"*";
      }
      
    }
    
    std::cout<<"\n";
    
  }
  
  for(int i=a;i>0;i--)
  {
    for(int j=1;j<=i;j++)
    {
      if(i==j)
      {
        std::cout<<i;
      }
      else
      {
        std::cout<<i<<"*";
      }
      
    }
    
    std::cout<<"\n";
    
  }
}
    