#include<iostream>
using namespace std;
int main()
{
  int r,x,a,b;
  std::cin>>r>>x;
  
  if(r<=(x/2))
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
  
}