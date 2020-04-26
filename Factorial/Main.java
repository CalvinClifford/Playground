#include<iostream>
int main()
{
  int a,b=1,i=1;
  std::cin>>a;
  while(i<=a)
  {
    b=b*i;
    i++;
  }
  std::cout<<"The factorial of "<<a<<" is "<<b;
}