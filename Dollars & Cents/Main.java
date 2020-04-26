#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,dollar,cents;
  std::cin>>a>>b>>c>>d;
  dollar=a+c;
  cents=b+d;
  if(cents>100)
  {
    dollar=dollar+1;
    cents=cents-100;
  }
  std::cout<<dollar<<"\n"<<cents;
  
  
}