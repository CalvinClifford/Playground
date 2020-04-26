#include<iostream>
using namespace std;
int main()
{
  int a,b=11,count=0,c;
  std::cin>>a;
  for(int i=1;i<20;i++)
  {
  c=b*b;
  b+=4;
  count++;
  if(count<=a)
  {
    std::cout<<c<<" ";
  }
  }
}