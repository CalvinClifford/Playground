#include<iostream>
using namespace std;
int main()
{
  int a,d;
  int b;
  std::cin>>a>>b;
  int c=(int)b;
  d=(int)c;
  if(a>13)
  {
	if(d!=13)
    {
      std::cout<<"$8.00";
    }
    else
    {
      std::cout<<"$5.00";
    }
  }
  else
  {
    if(d!=13)
    {
      std::cout<<"$4.00";
    }
    else
    {
      std::cout<<"$2.00";
    }
  }
}