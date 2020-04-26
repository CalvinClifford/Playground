#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,count=0;
  float b;
  std::cin>>a;
  for(int i=0;i<100;i++)
  {
    b=0.5*pow(3,i);
    count++;
    if(count<=a)
    {
      std::cout<<b<<" ";
    }
  }
  
}
  