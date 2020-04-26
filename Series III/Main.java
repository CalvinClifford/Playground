#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b=6,c,count=0;
  std::cin>>a;
  for(int i=1;i<11;i++)
  {
    c=b;
    b+=5*i;
    count++;
    if(count<=a)
    {
      std::cout<<c<<" ";
    }
  }
}