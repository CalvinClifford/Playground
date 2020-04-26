#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  int p,q,r;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  p=a*b/100;
  q=d*e/100;
  r=g*h/100;
  a=a-p+c;
  d=d-q+f;
  g=g-r+i;
  std::cout<<"In Flipkart Rs."<<a<<"\n"<<"In Snapdeal Rs."<<d<<"\n"<<"In Amazon Rs."<<g<<"\n";
  if(a<d&&a<g)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(d<a&&d<g)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else if(g<a&&g<d)
  {
    std::cout<<"He will prefer Amazon";
  }
  else if(a==d)
  {
    std::cout<<"He will prefer Flipkart";
  }
}