#include<iostream>
using namespace std;
int main()
{
  float a,p;
  int b,c;
  std::cin>>a>>b>>c;
  p=a*b;
  if(p>=c)
  {
	std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
}