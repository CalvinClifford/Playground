#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  std::cin>>a;
  b=a%10;
  c=a/10%10;
  d=a/100%10;
  e=a/1000%10;
  f=b+e;
  std::cout<<f;
}