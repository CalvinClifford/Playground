#include<iostream>
int main(){
  int a,b,f;
  std::cin>>a;
  f=1;
  for(int i=1;i<=a;i++)
  {
    f=f*i;
  }
  std::cout<<f;
}