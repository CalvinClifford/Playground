#include<iostream>
using namespace std;
int main()
{
  int a,b=11,c,count=0;
  std::cin>>a;
  for(int i=1;i<10;i++)
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
    